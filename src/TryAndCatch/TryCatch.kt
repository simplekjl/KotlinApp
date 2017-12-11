package TryAndCatch

fun main(args:Array<String>){

    try {
        println("Please enter a number:")
        var n2: Int = readLine()!!.toInt()
        var div = 100 / n2
        println("Div: $div")
    }catch (exception : Exception){
        println(exception.message)
    }
}