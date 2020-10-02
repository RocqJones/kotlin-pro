package my.program
import java.util.*

// To create an empty array, use emptyArray<T>() factory function:
val empty = emptyArray<String>()

fun main(args: Array<String>) {
    // To create an array with given size and initial values, use the constructor
    val strings = Array<String>(size=5, init = {index-> "Item #$index"})
    print(Arrays.toString(a))
    print(a.size)
}
