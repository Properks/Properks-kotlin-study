package org.jeongmo.kotlin.study.lec01.chapter13

fun main() {
    val int = 1
    if (isBetween(int, 1, 3)) {
        println("${int}는 범위 내에 있습니다.")
    }

    val start = "abc"
    val end = "fed"
    val range = start..end
    val value1 = "esd"
    val value2 = "fzd"
    println("$value1 is in $range: ${value1 in range}")
    println("$value2 is in $range: ${value2 in range}")
}

fun isBetween(num : Int, low : Int, high : Int) = isBetween(num, low..high)

fun isBetween(num : Int, range : IntRange) = num in range