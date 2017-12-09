/**
 * Constructors
 * 1 . Class level constructor, where the class itself will be innitialized ,constructor with no parameters
 * 2. contructor with parameters
 *
 */

class HouseConstructor()
{
    var type : String? = null
    var price : Int = 0
    var owner: String? = null
    var sold : String? = "Available"

    constructor(type: String , price: Int , owner:String) : this(){
        this.type = type
        this.price = price
        this.owner = owner
    }
    constructor(sold : Boolean) : this(){
        this.sold = (if(sold) "Not Available" else "Available").toString()
    }

    fun wholeDetails(): String? = "Type : $type | Price : $price | Owner : $owner"

}


fun main(args: Array<String>){
    var myHouse = HouseConstructor("Hometown",100000,"Jose Luis Crisostomo")

    println("Type of the house: ${myHouse.type}")

    println("Details \n"+myHouse.wholeDetails())

    println("\n\n Seems that the house just got sold! Dang!")
    var mySoldHouse = HouseConstructor(true)
    println(mySoldHouse.sold)
}