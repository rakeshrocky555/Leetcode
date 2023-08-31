package Non_DP.twopointers
import scala.math._

object Increasing_triplet_subsequence extends App{

    def increasingTriplet(nums: Array[Int]): Boolean = {
      var min_arr = Array.ofDim[Int](nums.length)
      var max_arr = Array.ofDim[Int](nums.length)
      var min_ele = 2147483647
      var max_ele = -1
      var j = 0
      var flag = false
      for(i <- 0 until nums.length){
        min_ele = min(min_ele, nums(i))
        max_ele = max(max_ele, nums(nums.length - 1 - i))
        min_arr(i) = min_ele
        max_arr(nums.length - 1 - i) = max_ele
      }

      //finding the answer
      while((j < nums.length) && !flag){
        if((nums(j) < max_arr(j)) && (nums(j) > min_arr(j))){
          flag = true
        }
        j += 1
      }
      //result
      flag
    }

  println(increasingTriplet(Array(2,1,5,0,4,6)))
  }
