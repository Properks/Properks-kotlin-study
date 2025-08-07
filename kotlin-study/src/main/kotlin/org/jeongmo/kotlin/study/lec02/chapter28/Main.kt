package org.jeongmo.kotlin.study.lec02.chapter28

import org.jeongmo.kotlin.study.lec02.chapter28.classes.Counter
import org.jeongmo.kotlin.study.lec02.chapter28.classes.PlusTen

fun main() {
    val plusTen = PlusTen(40)
    println("get(): ${plusTen.num}") // print 60 setter에 10 더하고 나올 때 10 더해진다.

    val counter = Counter()
    for (i in 1..10) {
        counter.increase()
    }
    println("Count: ${counter.count}")
}