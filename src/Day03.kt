fun main() {
    fun part1(input: List<String>): Int {
        var sum = 0;
<<<<<<< HEAD
        for(line in input){
            var half1 = line.substring(0,line.length/2)
            var half2 = line.substring(line.length/2)
            for(letters in half1){
                if(half2.contains(letters)){
                    println("half1 $half1 half2 $half2 letters $letters")
=======
        for(x in input){
            var half1 = x.substring(0,x.length/2)
            var half2 = x.substring(x.length/2)
            for(letters in half1){
                if(half2.contains(letters)){
>>>>>>> origin/main
                    var letter = letters
                    when(letter){
                        'a' -> sum += 1
                        'b' -> sum += 2
                        'c' -> sum += 3
                        'd' -> sum += 4
                        'e' -> sum += 5
                        'f' -> sum += 6
                        'g' -> sum += 7
                        'h' -> sum += 8
                        'i' -> sum += 9
                        'j' -> sum += 10
                        'k' -> sum += 11
                        'l' -> sum += 12
                        'm' -> sum += 13
                        'n' -> sum += 14
                        'o' -> sum += 15
                        'p' -> sum += 16
                        'q' -> sum += 17
                        'r' -> sum += 18
                        's' -> sum += 19
                        't' -> sum += 20
                        'u' -> sum += 21
                        'v' -> sum += 22
                        'w' -> sum += 23
                        'x' -> sum += 24
                        'y' -> sum += 25
                        'z' -> sum += 26
                        'A' -> sum += 27
                        'B' -> sum += 28
                        'C' -> sum += 29
                        'D' -> sum += 30
                        'E' -> sum += 31
                        'F' -> sum += 32
                        'G' -> sum += 33
                        'H' -> sum += 34
                        'I' -> sum += 35
                        'J' -> sum += 36
                        'K' -> sum += 37
                        'L' -> sum += 38
                        'M' -> sum += 39
                        'N' -> sum += 40
                        'O' -> sum += 41
                        'P' -> sum += 42
                        'Q' -> sum += 43
                        'R' -> sum += 44
                        'S' -> sum += 45
                        'T' -> sum += 46
                        'U' -> sum += 47
                        'V' -> sum += 48
                        'W' -> sum += 49
                        'X' -> sum += 50
                        'Y' -> sum += 51
                        'Z' -> sum += 52
                    }
<<<<<<< HEAD
                    break
=======
>>>>>>> origin/main
                }
            }
        }
        return sum
    }
<<<<<<< HEAD

    fun part2(input: List<String>): Int {
        var sum = 0;
        var index = 0
        for(i in 0 .. input.size - 3 step 3){
            index = i
            for(letters in input[i]){
                if(input[index+1].contains(letters) && input[index+2].contains(letters)){
                    println(letters)
                    var letter = letters
                    when(letter){
                        'a' -> sum += 1
                        'b' -> sum += 2
                        'c' -> sum += 3
                        'd' -> sum += 4
                        'e' -> sum += 5
                        'f' -> sum += 6
                        'g' -> sum += 7
                        'h' -> sum += 8
                        'i' -> sum += 9
                        'j' -> sum += 10
                        'k' -> sum += 11
                        'l' -> sum += 12
                        'm' -> sum += 13
                        'n' -> sum += 14
                        'o' -> sum += 15
                        'p' -> sum += 16
                        'q' -> sum += 17
                        'r' -> sum += 18
                        's' -> sum += 19
                        't' -> sum += 20
                        'u' -> sum += 21
                        'v' -> sum += 22
                        'w' -> sum += 23
                        'x' -> sum += 24
                        'y' -> sum += 25
                        'z' -> sum += 26
                        'A' -> sum += 27
                        'B' -> sum += 28
                        'C' -> sum += 29
                        'D' -> sum += 30
                        'E' -> sum += 31
                        'F' -> sum += 32
                        'G' -> sum += 33
                        'H' -> sum += 34
                        'I' -> sum += 35
                        'J' -> sum += 36
                        'K' -> sum += 37
                        'L' -> sum += 38
                        'M' -> sum += 39
                        'N' -> sum += 40
                        'O' -> sum += 41
                        'P' -> sum += 42
                        'Q' -> sum += 43
                        'R' -> sum += 44
                        'S' -> sum += 45
                        'T' -> sum += 46
                        'U' -> sum += 47
                        'V' -> sum += 48
                        'W' -> sum += 49
                        'X' -> sum += 50
                        'Y' -> sum += 51
                        'Z' -> sum += 52
                    }
                    break
                }
            }
        }
        return sum
    }

    val input = readInput("Rucksacks")
    println(part2(input))
}
=======
    val input = readInput("Rucksacks")
    println(part1(input))
}
>>>>>>> origin/main
