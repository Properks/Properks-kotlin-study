package org.jeongmo.kotlin.study.lec03.chapter36

import org.jeongmo.kotlin.study.global.constants.PrintConstants
import org.jeongmo.kotlin.study.lec03.chapter35.classes.Book

fun main() {
    val book = Book("title", "author")
    val (title, author) = book
    println("title: $title, author: $author")

    val list = listOf(
        Book("title", "author"),
        Book("title1", "author1"),
        Book("title2", "author2"),
        Book("title3", "author3"),
        Book("title4", "author4"),
        Book("title5", "author5"),
    )

    PrintConstants.printLine()
    for ((title, author) in list) {
        println("title: $title, author $author")
    }
}