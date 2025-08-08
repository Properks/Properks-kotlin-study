package org.jeongmo.kotlin.study.lec03.chapter38

fun String.echo() = println(this)

fun main() {
    val str : String? = "string"
    val str1 : String? = null

    str?.echo()
    str1?.echo() // don't

    val str2 : String? = str1 ?: "not null"
    str1?.echo() // don't
    str2?.echo()
}