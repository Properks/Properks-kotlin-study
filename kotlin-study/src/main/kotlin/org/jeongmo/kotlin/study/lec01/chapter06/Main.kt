package org.jeongmo.kotlin.study.lec01.chapter06

fun main() {
    val num = 3
    println("num: $num")
    println("multiplyByTwo(num) 블록 본문: ${multiplyByTwo(num)}")

    println("multiplyByTwoV2(num) 식 본문: ${multiplyByTwoV2(num)}")

}

fun multiplyByTwo(num : Int) : Int {
    return num * 2
}

fun multiplyByTwoV2(num : Int) = num * 2
