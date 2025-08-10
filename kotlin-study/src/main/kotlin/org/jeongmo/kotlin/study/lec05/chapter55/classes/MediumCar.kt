package org.jeongmo.kotlin.study.lec05.chapter55.classes

import org.jeongmo.kotlin.study.lec05.chapter55.classes.interfaces.Car

class MediumCar : Car {
    override val symbol: String
        get() = "MEDIUM"
}