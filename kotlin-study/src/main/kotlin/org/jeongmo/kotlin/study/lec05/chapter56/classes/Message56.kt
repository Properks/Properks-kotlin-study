package org.jeongmo.kotlin.study.lec05.chapter56.classes

class Message56(text : String) {

    companion object {
        var count : Long = 0L
    }
    private val id : Long
    private val content : String
    init {
        this.id = count + 1
        count += 1
        this.content = text
    }

    fun getId() = this.id
    fun getContent() = this.content
}