package dynamic_programming.longest_increasing_subseq

object LIS extends App{
  def lengthOfLIS(nums: Array[Int]): Int = {
    var len = nums.length
    var res = Array.fill(len)(1)
    var i = 0
    var j = 0

    for (i <- 1 to len - 1) {
      for (j <- 0 to i-1) {
        if ((nums(i) > nums(j)) && (res(i) <= res(j))) {
          res(i) = res(i) + 1
        }
      }
    }

    res(len - 1)
  }

  println(lengthOfLIS(Array(7,7,7,7,7)))
}
