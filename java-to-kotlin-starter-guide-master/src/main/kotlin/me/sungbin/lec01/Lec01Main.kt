package me.sungbin.lec01

fun main() {
    var number1: Long = 10L // 타입 생략 가능
    number1 = 5L

    val number2: Long = 10L // 타입 생략 가능
//    number2 = 5L

    var number3: Long
    number3 = 10L
    println(number3)

    val number4: Long
    number4 = 10L
    println(number4)

    var number5 = 10L
    var number6 = 1_000L

    var number7: Long? = 1_000L
    number7 = null

    val person = Person("양성빈")
}