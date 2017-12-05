
/*
Operations Rules
1. ()
2. ++, -- increments and decrements (before var)
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
    //adding before operations
    sum= ++n1+n2 // (++x)= (x=x+1) , (--x) = (x=x-1)
    println("The value will be added before start operating, result: $sum")

    //substracting before
    sum2 = (--n1-n2).toFloat()
    println("sum 2: $sum2")

    //operating after
    var sum3 : Int = n1+++n2
    println("sum 3 : $sum3")


    var sum4 : Int = (n2*n1)
    println("sum 4 : $sum4")
}