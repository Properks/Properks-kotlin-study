package org.jeongmo.kotlin.study.lec06.chapter73

import org.jeongmo.kotlin.study.lec06.chapter73.classes.CustomException

fun main() {
    try {
        val result = division(3, 0)
        println("result: $result")
    } catch (e : NumberFormatException) {
        throw CustomException("0으로 나누면 안됩니다.")
    } catch (e : Exception) {
        println(1)
        e.printStackTrace()
    }
}

fun division(a : Int, b : Int) : Double {
    if (b == 0) {
        throw NumberFormatException()
    }
    return 1.0 * a / b
}