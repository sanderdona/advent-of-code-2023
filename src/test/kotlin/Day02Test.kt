import org.junit.jupiter.api.Test

import org.junit.jupiter.api.Assertions.*

class Day02Test {

    private val fileUtil = FileUtil()

    @Test
    fun exampleTest() {
        val day02 = Day02()
        val output = day02.execute(fileUtil.getRows())

        assertEquals(8, output)
    }

    @Test
    fun examplePartTwoTest() {
        val day02 = Day02()
        val output = day02.executePartTwo(fileUtil.getRows())

        assertEquals(2286, output)
    }

    @Test
    fun test() {
        val day02 = Day02()
        val output = day02.execute(fileUtil.getRows())

        assertEquals(2913, output)
    }

    @Test
    fun testPartTwo() {
        val day02 = Day02()
        val output = day02.executePartTwo(fileUtil.getRows())

        assertEquals(55593, output)
    }
}