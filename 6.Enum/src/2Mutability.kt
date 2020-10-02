package my.program

enum class Planet(var population: Int = 0) {
    EARTH(7 * 100000000),
    MARS();

    override fun toString() = "$name[population = $population]"
}

fun main(args:Array<String>) {
    println(Planet.MARS)

    // initialize
    Planet.MARS.population = 3
    println(Planet.MARS)

    println(Planet.EARTH)
}