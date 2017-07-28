package classes.Inheritance

open class Animal(val name: String) {

    init {
        println("This animal is called $name")
    }

    open fun hi() {
        println("Animal says hi!")
    }

    fun bye() {
        println("Bye")
    }
}

class Dog(name: String, val breed: String) : Animal(name) {

    override fun hi() {
        println("Dog says hi!")
    }
}

open class Human(open val name: String = "Juan")

class Person(override var name: String = "Nicolas") : Human(name)

