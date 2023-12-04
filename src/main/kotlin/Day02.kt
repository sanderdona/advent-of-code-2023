class Day02 {

    private val cubes = mapOf("red" to 12, "green" to 13, "blue" to 14)
    private val regex = Regex("""(\d+)\s(blue|green|red)""")

    fun execute(inputs: List<String>): Int {
        return inputs.sumOf { input -> getPossibleId(input) }
    }

    private fun getPossibleId(input: String): Int {
        val gameId = getGameId(input)
        return if (enoughCubesForInput(input)) gameId else 0
    }

    private fun enoughCubesForInput(input: String): Boolean {
        val resultSequence = regex.findAll(input)

        return resultSequence.filter { item ->
            val color = item.value.trim().split(" ")[1]
            val number = item.value.trim().split(" ")[0].toInt()
            val availableCubes = cubes[color] ?: 0
            availableCubes < number
        }.toList().isEmpty()
    }

    private fun getGameId(input: String): Int {
        return input.substringBefore(":")
            .substringAfter("Game")
            .trim()
            .toInt()
    }
}