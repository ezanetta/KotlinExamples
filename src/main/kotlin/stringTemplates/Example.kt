package stringTemplates

fun main(args: Array<String>) {
    val name = "Ricardo"
    val lastName = "Fort"
    val car = "Rolls-Royce"
    val city = "maiameee"

    println("A $name $lastName le gusta pasear en su $car por ${city.toUpperCase()}")

    // Strings in Kotlin can include references to variables that are interpolated
    // In addition to simple variable references, they can also include any expression enclosed in curly braces.
}

