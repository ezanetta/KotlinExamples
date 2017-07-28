package variables

fun main(args: Array<String>) {
    // Mutable
    var name: String = "Ricardo"
    name = "Guido"

    println(name)

    // Immutable - Cannot be reassigned. Like final in Java
    val lastName = "Fort"
}

