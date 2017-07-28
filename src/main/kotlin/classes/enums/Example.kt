package classes.enums

class Dev(val name: String, val type: TypeDeveloper, val favouriteColor: Color)

fun main(args: Array<String>) {
    val dev = Dev("Matias", TypeDeveloper.BACKEND, Color.GREEN)

    println("${dev.name} is a ${dev.type} developer and his favourite hex color is ${dev.favouriteColor.hex}")
}