package functions.basic

fun main(args: Array<String>) {

}

// TODO Unit replaces void (java). If your function don't return anything you can omit it
fun helloDev(message: String): Unit {
    println("Hello $message")
}

fun sum(x: Int, y: Int): Int {
    return x + y
}

// TODO single-line expression function
fun anotherSum(x: Int, y: Int) = x + y

// TODO default arguments
fun multiplyByTwoOrMore(x: Int, y: Int = 2) = x * y

// TODO Named arguments. Ej: helloMessage(uppercase = true, name = "Your name")
fun helloMessage(message: String = "Hi", uppercase: Boolean = false,
                 goodByeMessage: String = "Bye!", name: String) {

    val finalMessage = "$message $name $goodByeMessage"
    println(upperCase(uppercase, finalMessage))
}

fun upperCase(active: Boolean, message: String): String {
    return if(active) message.toUpperCase() else message
}
