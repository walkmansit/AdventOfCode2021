package github.walkmansit.aoc2021.test

import Day01
import TestableDay
import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test
import java.io.File


class Day01Test : TestableDay {

    @Test
    override fun partOneTestData() {
        assertEquals(7,Day01(TEST_INPUT).getResultPartOne())
    }

    @Test
    override fun partOneRealData() {
        assertEquals(1722,Day01(INPUT).getResultPartOne())
    }

    @Test
    override fun partTwoTestData() {
        assertEquals(5,Day01(TEST_INPUT).getResultPartTwo())
    }

    @Test
    override fun partTwoRealData() {
        assertEquals(1748,Day01(INPUT).getResultPartTwo())
    }

    companion object {
        private val TEST_INPUT = File("src/test/resources/Day01ex.txt").readLines()
        val INPUT = File("src/test/resources/Day01.txt").readLines()
    }
}