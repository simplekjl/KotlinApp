fun main(args : Array<String>){

    var n1 : Int = 10
    var n2 : Int = 20
    var max = if(n1<n2) n1 else n2
    println("max: $max")

    //when
    var age = 30

    var isYoung = when(age){
        30 -> true
        else -> false
    }

    println("is he young? : $isYoung ")
}