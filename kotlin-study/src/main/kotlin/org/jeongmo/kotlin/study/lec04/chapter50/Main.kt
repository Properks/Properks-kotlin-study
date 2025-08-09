package org.jeongmo.kotlin.study.lec04.chapter50

import org.jeongmo.kotlin.study.global.constants.PrintConstants
import org.jeongmo.kotlin.study.lec04.chapter50.classes.Person50

fun main() {
    val names = listOf(
        "Alice",
        "Brthricia",
        "Bob",
        "Bill",
        "BirdPerson",
        "Charlie",
        "Crocubot",
        "Franz",
        "Revolio",
    )
    val age = listOf(
        12,
        14,
        46,
        42,
        32,
        25,
        38,
        32,
        25,
    )

    val people = names.zip(age, makePeople)


    println("GroupBy")
    printMap(people.groupBy { it.name.first() })

    println("GroupBy age group")
    printMap(people.groupBy { it.age / 10 }.toSortedMap())

    PrintConstants.printLine()

    println("Associate With")
    printMap(people.associateWith { it.name })

    PrintConstants.printLine()

    println("Associate By")
    printMap(people.associateBy { it.name })


}

val makePeople : (String, Int) -> Person50 = {
    name, age ->
    Person50(name, age)
}

fun <T, U> printMap(maps : Map<T, U>) {
    maps.forEach {println("${it.key}: ${it.value}")}
}