package classes.abstract

abstract class Animal {
    abstract fun run()
    abstract fun jump()
}

abstract class AnimalWithName {
    abstract val name: String
}

class Dog : Animal() {

    override fun run() {
        println("Dog is running")
    }

    override fun jump() {
        println("Dog is jumping")
    }
}

class Cat(override val name: String) : AnimalWithName()