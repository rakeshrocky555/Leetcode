package dynamic_programming.LCS
import scala.math._

object UncrossedLines extends App{
  def maxUncrossedLines(nums1: Array[Int], nums2: Array[Int]): Int = {
      val rows = nums1.length
      val columns = nums2.length
      var result_matrix = Array.ofDim[Int](rows+1, columns+1)

      for(i <- 0 to rows){
        for(j <- 0 to columns){
          if(i == 0 || j == 0){
            result_matrix(i)(j) = 0
          }
          else{
            if(nums1(i-1) == nums2(j-1)){
              result_matrix(i)(j) = 1 + result_matrix(i-1)(j-1)
            }
            else{
              result_matrix(i)(j) = max(result_matrix(i-1)(j), result_matrix(i)(j-1))
            }
          }
        }
      }

      result_matrix(rows)(columns)
    }

  println(maxUncrossedLines(Array(1, 3, 5), Array(3, 5)))
  }
