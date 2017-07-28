package classes.Inheritance


fun main(args: Array<String>) {

    val dog = Dog("Pipi", "Labrador")
    dog.hi()
    dog.bye()

    val person = Person()
    println("Person ${person.name}")
}
