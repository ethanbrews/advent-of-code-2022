package days

class Day01 : Day(1) {
    override fun part1() : Any {
        val elves = mutableListOf(0)
        inputList.forEach {
            if (it == "")
                elves.add(0)
            else
                elves[elves.lastIndex] += it.toInt()
        }
        return elves.max()
    }

    override fun part2() : Any {
        return 0
    }
}