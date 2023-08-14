package dynamic_programming.longest_increasing_subseq

object LongestDifference extends App{
    def longestSubsequence(arr: Array[Int], difference: Int): Int = {
      var len = arr.length
      var arr1 = Array.ofDim[Long](arr.length)
      for(i <- 0 until arr.length){
        arr1(i) = arr(i)
      }
      //arr1 = arr
      var res = Array.fill(len)(1)
      var i = 0
      var j = 0

      for (i <- 1 to len - 1) {
        for (j <- 0 to i-1) {
          if ((arr1(i) == (difference + arr1(j))) && (res(i) <= res(j))) {
            res(i) = res(j) + 1
          }
        }
      }
      //res.foreach(println)
      res.max
    }

  println(longestSubsequence(Array(1,5,7,8,5,3,4,2,1), -2))
  }