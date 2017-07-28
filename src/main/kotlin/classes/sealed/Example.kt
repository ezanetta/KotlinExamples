package classes.sealed

fun greetMammal(mammal: Mammal): String = when (mammal) {
    is Human -> "Hello human ${mammal.name}. You're working as a ${mammal.job}"
    is Cat -> "Hello cat ${mammal.name}"
    is Dog -> "Hello dog ${mammal.name}"
}

fun main(args: Array<String>) {
    println(greetMammal(Cat("Ketty")))

    println(greetMammal(Dog("Pipi")))

    println(greetMammal(Human("Ricardo Fort", "Chocolatero")))
}