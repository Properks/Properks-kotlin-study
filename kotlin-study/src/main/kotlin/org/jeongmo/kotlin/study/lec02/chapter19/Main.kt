package org.jeongmo.kotlin.study.lec02.chapter19

import org.jeongmo.kotlin.study.global.constants.PrintConstants
import org.jeongmo.kotlin.study.lec02.chapter19.classes.Person
import org.jeongmo.kotlin.study.lec02.chapter19.classes.Student

fun main() {
    val person = Person("mo")
    println("Person Greeting: ${person.greeting}")
//    person.name // error

    println(PrintConstants.LINE)

    val student = Student("jeong")
    println("name: ${student.name}")
}