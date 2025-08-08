package org.jeongmo.kotlin.study.lec03.chapter41

import org.jeongmo.kotlin.study.lec03.chapter41.classes.GenericHolder

fun main() {
    val strGenericHolder = GenericHolder("Str")
    val intGenericHolder = GenericHolder(12)

    println("StrGenericHolder: v: ${strGenericHolder.getValue()}, cls: ${strGenericHolder.getValue()::class}")
    println("IntGenericHolder: v: ${intGenericHolder.getValue()}, cls: ${intGenericHolder.getValue()::class}")
}