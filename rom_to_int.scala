import scala.math._
object Solution {
    def romanToInt(s: String): Int = {
        val len = s.length
        val ss = s.reverse
        var result = 0
        val rom_num: Map[Char, Int] = Map('I' -> 1, 'V' -> 5, 'X' -> 10, 'L' -> 50, 'C' -> 100, 'D' -> 500, 'M' -> 1000)
        for(i <- 0 to len-1){
            if(i > 0){
                if(rom_num(ss(i)) >= rom_num(ss(i-1))){
                result = result + rom_num(ss(i))
                }
                else{
                    result = result - rom_num(ss(i-1)) + (rom_num(ss(i-1)) - rom_num(ss(i)))
                }
            }
            else {
                result = rom_num(ss(0))
            }
        }
        result
    }
}
