package properties

class Properties(val name: String, val values: List<String>) {

    val isEmpty: Boolean
        get() = this.values.isEmpty()

    lateinit var lateInit: String
    private val privateVar = "privateVar"

    var nameLength: Int = 0
        get() = field
        set(value) {
            // custom logic for this setter
            field = value - 2
        }
}

fun main(args: Array<String>) {
    val properties = Properties("Riccardo", arrayListOf())
    println("IsEmpty? ${properties.isEmpty}")
    properties.nameLength = 8
    println(properties.nameLength)
}