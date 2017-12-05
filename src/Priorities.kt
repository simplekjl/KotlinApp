
/*
Operations Rules
1. ()
2. ^ - pow out
3. Multiplication or division * | /
4. Addition or subtraction + | -
5. Equals =

 */


fun main(args : Array<String>){
    var n1 : Int = 10
    var n2 : Int =  20
    var n3 : Int = 5
    var sum: Int?
    var sum2 : Float?
    sum= n1+n2*n3-3 //107
    var sum3 : Int = (((n1+n2)*n3)*3)
    var sum4 : Int = (n2*n1)
    sum2 = (((n1+n2)*n3)*8/(n2*n1)*5).toFloat()
    println("sum: $sum")
    println("sum 2: $sum2")
    println("sum 3 : $sum3")
    println("sum 4 : $sum4")
}