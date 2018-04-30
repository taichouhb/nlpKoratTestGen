import re

primitiveList = ["boolean", "byte", "char", "double", "int", "long", "short", "float"]

otherKeyWords = ["abstract", "assert", "break", "case", "catch", "class", "continue", \
				"default", "do", "else", "enum", "final", "finally", "for", "if", \
				"instanceof", "interface", "native", "new", "package", "protected", \
				"return", "static", "super", "strictfp", "switch", "synchronized", \
				"this", "throw", "throws", "transient", "try", "void", "volatile", "while"]

ignoredKeywords = ["public", "private"]

def findComments(givenFile):
    f = open(givenFile,'r')
    lines = f.readlines()

    lineCount = 1
    inComment = 0
    commentsDict = {}
    numOfCommentSections = 0
    for line in lines:

        for word in line.split(" "):
            if "/*" in word:
                inComment = 1
                numOfCommentSections+=1
                commentsDict[numOfCommentSections] = ""

            if "*/" in word:
                inComment = 0

            if inComment == 1:
                commentsDict[numOfCommentSections] = commentsDict[numOfCommentSections] + word + " "

    # for key in commentsDict.keys():
    #     print(str(key) + ") " + commentsDict[key] + "\n\n")

    return commentsDict

def findCommentsAndCorrespondingCode(givenFile):
    return findComments(givenFile)

def findNL_JavaDoc_Sections(givenComment):
    inJavaDocSection = 0
    NLPString = ""
    JavaDocString= ""
    for word in givenComment.split(" "):
        # print(word)
        if "@" in word:
            inJavaDocSection = 1

        if inJavaDocSection == 0:
            NLPString += " " + word
        else:
            JavaDocString += " " + word


    NLPString = NLPString.replace("/*", "")
    # print("NLPString = " + NLPString)
    # print("JavaDocString = " + JavaDocString)
    return NLPString, JavaDocString

def getVarsFromJava(JavaDocString):
	print("JavaDocString = " + JavaDocString)

	variables = {}
	text = ""
	splitJavaDoc = JavaDocString.split()

	for i in range(0, len(splitJavaDoc)):
		#print(i, ") ", splitJavaDoc[i])
		if "@" in splitJavaDoc[i]:
			variables[splitJavaDoc[i+1]] = {"type": splitJavaDoc[i], "text": splitJavaDoc[i+2:]}
	#
	# for var in variables.keys():
	# 	fullText = ""
	# 	endOfText = 0
	# 	for word in variables[var]:
	# 		if word.startswith("@"):
	# 			endOfText = 1
	#
	# 		if endOfText == 0:
	# 			fullText = fullText + word + " "
	#
	# 	variables[var]["text"] = fullText



	for var in variables.keys():
		fullText = ""
		for word in variables[var]["text"]:
			fullText = fullText + word + " "

		correctText = ""
		endOfText = 0
		for word in fullText:
			if word.startswith("@"):
				endOfText = 1

			if endOfText == 0:
				correctText = correctText + word + " "

		variables[var]["text"] = fullText

		for var in variables.keys():
			print(var, ": ", variables[var])

	return variables

def generateRepOk(something):
    NLPString, JavaDocString = findNL_JavaDoc_Sections(something)
    # print("NLPString = " + NLPString)
    # print("JavaDocString = " + JavaDocString)
    variables = getVarsFromJava(JavaDocString)

commentsDict = findCommentsAndCorrespondingCode("TowersOfHanoi.java")

# for key in commentsDict.keys():0.
#     print(str(key) + ") " + commentsDict[key] + "\n\n")

generateRepOk(commentsDict[2])
