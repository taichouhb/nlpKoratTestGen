import sys
#MUST ALSO INPUT ALL CUSTOM CLASSES THE SYSTEM USES AFTER THE FILENAME


primitiveList = ["boolean", "byte", "char", "double", "int", "long", "short", "float"]
# otherKeyWords = ["abstract", "assert", "break", "case", "catch", "class", "continue", \
# 				"deault", "do", "else", "enum", "final", "finally", "for", "if", \
# 				"instanceof", "interface", "native", "new", "package", "private", "protected", \
# 				"public", "return", "static", "super", "strictfp", "switch", "synchronized", \
# 				"this", "throw", "throws", "transient", "try", "void", "volatile", "while"]

otherKeyWords = ["abstract", "assert", "break", "case", "catch", "class", "continue", \
				"default", "do", "else", "enum", "final", "finally", "for", "if", \
				"instanceof", "interface", "native", "new", "package", "private", "protected", \
				"public", "return", "static", "super", "strictfp", "switch", "synchronized", \
				"this", "throw", "throws", "transient", "try", "void", "volatile", "while"]


def parseClassVariables(startClass, customClassNames):
	foundMainClass = False
	stack = []
	foundVars = {} #Map key: type, value: variable name

	with open(startClass + ".java", "r") as f:
		for line in f:
			if foundMainClass==False:
				if line.contains("class startClass"):
					foundMainClass = True
					stack.append("{")
			elif len(stack) > 0:#we're already within the main class definition. Now look for class variables
			#This keeps checking only within the main class block. 
				#Todo: Find variables

				if line.contains("{"):
					stack.append("{")
				if line.contains("}"):
					stack.pop()
				if len(stack) == 1: #Current line of code is not in a method block. Should be in highest level of class block
					#ie a class Variable? 















def main():
	print(parseClassVariables(sys.argv[1], sys.argv[2:]))


if __name__ = "__main__":
	main()
