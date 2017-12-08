fun main(args: Array<String>) {

    for (item in 1..10) {
        //block of code
        if (item == 2) {
            println("item value: $item")
        }
        when (item) {
            4 -> println("item value has reached 4")
            5, 6 -> println("item value : $item")
        }

    }


    println("----------While Loop---------")
    var count = 0
    while (count < 4) {
        println("count value: $count")
        count++
    }


    println("---------Do-While-Loop ------")

    var counter = 6
    do {
        println("counter value: $counter")
        counter--
        //this loop is going to print the values of the counter and decrees it
    } while (counter > 0)


    println("----------Control Loop------------")
    for (count in 1..10) {
        if (count == 3) {
            continue // this line will make the program continue to the next step into the loop
        }
        println("Dang! count is : $count")
    }

    println("----------Break Loop------------")
    for (count in 1..10) {
        if (count == 3) {
            println("You have reach the number $count")
            for (c in 1..2) {
                break // this line will make the program to go out of the loop
            }
        }
        println("Dang! count is : $count")
    }

    println("----------Break Loop with annotation ------------")
    loop@for (count in 1..10) {
        if (count == 3) {
            println("You have reach the number $count")
            for (c in 1..2) {
                break@loop // this line will make the program to go out of the loop
            }
        }
        println("Dang! you have break with annotation at : $count")
    }

}