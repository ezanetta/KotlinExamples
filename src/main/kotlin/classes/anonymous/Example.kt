package classes.anonymous

fun main(args: Array<String>) {
    // ANONYMOUS DOG
    sayHelloToMyLittleFriend(object : Animal {
        override fun jump() {
            // implementation
        }

        override fun hello() {
            println("BARK BARK BARK!")
        }
    })
}

fun sayHelloToMyLittleFriend(animal: Animal) {
    println(animal.hello())
}