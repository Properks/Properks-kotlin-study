package org.jeongmo.kotlin.study.lec02.chapter26

import org.jeongmo.kotlin.study.global.constants.PrintConstants

fun main() {
    for (i in 1..5) {
        val range = 1..i
        println(sum(*range.toList().toIntArray()))
    }

    println(PrintConstants.LINE)

    val array = arrayOf(1, 2, 3, 4, 5)
    println(sum(*array.toIntArray()))

    println(PrintConstants.LINE)

    val array2 = intArrayOf(1, 2, 3, 4, 5)
    println(sum(*array2))

    // * -> 스프레드 연산자(spread operator)는 Array를 각 원소로 펼치는 방식 즉, vararg에 전달할 때 사용
}

fun sum(vararg num : Int) = num.sum()