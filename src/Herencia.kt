open class Operations()
{
    var name : String ? = null
    //can be access from this class and the classes that are inhereting from me
    protected var name2 : String ? = "Hola"
    //Variable que sera solo visible por esta clase
    private var name3 : String? = "noo"
    //Expression body form
    fun sum(n1: Int , n2 : Int) : Int = n1+n2
    fun div(n1 : Int , n2 : Int) : String
    {
        return if (n1>0)
            (n1/n2).toString()
        else
            "Operation not Valid"
    }
    //function that is open to be overrided
    open fun sum2(n1: Int , n2 : Int) : Int = n1+n2

}

//Way to inherit in Korlin
//all classes and functions in Kotlin are final
class MultipleOperations() : Operations(){
    fun mul(n1: Int , n2:Int) : Int = n1*n2
    fun sub(n1:Int , n2: Int) : Int = n1-n2

    override fun sum2(n1: Int, n2: Int): Int {
        return n1  + (n2*3)
    }

    fun getName(){
        super.name
    }
}

fun main (args : Array<String>){

    var op = MultipleOperations()
    var sum = op.sum2(3,5)
    println("Suma : $sum")
    var div = op.div(9,3)
    println("Division : $div")

    var subs = op.sub(5,3)
    println("resta : $subs")
    var mul = op.mul(4,5)
    println("Multiplication: $mul")




}