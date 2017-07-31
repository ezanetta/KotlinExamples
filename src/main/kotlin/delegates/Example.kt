package delegates

class LazyProperty {
    val lazy: Int by lazy {
        println("Calculate the value")
        42
    }

    val notLazy = 10
}

fun main(args: Array<String>) {

    println("--- creation ---")
    val property = LazyProperty()

    println("--- normal property --- ${property.notLazy}")

    println("--- first access to lazy property --- ${property.lazy}")

    println("--- second access to lazy property --- ${property.lazy}")
}