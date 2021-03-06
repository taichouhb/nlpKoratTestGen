#Output: a string which is the finitization method which must be added to the Java file

#Input: dictionary

#Dictionary Format: Each class is a key: values are more dictionaries
#Secondary dictionary maps from class/primitive type to list of variable names


#Scenarios

#Class made up of classes

#Class made up of classes and primitives

#Class made up of primitives
import parser
import sys

def finitizationGen(startClass, classDictionary):
    header = "public static IFinitization fin" + startClass + \
            "(int size){\n" + \
            "  IFinitization f = FinitizationFactory.create(" + startClass + ".class);"  
    
    allClasses = classDictionary.keys()
    primitives = ["int", "short", "long", "double", "float", "boolean", "char", "byte"]
    
    presentPrimitives = set()

    for iclass in allClasses:
        secondMap = classDictionary[iclass]
        secondKeys = secondMap.keys()
        for key in secondKeys:
            if key in primitives:
                presentPrimitives.add(key)

    #Object and Primitive Set construction

    setString = ""
    for iclass in allClasses:
        setString += "IObjSet " + iclass.lower() + \
                "Set = f.createObjSet(" + iclass + ".class, true);\n"
        setString += iclass.lower() + \
                "Set.addClassDomain(f.createClassDomain(" + iclass + ".class, size));\n"

    capitalization = {
            "int" : "Int",
            "short" : "Short",
            "long" : "Long",
            "double" : "Double",
            "float" : "Float",
            "boolean" : "Boolean",
            "char" : "Char",
            "byte" : "Byte"
            }
    
    for primitive in presentPrimitives:
        if(primitive != "char"):
            capital = capitalization[primitive]
            setString += "I" + capital + "Set " + primitive + "Set = f.create" + \
                    capital + "Set(0, size);\n"

    structureString = ""
    
    firstMap = classDictionary[startClass]
    firstKeys = firstMap.keys()
    for key in firstKeys:
        if(key != "char"):
            names = firstMap[key]
            for name in names:
                setString += "f.set(\"" + name + "\", " + key.lower() + "Set);\n"

    for iclass in allClasses:
        if(iclass != startClass):
            theMap = classDictionary[iclass]
            theKeys = theMap.keys()
            for key in theKeys:
                if(key != "char"):
                    names = theMap[key]
                    for name in names:
                        setString += "f.set(" + iclass + ".class, \"" + name + "\", " + key.lower() + "Set);\n"

    tail = "return f;\n}\n}"
    toReturn = header + "\n" + setString + "\n" + structureString + "\n" + tail
    return toReturn


# print(finitizationGen("DoublyLinkedList", {'DoublyLinkedList': {'int': ['size'], 'Entry': ['header']}, 'Entry': {'Entry': ['next', 'previous'], 'ListObject': ['element']}, 'ListObject': {'int': ['myID']}}))
# print(finitizationGen("DoublyLinkedList", parser.parseClassVariables("examples/dll/", ("DoublyLinkedList", "DoublyLinkedList"), [("Entry", "Entry"), ("ListObject", "ListObject")])))


if __name__ == '__main__':
    inp = sys.argv[2].split(".")
    startInput = (inp[0], inp[1])
    arr = []
    for val in sys.argv[3:]:
        vals = val.split(".")
        arr.append((vals[0], vals[1]))
    p = parser.parseClassVariables(sys.argv[1], startInput, arr)
    print(p)
    print(finitizationGen(startInput[0], p))
