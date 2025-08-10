package org.jeongmo.kotlin.study.lec05.chapter70.classes

// 여러 개의 객체 생성을 막고 싶은 경우
object JustOne {
    val n = 2
    fun f() = n * 10
    fun g() = n * 20
}