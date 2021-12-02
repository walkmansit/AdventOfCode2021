package github.walkmansit.aoc2021.test

import Day02
import TestableDay
import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test
import java.io.File


class Day02Test : TestableDay {

    @Test
    override fun partOneTestData() {
        assertEquals(150,Day02(TEST_INPUT).getResultPartOne())
    }

    @Test
    override fun partOneRealData() {
        assertEquals(1962940,Day02(INPUT).getResultPartOne())

    }

    @Test
    override fun partTwoTestData() {
        assertEquals(900,Day02(TEST_INPUT).getResultPartTwo())
    }


    @Test
    override fun partTwoRealData() {
        assertEquals(1813664422,Day02(INPUT).getResultPartTwo())
    }

    companion object {
        private val TEST_INPUT = File("src/test/resources/Day02ex.txt").readLines()
        val INPUT = File("src/test/resources/Day02.txt").readLines()
    }
}