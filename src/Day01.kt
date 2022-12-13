fun main() {
    fun part1(input: List<String>): Int {
        var sums = mutableListOf<Int>()
        var maxCals = 0
        var inventoryCals = 0
        for (x in input.indices){
            if(input[x] != ""){
                inventoryCals += input[x].toInt()
            }
            else{
                sums += inventoryCals
                inventoryCals = 0
                }
        }
        for(x in sums.indices){
            if(sums[x] > maxCals){
                maxCals = sums[x]
            }
        }
        return maxCals
    }
    fun part2(input: List<String>): Int {
        var sums = mutableListOf<Int>()
        var maxCals = 0
        var inventoryCals = 0
        for (x in input.indices){
            if(input[x] != ""){
                inventoryCals += input[x].toInt()
            }
            else{
                sums += inventoryCals
                inventoryCals = 0
            }
        }
        return sums.map { it.toInt()}.sortedDescending().take(3).sum()
    }
    val testInput = readInput("Day01_test")
    val input = readInput("Calories")
    println(part1(input))
    println(part2(input))
}