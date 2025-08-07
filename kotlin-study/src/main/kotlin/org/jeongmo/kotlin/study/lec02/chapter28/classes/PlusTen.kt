package org.jeongmo.kotlin.study.lec02.chapter28.classes

class PlusTen {
    var num: Int = 0
        get() = field + 10
        set(value) {
            field = value + 11
        }

    constructor(num : Int) {this.num = num}
}