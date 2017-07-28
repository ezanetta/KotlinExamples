package functions.extensions


fun main(args: Array<String>) {
}

fun String.bePolite(): String {
    return "$this, please"
}

fun Int.isEven(): Boolean = this % 2 == 0

// TODO INFIX NOTATION https://kotlinlang.org/docs/reference/functions.html
infix fun Int.isBiggerThan(number: Int) = this > number