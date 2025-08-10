package org.jeongmo.kotlin.study.lec05.chapter55

import org.jeongmo.kotlin.study.lec05.chapter55.classes.*
import org.jeongmo.kotlin.study.lec05.chapter55.classes.interfaces.Car
import org.jeongmo.kotlin.study.lec05.chapter55.classes.interfaces.Computer
import org.jeongmo.kotlin.study.lec05.chapter55.classes.interfaces.SamArg

fun main() {
    var computer : Computer = DeskTop()
    println("Desktop: ${computer.prompt()}")

    computer = Quantum()
    println("Quantum: ${computer.prompt()}")

    var car : Car = SmallCar("Small")
    println("SmallCar: ${car.symbol}")

    car = MediumCar()
    println("MediumCar: ${car.symbol}")

    car = LargeCar()
    println("LargeCar: ${car.symbol}")

    val lamda = SamArg { value : Int -> value * value }
}