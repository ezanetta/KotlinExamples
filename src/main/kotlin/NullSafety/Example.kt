package NullSafety

fun main(args: Array<String>) {
    val fieldNotNull: String = "This field can't be null"
    // TODO ? is used for declare a variable that can be null
    var fieldCanBeNull: String? = null

    println(countCharsInKotlin(fieldNotNull))
    println(countCharsWithElvisOperator(fieldCanBeNull))
}

fun countCharsInJavaWay(word: String?) : Int {
    if(word == null) {
        return -1
    } else {
        return word.length
    }
}

// TODO if the word param is null, return null
fun countCharsInKotlin(word: String?): Int?  = word?.length

fun countCharsWithElvisOperator(word: String?) : Int = word?.length ?: -1

// TODO if the word param is null this throw a KotlinNullPointerException
fun countCharsWithNeverNullParam(word: String?) : Int = word!!.length