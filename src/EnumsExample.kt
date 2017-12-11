enum class Direction{
    NORTH, SOUTH, EAST, WEST
}

fun main(args : Array<String>){
    var userDirection = Direction.SOUTH
    if (userDirection == Direction.NORTH){
        println(" the user is going to the north")
    }else{
        println("I do not know where is he going")
    }
}