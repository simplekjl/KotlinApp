import java.util.*

fun main(args: Array<String>){

    println("Please enter your age")
    var age : Int = readLine()!!.toInt()
    println("You said your age is: $age")
    var yob : Int = Calendar.getInstance().get(Calendar.YEAR) - age
    println("So we know a that your year of birth is: $yob")
}