import sys
#MUST ALSO INPUT ALL CUSTOM CLASSES THE SYSTEM USES AFTER THE FILENAME
import pdb

primitiveList = ["boolean", "byte", "char", "double", "int", "long", "short", "float"]
# otherKeyWords = ["abstract", "assert", "break", "case", "catch", "class", "continue", \
# 				"deault", "do", "else", "enum", "final", "finally", "for", "if", \
# 				"instanceof", "interface", "native", "new", "package", "private", "protected", \
# 				"public", "return", "static", "super", "strictfp", "switch", "synchronized", \
# 				"this", "throw", "throws", "transient", "try", "void", "volatile", "while"]

otherKeyWords = ["abstract", "assert", "break", "case", "catch", "class", "continue", \
				"default", "do", "else", "enum", "final", "finally", "for", "if", \
				"instanceof", "interface", "native", "new", "package", "protected", \
				"return", "static", "super", "strictfp", "switch", "synchronized", \
				"this", "throw", "throws", "transient", "try", "void", "volatile", "while"]

ignoredKeywords = ["public", "private"]

def classVarHelper(relPath, startInput, customClassNames): 
	foundMainClass = False
	startClass, startFile = startInput
	stack = []
	foundVars = {} #Map key: type, value: variable name
	foundVars[startClass] = {}
	customClassesFound = set() 
	f = open(relPath + startFile + ".java", "r")
	lines = f.readlines()
	f.close()
	i = 0
	while foundMainClass==False and i < len(lines):
		line = lines[i]
		
		if "class " + startClass in line:
			foundMainClass = True
			stack.append("{")
		i+=1
	while len(stack) > 0 and i < len(lines):#we're already within the main class definition. Now look for class variables
	#This keeps checking only within the main class block. 
		line = lines[i]
		
		for c in line:
			if c=="{":
				stack.append("{")
			elif c=="}":
				stack.pop()	

		if len(stack) == 1: #Current line of code is not in a method block. Should be in highest level of class block
			#ie a class Variable? 
			relevant = True 
			for w in otherKeyWords:
				for t in line.split(" "):
					if t==w or t=="{":
						relevant = False
					

			if relevant == True:
				# print(line)
				line = line.strip()
				if line.startswith("public"):
					line = line[6:]
				if line.startswith("private"):
					line = line[7:]
				tokens = line.strip().rstrip(";").split(" ")
				if len(tokens) > 1:
					# print(line)
					if tokens[0] in [i[0] for i in customClassNames]:
						customClassesFound.add(tokens[0])
					
					if tokens[0] not in foundVars[startClass]:
						foundVars[startClass][tokens[0]] = []
				
					foundVars[startClass][tokens[0]].append(tokens[1])
		i+=1
	return (foundVars, customClassesFound)

#start Input: (startClass, startFile)
#customClassNames: [(Class, File), (Class, File), etc]
def parseClassVariables(relPath, startInput, customClassNames):
	
	foundVars, customClassesFound = classVarHelper(relPath, startInput, customClassNames)
	#Now, iterate through the list of customClasses and find the variables in there.
	listed = list(customClassesFound)
	classToFile = dict(customClassNames)
	customClassesFound.add(startInput[0])
	while len(listed) > 0:
		className = listed.pop(0) #remove first element in list
		foundVars[className] = {}
		i_found, i_set = classVarHelper(relPath, (className, classToFile[className]), customClassNames )
		foundVars[className] = i_found[className]
		for i in i_set:
			if i not in customClassesFound:
				listed.append(i)
				customClassesFound.add(i)

	return foundVars



def main():
	#"Class.Filename"
	inp = sys.argv[2].split(".")
	startInput = (inp[0], inp[1])
	arr = []
	for val in sys.argv[3:]:
		vals = val.split(".")
		arr.append((vals[0], vals[1]))
	print(parseClassVariables(sys.argv[1], startInput, arr))


if __name__ == "__main__":
	main()

#python parser.py ./ RaceFreeTest.RaceFreeTest threadThing.RaceFreeTest syncObject.RaceFreeTest

#output
#{'syncObject': {'int': ['value']}, 'RaceFreeTest': {'String': ['hat'], 'boolean': ['tree'], 'syncObject': ['once', 'twice']}}

#python parser.py examples/ DoublyLinkedList.DoublyLinkedList Entry.Entry ListObject.ListObject

#output
#({'DoublyLinkedList': {'int': ['size'], 'Entry': ['header']}, 'Entry': {'Entry': ['next', 'previous'], 'ListObject': ['element']}, 'ListObject': {'int': ['myID']}}, {'DoublyLinkedList', 'Entry', 'ListObject'})