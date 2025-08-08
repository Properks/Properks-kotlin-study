package org.jeongmo.kotlin.study.lec03.chapter30

import org.jeongmo.kotlin.study.lec03.chapter30.classes.Extension.square
import org.jeongmo.kotlin.study.lec03.chapter30.classes.modular

fun String.print() = println(this)
fun main() {
    val str = "String"
    str.print()

    val num = 8
    println("num.square(): ${num.square()}")

    println("num.mod(5): ${num.modular(5)}")
}