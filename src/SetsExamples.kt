

fun main(args: Array<String>){

    //inmmutable object
    var setElement = setOf(1,2,55,63,3)
    //setElement.add(9) // not allowed
    println("No mutable set")
    for (item in setElement){
        println("value : $item")
    }


    var set2 = mutableSetOf("jose","Luis","Crisostomo")
    set2.add("Sanchez")
    println("\n Mutable set")
    for (item in set2){
        println("value : $item")
    }

}