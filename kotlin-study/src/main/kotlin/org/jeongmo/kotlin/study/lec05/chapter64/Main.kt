package org.jeongmo.kotlin.study.lec05.chapter64

import org.jeongmo.kotlin.study.lec05.chapter64.classes.X64
import org.jeongmo.kotlin.study.lec05.chapter64.classes.f

fun main() {
    val x : X64 = X64()
    println("x.f() : ${x.f()}")
    // 필수적이지 않은 함수는 직접 클래스에 정의하는 것이 아닌 확장함수를 사용하는 것이 코틀린의 확장 철학 (자바에 호환성 유지가 본래의 목적)
    // 대신, private 맴버 변수 접근을 가진 함수는 제외
}