package my.program

private lateinit var fullUrl : String

fun main(args: Array<String>) {
    val myurl = "https://stackoverflow.com/questions/47974064/"
    fullUrl = myurl
    print("The new url is:" + fullUrl)
}