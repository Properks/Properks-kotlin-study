package org.jeongmo.kotlin.study.global.constants

object PrintConstants {
    private const val LINE : String = "-------------------------------------"
    fun printLine() : Unit = println(LINE)
}