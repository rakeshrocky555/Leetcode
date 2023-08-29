package Non_DP.twopointers
import scala.math._

object MinAvgSubarrayI extends App{

    def findMaxAverage(nums: Array[Int], k: Int): Double = {
      var temp_sum = 0
      var sum = 0
      for(i <- 0 until k){
        sum = sum + nums(i)
        temp_sum = temp_sum + nums(i)
      }
      for(i <- k until nums.length){
        temp_sum = temp_sum + nums(i) - nums(i - k)
        sum = max(temp_sum, sum)
      }

      //result
      sum.toDouble/k.toDouble
    }

  println(findMaxAverage(Array(1,2,3,4,5,6,7,9), 3))
  }
