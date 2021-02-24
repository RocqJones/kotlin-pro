package my.program

fun main(args: Array<String>) {
    val string = "hello@world.com"
    val url = "https://youtu.be/snqMchRhQnk"

    val domain: String? = string.substringAfterLast("@")
    val extractId: String? = url.substringAfterLast("youtu.be/")

    println(domain)
    println(extractId)
}