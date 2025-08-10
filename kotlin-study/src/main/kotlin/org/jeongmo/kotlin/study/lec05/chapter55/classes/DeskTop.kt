package org.jeongmo.kotlin.study.lec05.chapter55.classes

import org.jeongmo.kotlin.study.lec05.chapter55.classes.interfaces.Computer

class DeskTop : Computer {
    override fun prompt(): String = "Hello!"
}