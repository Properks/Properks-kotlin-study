package org.jeongmo.kotlin.study.lec05.chapter56

import org.jeongmo.kotlin.study.lec05.chapter56.classes.Message56

fun main() {
    var message = Message56("first")
    println("Message(${message.getId()}): ${message.getContent()}")

    message = Message56("second")
    println("Message(${message.getId()}): ${message.getContent()}")
}