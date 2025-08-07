package org.jeongmo.kotlin.study.lec01.chapter14

// 식과 문의 차이
// 식은 변수에 대입 가능, 문은 불가능
fun main() {
    // for는 문이다. 아래처럼 불가능
//    val f = for(i in 1..10) {}

    // if 는 식
    val value = 52
    val result = if (value > 50) {
        val a = 10 // 해당 줄만 쓰면 반환이 없어서 Kotlin.Unit이 반환된다.
        a + value
    } else {
        value + 50
    }
    println(result)
}
