package classes.sealed

sealed class Mammal(val name: String)

class Cat(val catName: String) : Mammal(catName)
class Human(val humanName: String, val job: String) : Mammal(humanName)
class Dog(val dogName: String) : Mammal(dogName)