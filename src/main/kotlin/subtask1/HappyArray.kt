package subtask1

import javax.print.attribute.IntegerSyntax

class HappyArray {


   lateinit var  happi1: IntArray

    var index = 0
    lateinit var myArray: IntArray

    fun convertToHappy(sadArray: IntArray): IntArray {
        var happi:IntArray
        var badArray1 = intArrayOf()



            happi1 = myHappy(sadArray)
            index = 0

            happi = myHappy(happi1)
            while (index != 0) {
                happi = myHappy(happi)
                happi = myHappy(happi)
            }


            print("index     =  $index")



            return happi


    }

    private fun myHappy(sadArray: IntArray): IntArray {


        myArray = intArrayOf(sadArray[0])
        for (i in 1..sadArray.size - 2) {
            index=0
            if (sadArray[i] < (sadArray[i - 1] + sadArray[i + 1])) {
               myArray += sadArray[i]

            }
            else{index++}
        }

        myArray  += sadArray[sadArray.size - 1]
       print(myArray.joinToString())
        println()

        return myArray
    }
}

