import org.junit.jupiter.api.Test

import org.junit.jupiter.api.Assertions.*

class Day01Test {

    private val fileUtil = FileUtil()

    @Test
    fun exampleTest() {
        val day01 = Day01()
        val output = day01.execute(fileUtil.getRows())

        assertEquals(281, output)
    }

    @Test
    fun test() {
        val day01 = Day01()
        val output = day01.execute(fileUtil.getRows())

        assertEquals(54418, output)
    }
}