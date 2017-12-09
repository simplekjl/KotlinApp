package Interfaces


//interfaces are always open in Kotlin
interface Operations {
    fun sum( n1 : Int , n2 : Int)
    fun div( n1 : Int , n2 : Int)
}


class Calculator : Operations
{
    override fun sum(n1: Int, n2: Int) {
        println("suma : " + (n1 +n2))
    }

    override fun div(n1: Int, n2: Int) {
        println("div : " + (n1 +n2))
    }

}

class MaximunCalculator2018 : Operations{
    override fun sum(n1: Int, n2: Int) {
        return println("suma de $n1 + $n2 : "+ (n1+n2))
    }

    override fun div(n1: Int, n2: Int) {
        var result = n1/n2
        return println("Division de $n1 / $n2 : " + result.toString())
    }

}

fun main(args: Array<String>){

    var calculator = Calculator()
    println("Operations ")
    calculator.sum(2,3)
    calculator.div(4,5)

    var maxCalculator = MaximunCalculator2018()

    println("Operations for the Max calculator")
    maxCalculator.div(3,1)
    maxCalculator.sum(3,4)


}