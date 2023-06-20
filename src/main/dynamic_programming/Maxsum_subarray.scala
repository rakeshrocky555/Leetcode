package dynamic_programming


import scala.math._
object Maxsum_subarray extends App{
  def maxSubArray(nums: Array[Int]): Int = {
    var max_sum = nums(0)
    var max_so_far = nums(0)
    var i = 1

    //kadane's algorithm
    while(i < nums.length){
      max_so_far = max_so_far + nums(i)
      if(max_so_far < nums(i)){
        max_so_far = nums(i)
      }
      max_sum = max(max_sum, max_so_far)
      i = i + 1
    }

    max_sum
  }

  println(maxSubArray(Array(1,2,3,-1,10)))
}
