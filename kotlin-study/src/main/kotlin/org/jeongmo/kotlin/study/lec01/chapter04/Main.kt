package org.jeongmo.kotlin.study.lec01.chapter04

import org.jeongmo.kotlin.study.global.constants.PrintConstants

fun main() {
    val int1 : Int = 1
    // int1 = 12 // 오류 val로 선언되어 있어 수정 불가

    var int2 = 2 // 자료형 추론으로 생략 가능
    println("int2: $int2")

    int2 = 3
    println("int2 = 3: $int2")
    int2 = int1 + 2
    int2 += 1

    println("int1 + 2, int2 += 1: $int2")

    PrintConstants.printLine()

    val str : String = "String"
    val double : Double = 2.3
    val float : Float = 2.3F
    val bool : Boolean  = true
    val char : Char = 'z'
    println("str: $str")
    println("double: $double")
    println("float: $float")
    println("bool: $bool")
    println("char: $char")
}