package github.walkmansit.aoc2021

interface Day<out T, out K> {

    fun getResultPartOne(): T

    fun getResultPartTwo(): K
}