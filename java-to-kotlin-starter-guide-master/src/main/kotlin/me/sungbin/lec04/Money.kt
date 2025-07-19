package me.sungbin.lec04

class Money(val amount: Long) {
    operator fun plus(money: Money): Money {
        return Money(this.amount + money.amount)
    }

    override fun toString(): String {
        return "Money(amount=$amount)"
    }
}