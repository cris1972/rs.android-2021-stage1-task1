package subtask2

class BillCounter {
    var res= 0
    // TODO: Complete the following function
    // The output could be "Bon Appetit" or the string with number(e.g "10")
    fun calculateFairlySplit(bill: IntArray, k: Int, b: Int): String {

       countRright(bill,k)
        var resaultBill: String

        if(res==b)
        {

       return  "bon appetit"}
        else{
            res=b-res
            return  res.toString()
        }
    }

    private fun countRright(bill: IntArray, k:Int) {
        bill[k] = 0

        for(i in 0..bill.size - 1){
            res=res+bill[i]
        }
        res /= 2

    }
}
