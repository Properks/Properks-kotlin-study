package org.jeongmo.kotlin.study.lec05.chapter66

import org.jeongmo.kotlin.study.lec05.chapter66.classes.Dog
import org.jeongmo.kotlin.study.lec05.chapter66.classes.Huskey
import org.jeongmo.kotlin.study.lec05.chapter66.interfaces.Animal

fun main() {
    val animal : Animal = Dog()
    println("\'animal\' is Dog type: ${animal is Dog}")
    println("\'animal\' Type: ${animal::class}")
    println("Is Huskey? ${animal as? Huskey ?: "No"}")
    println("\'animal\' Type: ${animal::class}")
}