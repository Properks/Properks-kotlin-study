package org.jeongmo.kotlin.study.lec05.chapter70

import org.jeongmo.kotlin.study.lec05.chapter70.classes.Companions
import org.jeongmo.kotlin.study.lec05.chapter70.classes.JustOne

fun main() {
    val companions = Companions()
    println("n: ${JustOne.n}")
    println("i: ${Companions.i}")
    println("i: ${Companions.Comp.i}")
}