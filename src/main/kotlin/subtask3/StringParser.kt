package subtask3

class StringParser {
    var result = arrayOf("simple", "input", "string")
    // TODO: Complete the following function
    fun getResult(inputString: String): Array<String> {

        var result1 = myparseString(inputString)
        result1.forEach {
            println(it)
        }
       // print(result1.joinToString())
        return result1
    }

    private fun myparseString(inputString: String): Array<String> {
        var splitString: Array<String>
       var splitString2 = arrayOf<String>()
        splitString = inputString.split("{","(","[","<").toTypedArray()
        for (i in splitString.indices)
            if (splitString[i].indexOfAny(charArrayOf('}', ')', '>',']')) >= 0) {

                splitString[i] = splitString[i].replace("}", "")
                splitString[i] = splitString[i].replace(")", "")
                splitString[i] = splitString[i].replace(">", "")
                splitString[i] = splitString[i].replace("]", "")

                splitString2 += splitString[i].trim()
                   // println(splitString[i])


            }

        return splitString2
    }
}
