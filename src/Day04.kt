fun main() {
    fun part1(input: List<String>): Int {
        var sum = 0
        for (lines in input) {
            var half1 = lines.substring(0, lines.indexOf(","))
            var half1num1 = half1.substring(0, half1.indexOf("-")).toInt()
            var half1num2 = half1.substring(half1.indexOf("-") + 1).toInt()

            var half2 = lines.substring(lines.indexOf(",") + 1)
            var half2num1 = half2.substring(0, half2.indexOf("-")).toInt()
            var half2num2 = half2.substring(half2.indexOf("-") + 1).toInt()
            if (half1num1 <= half2num1 && half1num2 >= half2num2) {
                sum++
            } else if (half2num1 <= half1num1 && half2num2 >= half1num2) {
                sum++
            }
        }
            return sum

    }
            fun part2(input: List<String>): Int {
                var sum = 0
                for (lines in input) {
                    var half1 = lines.substring(0, lines.indexOf(","))
                    var half1num1 = half1.substring(0, half1.indexOf("-")).toInt()
                    var half1num2 = half1.substring(half1.indexOf("-") + 1).toInt()

                    var half2 = lines.substring(lines.indexOf(",") + 1)
                    var half2num1 = half2.substring(0, half2.indexOf("-")).toInt()
                    var half2num2 = half2.substring(half2.indexOf("-") + 1).toInt()
                    if (half1num1 <= half2num1 && half1num2 >= half2num2) {
                        sum++
                    } else if (half2num1 <= half1num1 && half2num2 >= half1num2) {
                        sum++
                    }
                    else if(half1num2 >= half2num1 && half1num2 <= half2num2){
                        sum++
                    }
                    else if(half1num1 >= half2num1 && half1num1 <= half2num2){
                        sum++
                    }
                }
                    return sum
            }

            val input = readInput("Sections")
            println(part2(input))

    }
