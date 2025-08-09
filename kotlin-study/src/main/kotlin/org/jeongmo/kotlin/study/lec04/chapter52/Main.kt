package org.jeongmo.kotlin.study.lec04.chapter52

import org.jeongmo.kotlin.study.global.constants.PrintConstants

fun main() {
    val list = listOf(1, 2, 3, 4, 5, 6, 7, 8, 9)

    var result = ""
    list.forEach {
        if (it > 6) {
            return@forEach
        }
        if (it % 3 == 0) {
            result += it
        }
//        if (it > 6) { // return은 다음 요소로 넘기는 것이기 때문에 여기에 넣으면 9까지 result에 들어간다.
//            return@forEach
//        }

    }
    PrintConstants.printLine()
    println("Reduce, Fold")
    println(list.fold(1000) { sum, value -> sum + value})
    val stringList = list.map {"$it"}
    println(stringList.fold("*") {initial, value -> "$initial$value"})
    println(stringList.foldRight("*") {initial, value -> "$initial$value"})
    println(stringList.reduce {initial, value -> "$initial$value"})

    println("result: $result")
}