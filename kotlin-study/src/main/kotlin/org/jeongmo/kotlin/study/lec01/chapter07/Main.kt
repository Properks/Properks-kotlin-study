package org.jeongmo.kotlin.study.lec01.chapter07

fun main() {
    val num : Int = 3

    isOver5WithPrint(num)

    val grade = 91
    println("isPass($grade): ${isPass(grade)}")
}

fun isOver5WithPrint(num : Int) {
    if (num > 5) {
        println("isOver5WithPrint($num): true")
    }
    else {
        println("isOver5WithPrint($num): false")
    }
}

fun isPass(grade : Int) : Char {
    return if(grade > 90) 'P' else 'F'
}

fun isPassV2(grade: Int) = if(grade > 90) 'P' else 'F'