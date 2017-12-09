class Operations()
{

    //Expression body form
    fun sum(n1: Int , n2 : Int) : Int = n1+n2
    fun div(n1 : Int , n2 : Int) : String
    {
        return if (n1>0)
            (n1/n2).toString()
        else
            "Operation not Valid"
    }
}

fun main (args : Array<String>){

    var op = Operations()
    var sum = op.sum(3,5)
    println("Suma : $sum")
    var div = op.div(9,3)
    println("Division : $div")
}