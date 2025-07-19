package me.sungbin.lec04

fun main() {
    val javaMoney1 = JavaMoney(1_000L)
    val javaMoney2 = javaMoney1
    val javaMoney3 = JavaMoney(1_000L)

    if (javaMoney1 < javaMoney2) {
        println("Money1이 Money2보다 큽니다.")
    }

    println(javaMoney1 === javaMoney2)
    println(javaMoney1 === javaMoney3)
    println(javaMoney1 == javaMoney3)

    if (fun1() || fun2()) {
        println("본문")
    }

    if (fun2() && fun1()) {
        println("본문")
    }

    val money1 = Money(1_000L)
    val money2 = Money(2_000L)

    println(money1 + money2)
}

fun fun1(): Boolean {
    println("fun1")
    return true
}

fun fun2(): Boolean {
    println("fun2")
    return false
}