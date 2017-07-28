package controlStructures

enum class Color {
    BLUE, ORANGE, RED
}

fun updateWeather(celsiusDegrees: Double): Pair<String, Color> {
    val description: String
    val color: Color
    when {
        celsiusDegrees < 0 -> {
            description = "cold"
            color = Color.BLUE
        }
        celsiusDegrees in 0..15 -> {
            description = "mild"
            color = Color.ORANGE
        }
        else -> {
            description = "hot"
            color = Color.RED
        }
    }

    return Pair(description, color)
}

fun main(args: Array<String>) {
    println(updateWeather(-2.0)) // cold blue
}