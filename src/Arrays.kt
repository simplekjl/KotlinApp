fun main(args : Array<String>){

    var arrayInt =  Array<Int>(5){9}

    arrayInt[2] = 3

    for(element in arrayInt){
        println("item: $element")

    }
    // Creates an Array<String> with values ["0", "1", "4", "9", "16"]

    val asc = Array(5, { i -> (3 * i).toString() })
    print("Array 2 : ")
    for (item in asc){
        print("$item | ")
    }

    println("\n---------Other operations --------")
    val x: IntArray = intArrayOf(1, 2, 3)
    x[0] = x[1] + x[2]
    print(" array 3 : ")
    for(item in x){
        print("$item | ")
    }


    println("\n-----------A little bit more active with user -----")
    var arrStr = Array<String>(4){""}
    var str : Array<String>?
    for (index in 1..3){
        println("Insert element $index : " )
        arrStr[index] = readLine()!!
    }
    println("The final array looks like this: " )
     for (item in arrStr){
        print("$item ")}
}

