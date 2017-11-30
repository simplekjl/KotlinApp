fun main(args: Array<String>){
    print("Enter name: ")
    var name : String = readLine()!!
    print("Enter age: ")
    var age = readLine()!!.toInt()
    print("Enter department: ")
    var dep : String? = readLine()

    println("\nNew Values")
    println("Employee name: $name")
    println("Employee age: $age")
    println("Employee department: $dep")

}