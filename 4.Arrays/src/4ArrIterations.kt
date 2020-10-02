package my.program

fun main(args: Array<String>) {
    // Java enhanced loop iteration
    val asc = Array(5, {i -> (i * i).toString() })
    for(s: String in asc) {
        println(s)
    }

    print("*******************" + "\n")

    // For loop iteration
    val shs = Array(5, {i -> (i * i).toString() })
    for(n in shs){
        println(n)
    }
}