package org.jeongmo.kotlin.study.lec02.chapter16

import org.jeongmo.kotlin.study.lec02.chapter16.classes.Cat
import org.jeongmo.kotlin.study.lec02.chapter16.classes.Dog

fun main() {

    val dog = Dog()
    val cat = Cat()
    println("Dog: ${dog.speak()}")
    println("Cat: ${cat.speak()}")
    println("Cat twice: ${cat.speakTwice()}")
}
