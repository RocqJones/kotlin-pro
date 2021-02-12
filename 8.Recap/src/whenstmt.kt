package my.program

fun main(args: Array<String>) {
    val number_of_fish = 40
    when(number_of_fish){
        0 -> println("Empty Tank")
        in 1..39 -> println("Got a fish")
        else -> println("That's a lot of fish!")
    }
}