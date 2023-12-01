import org.junit.jupiter.api.Test

import org.junit.jupiter.api.Assertions.*

class Day01Test {

    private val fileUtil = FileUtil()

    @Test
    fun exampleTest() {
        val calibrationValues = fileUtil.getRows()

        val day01 = Day01()
        val calibrationSum = day01.execute(calibrationValues)

        assertEquals(281, calibrationSum)
    }

    @Test
    fun test() {
        val calibrationValues = fileUtil.getRows()

        val day01 = Day01()
        val calibrationSum = day01.execute(calibrationValues)

        assertEquals(54418, calibrationSum)
    }
}