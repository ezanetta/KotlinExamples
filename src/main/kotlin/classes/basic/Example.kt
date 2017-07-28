package classes.basic

fun main(args: Array<String>) {
    val androidDev = AndroidDev("Ezequiel")
    val webDev = WebDev("Ricardo").printName()
    var kotlinDev: KotlinDev = KotlinDev("Jake Warthon")
    kotlinDev = KotlinDev("Jake Warthon", 25)
}