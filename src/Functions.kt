
//Function with return type
fun sum(n1: Int , n2 :Int) : String {
    var result = n1+n2
    return "of $n1+$n2 : $result"
}
fun sum(set : Array<Int>,i : Int)
{
    var result = set[i]+ set[i+1]
    displayResult("of "+set[i]+"+"+set[i+1]+": $result" )
}

fun displayResult(value: String){
    println("value $value")
}
fun main(args: Array<String>){

    println("----------Example of functions part1--------")
    var set = arrayOf<Int>(2,3,4,5,6,7,45,23)
    var n = 0 //used to iterate inside the array
    for (index in  0 until set.size-1){
        if (index.rem(2) == 0) {
            displayResult(sum(set.get(index), set.get(index+1)))
        }
    }

    println("\n----------Example of functions with overloading-------------")
    (0 until set.size)
            .filter {it.rem(2)==0}
            .forEach {sum(set,it)}
}