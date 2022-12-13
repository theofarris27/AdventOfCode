fun main() {
    fun part1(input: List<String>): Int {
        var sum = 0
<<<<<<< HEAD
        for(lines in input){
            var half1 = lines.substring(0,lines.indexOf(","))
            var half1num1 = half1.substring(0, half1.indexOf("-")).toInt()
            var half1num2 = half1.substring(half1.indexOf("-") + 1).toInt()

            var half2 = lines.substring(lines.indexOf(",") + 1)
            var half2num1 = half2.substring(0, half2.indexOf("-")).toInt()
            var half2num2 = half2.substring(half2.indexOf("-") + 1).toInt()
            if(half1num1 <= half2num1 && half1num2 >= half2num2){
                sum++
            }
            else if(half2num1 <= half1num1 && half2num2 >= half1num2){
=======
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
>>>>>>> origin/main
                sum++
            }
        }
        return sum
    }
    val input = readInput("Sections")
    println(part1(input))
}