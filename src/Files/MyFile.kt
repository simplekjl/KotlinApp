package Files

import java.io.FileReader
import java.io.FileWriter

fun main(args: Array<String>) {


    println("Please enter a new string: ")
    var value: String = readLine()!!
    WriteToFile(value+"\n")
    println("This is how the file looks like ")
    ReadFromFile()

}

fun WriteToFile(str: String) {

    try {
        var fo = FileWriter("test.txt", true)
        fo.write("\n" + str)
        fo.close()
    } catch (ex: Exception) {
        println(ex.message)
    }

}

fun ReadFromFile() {
    try {
        var fin = FileReader("test.txt")
        var c: Int?
        do{
            c=fin.read()
            print(c.toChar())
        }while (c!=null)

    } catch (ex: Exception) {
        println("Problem reading the file")
    }
}