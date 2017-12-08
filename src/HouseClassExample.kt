class House(type: String , price: Int , owner:String)
{
    var type : String? = null
    var price : Int = 0
    var owner: String? = null
    init {
        this.type = type
        this.price = price
        this.owner = owner
    }
fun wholeDetails(): String? = "Type : $type | Price : $price | Owner : $owner"

}


fun main(args: Array<String>){
    var myHouse = House("Hometown",100000,"Jose Luis Crisostomo")

    println("Type of the house: ${myHouse.type}")

    println("Details \n"+myHouse.wholeDetails())
}