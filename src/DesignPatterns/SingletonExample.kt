package DesignPatterns

class Singleton{
    var name : String? = null

    // to prevent to let acces this constructor
    private constructor(){
        println("Instance has been created")
    }

    companion object {
        val instance: Singleton by lazy { Singleton() }
    }

}

fun main(args : Array<String>){
    var s1 = Singleton.instance

    s1.name = "Jose"

    println(s1.name)

    var s2 = Singleton.instance
    s2.name = "Luis"

}