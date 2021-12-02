import github.walkmansit.aoc2021.Day

class Day01(private val input: Collection<String>) : Day<Int,Int> {
    override fun getResultPartOne(): Int {
        val inputInt = input.map { it.toInt() }
        return inputInt.foldIndexed(0) { index, acc, next -> if (index != 0 && inputInt[index - 1] < next) acc+1 else acc };
    }

    override fun getResultPartTwo(): Int {
        val inputInt = input.map { it.toInt() }
        return inputInt.foldIndexed(0) { index, acc, next -> if (index > 2 && inputInt[index - 3] < next) acc+1 else acc };
    }
}