package Generics

class UserAdmins<T> (credit : T){

    //initializing
    init {
        println(credit)
    }

}

fun <T> display(process:T){
    println(process)
}


fun main(args:Array<String>){

    var credit = UserAdmins<String>("1,000,000")
    var creditInt = UserAdmins<Int>(100)
    var creditDouble = UserAdmins<Double>(1000000.0)

    display<String>("Hols Jose")
}