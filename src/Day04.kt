fun main() {
    fun part1(input: List<String>): Int {
        var sum = 0
        for(x in input){
            var section1 = x.substring(0, x.indexOf(",")-1)
            var section2 = x.substring(x.indexOf(",") + 1)
            var sectionNum1 = section1.substring(0, section1.indexOf("-")-1).toInt()
            var sectionNum2 = section1.substring(section1.indexOf("-")+1, section1.length - 1).toInt()
            var section2Num1 = section2.substring(0, section1.indexOf("-")-1).toInt()
            var section2Num2 = section2.substring(section2.indexOf("-")+1, section1.length - 1).toInt()
            if((sectionNum1 <= section2Num1) && (sectionNum2 >= section2Num2)){
                sum++
            }
            else if((sectionNum1 >= section2Num1) && (sectionNum2 <= section2Num2)){
                sum++
            }
        }
        return sum
    }
    val input = readInput("Sections")
    println(part1(input))
}