package my.program

//  you can deﬁne the main function of a Kotlin program using a Companion Object of a class.
class App {
    companion object {
        @JvmStatic fun main(args: Array<String>) {
            println("Hello World with Companion Object")
        }
    }
}