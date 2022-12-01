package days

class Day01 : Day(1) {

    private val elves = mutableListOf(0)
    override fun part1() : Any {

        inputList.forEach {
            if (it == "")
                elves.add(0)
            else
                elves[elves.lastIndex] += it.toInt()
        }
        return elves.max()
    }

    override fun part2() : Any {
        return elves.sorted().takeLast(3).sum()
    }
}