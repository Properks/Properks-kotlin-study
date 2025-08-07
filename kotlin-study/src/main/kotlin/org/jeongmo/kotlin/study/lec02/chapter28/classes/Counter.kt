package org.jeongmo.kotlin.study.lec02.chapter28.classes

class Counter {
    var count: Long = 0
        private set


    fun increase(): Long = ++count
}