package org.jeongmo.kotlin.study.lec02.chapter17

import org.jeongmo.kotlin.study.global.constants.PrintConstants
import org.jeongmo.kotlin.study.lec02.chapter17.classes.Cup

fun main() {
    val cup = Cup()
    addAndPrint(cup , 12.3)
    addAndPrint(cup, 68.3)
    addAndPrint(cup, 49.2)

    PrintConstants.printLine()
    val cup2 = Cup()
    val cup3 = cup2

    println("cup3.current before adding cup2: ${cup3.current}")
    addAndPrint(cup2, 12.3)
    println("cup3.current after adding cup2: ${cup3.current}")

}

fun addAndPrint(cup : Cup, double : Double) {
    cup.add(double)
    println("Cup add $double -> ${cup.current}")
}