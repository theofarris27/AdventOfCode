fun main() {
    fun part1(input: List<String>): Int {
        return input.size
    }

    fun part2(input: List<String>): Int {
            var sum = 0;
            var win = 6
            var loss = 0
            var tie = 3
            var x = 1
            var y = 2
            var z = 3
            for (lines in input) {
                if (lines.contains('A')) {
                    if (lines.contains('X')) {
                        sum += z
                        sum += loss
                    } else if (lines.contains('Y')) {
                        sum += x
                        sum += tie
                    } else {
                        sum += y
                        sum += win
                    }
                } else if (lines.contains('B')) {
                    if (lines.contains('X')) {
                        sum += x
                        sum += loss
                    } else if (lines.contains('Y')) {
                        sum += y
                        sum += tie
                    } else {
                        sum += z
                        sum += win
                    }
                }
                else {
                    if (lines.contains('X')) {
                        sum += y
                        sum += loss
                    } else if (lines.contains('Y')) {
                        sum += z
                        sum += tie
                    } else {
                        sum += x
                        sum += win
                }
            }
        }
        return sum
    }
    val testInput = readInput("Day01_test")
    val input = readInput("Moves")
    println(part2(testInput))
    check(part2(testInput) == 24000)
    println(part2(input))
}

