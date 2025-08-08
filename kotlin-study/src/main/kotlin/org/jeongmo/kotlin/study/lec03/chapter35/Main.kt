package org.jeongmo.kotlin.study.lec03.chapter35

import org.jeongmo.kotlin.study.lec03.chapter35.classes.Book

fun main() {
    val book = Book("title", "author")
    val book2 = book.copy(author = "author2")
    book.toEntity()
    println("book: $book")
    println("book2: $book2")
    println("book == Book(\"title\", \"author\"): ${book == Book("title", "author")}")
}