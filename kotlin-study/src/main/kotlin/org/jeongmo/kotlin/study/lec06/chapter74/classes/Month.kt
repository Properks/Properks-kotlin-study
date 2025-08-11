package org.jeongmo.kotlin.study.lec06.chapter74.classes

class Month(val month : Int) {
    init {
        require(month in 1..12) {
            throw NumberFormatException("Out of range $month")
        }
    }
}