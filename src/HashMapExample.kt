

fun main(args : Array<String>){

    var map = HashMap<Int,String>()

    map.put(1,"Jose")
    map.put(2,"Luis")
    map.put(33,"Crisostomo")
    println(map.get(33)+"\n")

    map.put(33,"Crisostomo Sanchez")
    for (k in map.keys){
        print(map.get(k)+" ")
    }



    println("\n\n------------ More Examples ---------")

    var map2 = hashMapOf(1 to "Jose",90 to "Sanchez")
    map2.put(3,"Mandy")
    map2.put(56,"Android")
    var key = 90
    var key2 = 56
    println("value for key $key: "+ map2.get(key))
    println("Value for key $key2: "+map2[key2])

}