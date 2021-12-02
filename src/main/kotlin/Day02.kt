import github.walkmansit.aoc2021.Day

class Day02(private val input: Collection<String>) : Day<Int, Int> {
    override fun getResultPartOne(): Int {
        var depth = 0
        var x = 0
        for (line in input){
            val pair = line.split(" ")
            val value = pair[1].toInt()
            when(pair[0][0]){
                'f' -> x+=value
                'd' -> depth+=value
                'u' -> depth-=value
           }
        }
        return depth*x
    }

    override fun getResultPartTwo(): Int {
        var depth = 0
        var x = 0
        var aim = 0
        for (line in input){
            val pair = line.split(" ")
            val value = pair[1].toInt()
            when(pair[0][0]){
                'f' -> {
                    x+=value
                    depth+=aim*value
                }
                'd' -> aim+=value
                'u' -> aim-=value
            }
        }
        return depth*x
    }

}
