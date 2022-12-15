fun main(){

    fun part1(input: List<String>): String{
        val string2DArray: Array<Array<String?>> = arrayOf(
            arrayOf("M", "H",   "",   "",  "N",  "",    "",   "",  ""),
            arrayOf("S", "W",   "",   "",  "F",  "",   "W",  "V",  ""),
            arrayOf("J", "J",   "",   "",  "B",  "",   "S",  "B", "F"),
            arrayOf("L", "F",  "G",   "",  "C",  "",   "L",  "N", "N"),
            arrayOf("V", "Z",  "D",   "",  "P",  "W",  "G",  "F", "Z"),
            arrayOf("F", "D",  "C",  "S",  "W",  "M",  "N",  "H", "H"),
            arrayOf("N", "N",  "R",  "B",  "Z",  "R",  "T",  "T", "M"),
            arrayOf("R", "P",  "W",  "N",  "M",  "P",  "R",  "Q", "L"))
        for(lines in input){
            var move = lines.substring(5, lines.indexOf("from") - 1).toInt()
            var from = lines.substring(lines.indexOf("from") + 5, lines.indexOf("to") - 1).toInt()
            var to = lines.substring(lines.indexOf("to") + 3).toInt()
            for(i in 1 .. move){
                var toCheck = true
                var fromCheck = true
                var fromIndex = 0
                var toIndex= 0
                while(toCheck){
                    if(string2DArray[to][toIndex].isNullOrEmpty()){
                        toCheck = false
                    }
                    toIndex++
                }
                while(fromCheck){
                    if(!(string2DArray[from][fromIndex].isNullOrEmpty())){
                        fromCheck = false
                    }
                    fromIndex++
                }
                string2DArray[to][toIndex-1] = string2DArray[from][fromIndex-1]
                string2DArray[from][fromIndex] = string2DArray[from][fromIndex-2]
            }
        }
        var returnVal = ""
        for(i in 0.. 9){
            returnVal += string2DArray[0][i]
        }
        return returnVal
    }
    val input = readInput("Crates")
    println(part1(input))
}

