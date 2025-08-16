package me.sungbin.lec04

fun main() {
    val javaMoney1 = JavaMoney(2_000)
    val javaMoney2 = JavaMoney(1_000)

    if (javaMoney1 > javaMoney2) {
        println("Money1이 Money2보다 큽니다.")
    }

    val money1 = JavaMoney(1_000)
    val money2 = money1
    val money3 = JavaMoney(1_000)

    println(money1 === money2)
    println(money1 === money3)
    println(money1 == money3)

    if (fun1() || fun2()) {
        println("본문")
    }

    if (fun2() && fun1()) {
        println("본문")
    }

    val kotlinMoney1 = Money(1_000)
    val kotlinMoney2 = Money(2_000)

    println(kotlinMoney1 + kotlinMoney2)
}

fun fun1(): Boolean {
    println("fun1")

    return true
}

fun fun2(): Boolean {
    println("fun2")

    return false
}