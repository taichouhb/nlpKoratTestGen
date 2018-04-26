import sys
#MUST ALSO INPUT ALL CUSTOM CLASSES THE SYSTEM USES AFTER THE FILENAME

# def parseJavaDoc(file):



def parseClassVariables(startClass, customClassNames):
	foundMainClass = False
	stack = []
	with open(startClass + ".java", "r") as f:
		for line in f:
			if foundMainClass==False:
				if line.contains("class startClass"):
					foundMainClass = True
					stack.push("{")
			elif len(stack) > 0:#we're already within the main class definition. Now look for class variables
			#This keeps checking only within the main class block. 
				#Todo: Find variables

				if line.contains("{"):
					stack.push("{")
				if line.contains("}"):
					stack.pop()












def main():
	print(parseClassVariables(sys.argv[1], sys.argv[2:]))


if __name__ = "__main__":
	main()
