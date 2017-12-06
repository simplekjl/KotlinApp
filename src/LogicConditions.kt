fun main(args: Array<String>) {

    println("Please enter your grade")
    var grade = readLine()!!.toDouble()

    //When example -> replaces switch from JAVA
    whichGradeIAm(grade)
    //function to print the value
    giveMeMyGrade(grade)
}

fun giveMeMyGrade( a: Double){

    println(" You have said your grade is : $a")
}

fun whichGradeIAm( points : Double){

    when(points){
         in 100.0 .. 90.0 -> println("You are level A")
         in 90.0  .. 80.0 -> println("You are level B")
         in 80.0  .. 70.0 -> println("You are level C")
         else             -> println("You are not into the approved levels but you are still awesome, keep working")
    }
    /*if (grade >= 90) {
        println("You are in level A")
    } else if(grade >= 80 && grade <90){
        println("You are in level B")
    } else if(grade >= 70 && grade < 80){
        println("You are level C")
    }else{
        println("You are not level A but we are still proud of you")
    }*/
}