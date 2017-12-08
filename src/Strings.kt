import java.util.*

/**
    Use of string and some options for Kotlin
 **/


fun main(args : Array<String>){

    var title : String = "Hello, Welcome to new York"

    println("$title")
    println("This is the String: "+title)

    println(" ---------- Operations on Strings --------")

    println(title.toUpperCase())
    println(title.toLowerCase())
    println("Accessing the String as Array : "+ title[0])
    println("Splitting where there is an space\" \" : "+title.split(" "))
    print("Using trim : "+ title.trim().capitalize())

}