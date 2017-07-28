package functions.lambdas

fun main(args: Array<String>) {
    println(higherOrder("maiameeeeee", ::upperCase))
}

fun higherOrder(value: String, op: (String) -> String): String {
    println("Executing the operation $op")
    return op(value)
}

fun upperCase(value: String) = value.toUpperCase()