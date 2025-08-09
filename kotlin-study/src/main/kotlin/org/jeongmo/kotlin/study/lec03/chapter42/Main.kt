package org.jeongmo.kotlin.study.lec03.chapter42

val String.indices: IntRange
        get() = 0 until length

val List<Any?>.removeLast : List<Any?>
    get() {
        val mutable = mutableListOf(*this.toTypedArray())
        mutable.removeLast()
        return listOf(*mutable.toTypedArray())
    }

fun main() {
    // 확장 함수와 마찬가지로 직접 만드는 클래스에 대해서는 사용을 고려해볼 필요가 있다. 다른 부분에서 특화되어 사용되는 것이 아니면 사용하지 않거나 직접 클래스 내부에 추가하는 방향이 좋을 듯하다.
    val str = "String value"

    println("str.indices: ${str.indices}")

    val list = listOf("a", "b", "c", "d", "e")
    println("list.removeLast: ${list.removeLast}")
}