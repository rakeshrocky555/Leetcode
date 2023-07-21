package dynamic_programming.OneD

import scala.math._
object LongestConsecutiveSequence extends App{

    def longestConsecutive(nums: Array[Int]): Int = {
      val nums_set = nums.toSet
      var count = 0
      var max_val = 0

      for(num <- nums_set){
        if(!nums_set.contains(num-1)){
          count = 1
          var incre = num + 1
          while(nums_set.contains(incre)){
            incre = incre + 1
          }
          max_val = max(max_val, (incre - num))
        }
        else{
          max_val = max(max_val, 1)
        }
      }

      max_val
    }

  println(longestConsecutive(Array(0,3,7,2,5,8,4,6,0,1)))
  }
