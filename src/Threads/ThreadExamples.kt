package Threads

fun main(ar: Array<String>) {

    var t1 = UserThread("1")
    t1.start()
    var t2 = UserThread("2")
    t2.start()
    var t3 = UserThread("3")
    t3.start()
    // this instruction will make wait until this thread has finished
    t3.join()
    println("The process has end")

}


class UserThread : Thread {
    var ThreadName: String? = null

    constructor(ThreadName: String) : super() {
        this.ThreadName = ThreadName
    }

    override fun run() {
        //write logic for the process
        var count = 0
        println("Thread: $ThreadName")
        while (count < 10) {
            println("value: $count")
            count++
            try {
                Thread.sleep(1000)
            } catch (ex: Exception) {
                println(ex.message)
            }
        }
    }
}