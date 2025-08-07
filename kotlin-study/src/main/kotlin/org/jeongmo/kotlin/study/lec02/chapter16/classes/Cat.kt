package org.jeongmo.kotlin.study.lec02.chapter16.classes

class Cat {
    fun speak() = "meow"

    fun speakTwice() = "${speak()}! ${this.speak()}!"
}