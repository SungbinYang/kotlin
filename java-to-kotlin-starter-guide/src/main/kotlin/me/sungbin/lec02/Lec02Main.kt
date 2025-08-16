package me.sungbin.lec02

fun main() {
    val str1: String? = "ABC"
//    println(str.length)
    println(str1?.length)

    val str2: String? = null
    println(str2?.length ?: 0)

    println(startsWith("ABC"))

    val person = Person("Robert")
    println(startsWithPersonName(person.name))
}

fun startsWithA1(str: String?): Boolean {
    if (str == null) {
        throw IllegalArgumentException("null이 들어왔습니다.")
    }

    return str.startsWith("A")
}

fun startsWithA1WithKotlin(str: String?): Boolean {
    return str?.startsWith("A") ?: throw IllegalArgumentException("null이 들어왔습니다.")
}

fun startsWithA2(str: String?): Boolean? {
    if (str == null) {
        return null
    }

    return str.startsWith("A")
}

fun startsWithA2WithKotlin(str: String?): Boolean? {
    return str?.startsWith("A")
}

fun startsWithA3(str: String?): Boolean {
    if (str == null) {
        return false
    }

    return str.startsWith("A")
}

fun startsWithA3WithKotlin(str: String?): Boolean {
    return str?.startsWith("A") ?: false
}

fun startsWith(str: String?): Boolean {
    return str!!.startsWith("A")
}

fun startsWithPersonName(str: String): Boolean {
    return str.startsWith("A")
}