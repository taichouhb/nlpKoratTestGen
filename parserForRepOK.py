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
    JavaDocStringDict = ""
    for word in givenComment.split(" "):
        print(word)
        if "@" in word:
            inJavaDocSection = 1

        if inJavaDocSection == 0:
            NLPString += " " + word
        else:
            JavaDocStringDict += " " + word


    NLPString = NLPString.replace("/*", "")
    print("NLPString = " + NLPString)
    print("JavaDocStringDict = " + JavaDocStringDict)

def generateRepOk(something):
    findNL_JavaDoc_Sections(something)



commentsDict = findCommentsAndCorrespondingCode("TowersOfHanoi.java")

# for key in commentsDict.keys():
#     print(str(key) + ") " + commentsDict[key] + "\n\n")

generateRepOk(commentsDict[2])
