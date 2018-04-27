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


def parseClassVariables(startClass, customClassNames):
	foundMainClass = False
	stack = []
	foundVars = {} #Map key: type, value: variable name
	foundVars[startClass] = {}
	classesFound = [] 
	f = open(startClass + ".java", "r")
	lines = f.readlines()
	f.close()
	print("reading file")
	i = 0
	while foundMainClass==False and i < len(lines):
		line = lines[i]
		# print(line)	
		if "class " + startClass in line:
			foundMainClass = True
			stack.append("{")
		i+=1
	print("found main class")
	while len(stack) > 0 and i < len(lines):#we're already within the main class definition. Now look for class variables
	#This keeps checking only within the main class block. 
		line = lines[i]
		# print(line)
		if "{" in line: #TODO: Corner case, where a line may have more than 1 of these
			stack.append("{")
		if "}" in line: #TODO: Corner case, where a line may have more than 1 of these
			stack.pop()
		if len(stack) == 1 and len(line) > 3: #Current line of code is not in a method block. Should be in highest level of class block
			#ie a class Variable? 
			print(line)
			relevant = True
			for w in otherKeyWords:
				if w in line:
					relevant = False
			if relevant == True:
				line = line.strip()
				if line.startswith("public"):
					line = line[6:]
				if line.startswith("private"):
					line = line[7:]
				tokens = line.strip().rstrip(";").split(" ")
				if tokens[0] not in primitiveList:
					classesFound.append(tokens[0])
				# print(tokens)
				if tokens[0] not in foundVars[startClass]:
					foundVars[startClass][tokens[0]] = []
				foundVars[startClass][tokens[0]].append(tokens[1])
		i+=1
	return foundVars, classesFound
















def main():
	print(parseClassVariables(sys.argv[1], sys.argv[2:]))


if __name__ == "__main__":
	main()
