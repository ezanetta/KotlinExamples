package functions.lambdas

fun main(args: Array<String>) {
    basicSyntax()
    shortSyntax()
}

fun basicSyntax() {
    val sum = { x: Int, y: Int -> x + y }

    val sum1: (Int, Int) -> Int = { x, y -> x + y } // drug

    println(sum(2, 3)) // 5
    println(sum1(3, 7)) // 10
}

fun shortSyntax() {
    val string = "one, two, three, 6, 7, four"

    println(string.filter({ c: Char -> c in 'a'..'z' })) // onetwothreefour

    string.filter() { c: Char -> c in 'a'..'z' }

    string.filter { c: Char -> c in 'a'..'z' }

    string.filter { c -> c in 'a'..'z' }

    string.filter { it in 'a'..'z' }

    string.filter {
        it in 'a'..'z'
    }

}