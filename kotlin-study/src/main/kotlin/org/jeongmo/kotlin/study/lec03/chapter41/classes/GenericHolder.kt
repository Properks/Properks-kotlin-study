package org.jeongmo.kotlin.study.lec03.chapter41.classes

class GenericHolder<T>(private val value: T) {
    fun getValue() : T = value
}