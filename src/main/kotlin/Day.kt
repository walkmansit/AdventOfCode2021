package github.walkmansit.aoc2020

interface Day<out T, out K> {

    fun getResultPartOne(): T

    fun getResultPartTwo(): K
}