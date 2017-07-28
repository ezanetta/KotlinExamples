package classes.data

fun main(args: Array<String>) {
    val user = DataUser("Ezequiel", 29)
    val otherUser = DataUser("Ezequiel", 29)
    // Copy user object and reasign age property
    val copiedUser = user.copy(age = 23)

    // Are equals - we can use == instead of equals() in data classes
    println(user == otherUser)

    val simpleUser = SimpleUser("Ezequiel", 29)
    val otherSimpleUser = DataUser("Ezequiel", 29)
    // Aren't equals
    println(simpleUser.equals(otherSimpleUser))

}