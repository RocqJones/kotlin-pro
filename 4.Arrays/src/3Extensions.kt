package my.program

// average() is deﬁned for Byte, Int, Long, Short, Double, Float and always returns Double:
fun main(args: Array<String>) {
    val doubles = doubleArrayOf(1.5, 3.0, 2.1)
    print(doubles.average())

    val ints = intArrayOf(1,4)
    println("\n" + ints.average())
}