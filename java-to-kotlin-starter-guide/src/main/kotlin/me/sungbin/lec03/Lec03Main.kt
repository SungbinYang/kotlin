package me.sungbin.lec03

fun main() {
    val number1 = 3
    val number2: Long = number1.toLong()

    val number3: Int? = 3
    val number4: Long = number3?.toLong() ?: 0L

    printAgeIfPerson(Person("", 1))
    printAgeIfNotPerson(Any())
    printAgeIfPersonOrNull(null)

    val person = Person("양성빈", 30)
    println("이름: ${person.name}")

    val str = """
        ABC
        EFG
        ${person.name}
    """.trimIndent()
    println(str)

    val character = "ABC"
    println(character[0])
    println(character[2])
}

fun printAgeIfPerson(obj: Any) {
    if (obj is Person) {
        val person = obj as Person
        println(person.age)
        println(obj.age)
    }
}

fun printAgeIfNotPerson(obj: Any) {
    if (obj !is Person) {
        println("obj is not a person")
    }
}

fun printAgeIfPersonOrNull(obj: Any?) {
    val person: Person? = obj as? Person
    println(person?.age)
}
