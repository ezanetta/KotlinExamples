package classes.basic

class AndroidDev constructor(name: String) {
    val name = name

    init {
        println("Name value is $name")
    }
}

class WebDev(val name: String) {
    fun printName() {
        println("Name value is $name")
    }
}

class KotlinDev(val name: String) {
    var age: Int = 15

    constructor(name: String, age: Int) : this(name) {
        this.age = age
    }

    init {
        println("Kotlin dev: $name $age")
    }
}

class JavaDev(val name: String, val age: Int) {
    var lastName: String = ""

    constructor(name: String, age: Int, lastName: String) : this(name, age) {
        this.lastName = lastName
    }
}

