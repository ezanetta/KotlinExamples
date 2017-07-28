package classes.Inheritance

//documentation: https://kotlinlang.org/docs/reference/interfaces.html

interface AnimalRepository {
    val total: Int

    fun store(animal: Animal) {
        // implementation
    }

    fun fetchAnimal()
}

class CacheAnimalRepository : AnimalRepository {

    override val total: Int = 20

    override fun fetchAnimal() {
        // implementation
    }

}