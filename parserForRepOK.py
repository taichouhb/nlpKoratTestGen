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
        # print(str(lineCount) + ") " + line)
        # lineCount+=1

        for word in line.split(" "):
            if word.startswith("/*"):
                inComment = 1
                numOfCommentSections+=1
                commentsDict[numOfCommentSections] = ""

            if word.startswith("*/"):
                inComment = 0


            if inComment == 1:
                commentsDict[numOfCommentSections] = commentsDict[numOfCommentSections] + word + " "

    for key in commentsDict.keys():
        print(str(key) + ") " + commentsDict[key])




def findCommentsAndCorrespondingCode(givenFile):
    findComments(givenFile)

findCommentsAndCorrespondingCode("TowersOfHanoi.java")
