package me.sungbin.lec02

fun main() {
    val str: String? = "ABC"
//    println(str.length)
    println(str?.length)

    val string: String? = null
    println(string?.length ?: 0)

    println(startsWith("ABC"))

    val person = Person("Robert")
    println(startsWithPersonName(person.name))
}

fun startsWithPersonName(str: String): Boolean {
    return str.startsWith("A")
}

fun startsWithA1(str: String?): Boolean {
    if (str == null) {
        throw IllegalArgumentException("null이 들어왔습니다.")
    }

    return str.startsWith("A")
}

fun startsWithKotlinA1(str: String?): Boolean {
    return str?.startsWith("A") ?: throw IllegalArgumentException("null이 들어왔습니다.")
}

fun startsWith(str: String?): Boolean {
    return str!!.startsWith("A")
}

fun startsWithA2(str: String?): Boolean? {
    if (str == null) {
        return null
    }

    return str.startsWith("A")
}

fun startsWithKotlinA2(str: String?): Boolean? {
    return str?.startsWith("A")
}

fun startsWithA3(str: String?): Boolean {
    if (str == null) {
        return false
    }

    return str.startsWith("A")
}

fun startsWithKotlinA3(str: String?): Boolean {
    return str?.startsWith("A") ?: false
}