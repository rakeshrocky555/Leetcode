package dynamic_programming.longest_increasing_subseq

object Number_of_LIS extends App{
  def findNumberOfLIS(nums: Array[Int]): Int = {
    var len = nums.length
    var res = Array.fill(len)(1)
    var counts = Array.fill(len)(1)
    var i = 0
    var j = 0

    for(i <- 1 to len-1){
      for(j <- 0 to i-1){
        if((nums(i) > nums(j)) && (res(i) <= res(j))){
          res(i) = res(i) + 1
          counts(i) = counts(j)
        }
        else if(res(i) == 1+res(j) && (nums(i) >= nums(j))){
          counts(i) = counts(i) + 1
        }
      }
    }
    counts(len-1)
  }

  println(findNumberOfLIS(Array(1,2,3,2,1,23)))
}
