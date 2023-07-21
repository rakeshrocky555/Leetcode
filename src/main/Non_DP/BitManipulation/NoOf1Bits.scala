package Non_DP.BitManipulation
import scala.math._

object NoOf1Bits extends App{
    // you need treat n as an unsigned value
    def hammingWeight(n: Int): Int = {
      var num = n
      var result = 0
      //println(num)
      while(num != 0){
        //println(num)
        result = result + abs((num%2).toInt)
        num = num >>> 1
      }
      result
    }

  println(hammingWeight(23))
  }
