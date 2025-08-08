package org.jeongmo.kotlin.study.lec03.chapter35.classes

data class Book(val title : String, val author : String) {
    fun toEntity() {
        println("변경")
    }
}
