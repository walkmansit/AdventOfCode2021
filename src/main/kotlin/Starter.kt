package github.walkmansit.aoc2021

import java.io.File

import Day01
import Day02

fun main(args : Array<String>){
    val TEST_INPUT = File("src/main/resources/Day02ex.txt").readLines()
    val INPUT = File("src/main/resources/Day02.txt").readLines()

    println( Day02(TEST_INPUT).getResultPartOne())
    println( Day02(INPUT).getResultPartOne())

    println( Day02(TEST_INPUT).getResultPartTwo())
    println( Day02(INPUT).getResultPartTwo())
}

