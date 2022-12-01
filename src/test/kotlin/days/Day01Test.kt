package days

import org.junit.jupiter.api.Test
import kotlin.test.assertEquals

class Day01Test {
    private val day = Day01()

    @Test
    fun testPartOne() {
        assertEquals(day.part1(), 69528)
    }


    @Test
    fun testPartTwo() {
        assertEquals(day.part2(), 206152)
    }
}