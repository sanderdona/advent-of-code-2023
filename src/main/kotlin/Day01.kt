class Day01 {
    private val numbers = listOf("zero", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine")

    fun execute(inputs: List<String>): Int {
        return inputs.sumOf { input -> (getDigit(input) + getDigit(input, true)).toInt() }
    }

    private fun getDigit(input: String, last: Boolean = false): String {
        val charArray = if (last) input.toCharArray().withIndex().reversed() else input.toCharArray().withIndex()

        val result = charArray.firstNotNullOf {
            getDigitAsString(input, it.index)
        }

        return result
    }

    private fun getDigitAsString(value: String, index: Int): String? {
        val char = value[index]

        if (char.isDigit()) {
            return char.toString()
        } else {
            numbers.forEachIndexed { numberIndex, number ->
                if (value.substring(index).startsWith(number)) {
                    return numberIndex.toString()
                }
            }
        }
        return null
    }
}