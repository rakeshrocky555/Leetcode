package Non_DP.twopointers

import scala.math._
object min_siz_sub_arr_sum extends App{
  def minSubArrayLen(target: Int, nums: Array[Int]): Int = {
    var l = 0
    var r = 0
    var len = nums.length
    var sum = 0
    var min_len = 0
    var temp_len = 0
    var flag = 0
    while(r < len && l <= r){
      if(flag == 0){
        sum = sum + nums(r)
      }
      if(sum < target){
        r = r + 1
        flag = 0
      }
      else{
        temp_len = (r - l + 1)
        flag = 1
        min_len = if(min_len == 0){
          temp_len
        }else{
          min(temp_len, min_len)
        }

        sum = sum - nums(l)
        l = l + 1
      }
    }
    min_len
  }

  println(minSubArrayLen(7, Array(2,3,1,2,4,3)))
}
