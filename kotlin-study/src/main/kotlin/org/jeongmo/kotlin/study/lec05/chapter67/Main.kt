package org.jeongmo.kotlin.study.lec05.chapter67

import org.jeongmo.kotlin.study.lec05.chapter67.classes.SealedClass
import org.jeongmo.kotlin.study.lec05.chapter67.classes.SealedImpl1
import org.jeongmo.kotlin.study.lec05.chapter67.classes.SealedImpl2

fun main() {
    val sealed1 = SealedImpl1()
    val sealed2 = SealedImpl2()

    println("Sealed1: ${whenFunction(sealed1)}")
    println("Sealed2: ${whenFunction(sealed2)}")

    println("sealed1 is Impl2: ${sealed1::class == SealedImpl2::class}")
}

// Sealed가 아니면 else를 넣어주어야한다.
fun whenFunction(sealed : SealedClass) =
    when (sealed) {
        is SealedImpl1 -> "Impl1"
        is SealedImpl2 -> "Impl2"
    }