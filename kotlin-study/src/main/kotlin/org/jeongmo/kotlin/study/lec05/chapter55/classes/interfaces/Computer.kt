package org.jeongmo.kotlin.study.lec05.chapter55.classes.interfaces

interface Computer {
    fun prompt() : String
    fun calculate() : Int = 0
}