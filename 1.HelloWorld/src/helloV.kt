package my.program

// variation that instantiates the class to do the actual "hello":
class helloV {
    companion object {
        @JvmStatic fun main(args: Array<String>) {
            helloV().run()
        }
    }

    fun run() {
        println("Hello Jones")
    }
}