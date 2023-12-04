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
    fun test() {
        val day02 = Day02()
        val output = day02.execute(fileUtil.getRows())

        assertEquals(1629, output) // 2402  // 2913
    }
}