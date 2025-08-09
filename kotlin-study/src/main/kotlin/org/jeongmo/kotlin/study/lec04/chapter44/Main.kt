package org.jeongmo.kotlin.study.lec04.chapter44

import org.jeongmo.kotlin.study.global.constants.PrintConstants

fun main() {
    // lamda
    val list = listOf("a", "b", "c", "d")
    val result1 = list.map({i : String-> "[$i]"})
    println(result1)

    val result2 = list.map({i -> "[$i]"})
    println(result2)

    val result3 = list.map({"[$it]"})
    println (result3)

    val result4 = list.map {"[$it]"}
    println(result4)

    PrintConstants.printLine()

    val result5 = list.mapIndexed { index, element -> "[$index, $element]"}

    println(result5)

    val result6 = list.mapIndexed {index, _ -> "[$index]"}

    println(result6)

    PrintConstants.printLine()

    val intList = listOf(1, 2, 3, 4, 5, 6, 7, 8, 9)

    val result7 = intList.filter {it > 2}
    println(result7)

    val isEven = {value : Int -> value % 2 == 0}
    val result8 = intList.filter (isEven)
    println(result8)

    val printFunction : (Int) -> Unit = {value : Int -> print(value)}
    intList.filter(isEven).forEach(printFunction)
    println()
    intList.filter(isEven).forEach(Int::print)
    println()

    PrintConstants.printLine()

    val (over2, under2) = intList.partition {it > 2}
    println("over: $over2, under: $under2")

    PrintConstants.printLine()

    val isEvenEach: (Int) -> Boolean = {it % 2 == 0}
    val result9 = check(intList, isEvenEach)
    println(result9)
}

fun Int.print() = print(this)

fun <T> check(list : List<T>, function : (T) -> Boolean) : List<Boolean> {
//    return list.map {function(it)}
    return list.map {function.invoke(it)}
}