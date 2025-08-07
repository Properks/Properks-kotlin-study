package org.jeongmo.kotlin.study.lec02.chapter17.classes

class Cup {
    var current : Double = 0.0
    val max = 100.0

    fun add(increase: Double) = if (current + increase > max) current = max else current += increase
}