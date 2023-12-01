import java.io.FileNotFoundException

class FileUtil {

    fun getRows(): List<String> {
        val stack = Thread.currentThread().stackTrace.first { it.className.startsWith("Day") }
        val day = stack.className.substring(3, 5)
        val example = if (stack.methodName.startsWith("example")) ".example" else ""

        return object {}.javaClass.getResourceAsStream("day$day$example.input.txt")?.bufferedReader()?.readLines() ?: throw FileNotFoundException("Where is the god damn file!")
    }
}