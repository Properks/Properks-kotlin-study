package org.jeongmo.kotlin.study.lec04.chapter49

import org.jeongmo.kotlin.study.global.constants.PrintConstants

data class Person44(val name : String, val age : Int)
data class Book44(val title : String, val authors : List<String>)

fun main() {
    val nameList = listOf("a", "b", "c", "d")
    val ageList = listOf(12,15,24,32)
    val personList = nameList.zip(ageList) {name, age -> Person44(name, age)}
//    personList.forEach(Person44::print)
    personList.forEach {println(it.print)}

    PrintConstants.printLine()

    val authors = listOf(
        listOf("a", "b", "c"),
        listOf("d", "e", "f"),
        listOf("g", "h", "i"),
    )

    val books = listOf(
        Book44("title1", authors[0]),
        Book44("title2", authors[1]),
        Book44("title3", authors[2]),
    )

    println("Map without flatten")
    println(books.map {it.authors})

    println("Map with flatten")
    println(books.flatMap { it.authors })
}

fun Person44.print() = println("name: ${this.name}, age: ${this.age}")
val Person44.print : String
    get() = "name: ${this.name}, age: ${this.age}"


fun <T, U> makePair(a: List<T>, b: List<U>) {
    a.zip(b) { a1, b1 -> Pair(a1, b1)}
}