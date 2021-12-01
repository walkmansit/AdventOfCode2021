package github.walkmansit.aoc2021

import java.io.File

import Day01

fun main(args : Array<String>){
    val TEST_INPUT = """
            199
            200
            208
            210
            200
            207
            240
            269
            260
            263
        """.trimIndent().lines()
    val INPUT = File("src/main/resources/Day01.txt").readLines()

    println( Day01(INPUT).getResultPartOne())
    println( Day01(INPUT).getResultPartTwo())
}

