package org.jeongmo.kotlin.study.lec01.chapter11

import org.jeongmo.kotlin.study.global.constants.PrintConstants

fun main() {
    var integer = 1
    while (isUnder100(integer)) {
        println("Integer: ${integer++}")
    }

    PrintConstants.printLine()

    val range = 1..3
    println("range: $range")
    for (i in range) {
        println("i: $i")
    }

    PrintConstants.printLine()

    val range2 = 1 until 3
    println("range2: $range2")
    for (i in range2) {
        println("i: $i")
    }

    PrintConstants.printLine()

    val str = "String"
    for (i in str) {
        println("char: $i")
    }


}

fun isUnder100(int : Int) = int < 100
