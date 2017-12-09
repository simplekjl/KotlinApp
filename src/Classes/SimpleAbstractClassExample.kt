package Classes

import com.sun.tools.internal.xjc.reader.xmlschema.bindinfo.BIConversion

abstract class credit()
{
    fun CreditID(): String {
        return "34234234"
    }
    // abstract method
    abstract fun newCredit() : String

}

class UserInfo() : credit()
{
    //Because is an abstract method we need to create the implementation on the same in the inhereted class
    override fun newCredit() : String {
        return "25452"
    }

}

fun main(args:Array<String>){

//    var credit = credit()
//
//    println(credit.CreditID())

    /*
    While using Abstract classes the methods and values will be available just once we inherit not with the instance itself
     */

    var newCredit = UserInfo()
    println(newCredit.CreditID())
    println(newCredit.newCredit())
}