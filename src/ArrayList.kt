

fun main( args : Array<String>){

    var arrList = ArrayList<String>()
    arrList.add("Jose")
    arrList.add("Luis")
    arrList.add("Crisostomo")
    arrList.add("Sanchez")

    println("First name: ${arrList.get(0)}")

    //Changing the variables

    arrList.set(0,"Pepe")

    println("First name (again): ${arrList[0]}")


    //printing all the elements
    for (item in arrList){
        println("$item")
    }

    //Search
    println("\nSearching into arrays")
    var name = "Pepe"
    if (arrList.contains(name)){
        println("I found the element: $name"  )
    }else
    { println("Not found in the array: $name")}


    println("\nPrint element by index -------")

    for (index in 0 until arrList.size){
        print(arrList.get(index) + " ")
    }

}