package dynamic_programming.strings
import scala.math._

object LCS extends App{
  def longestCommonSubsequence(text1: String, text2: String): Int = {
    val rows = text1.length
    val columns = text2.length
    var result_matrix = Array.ofDim[Int](rows + 1, columns + 1)

    for (i <- 0 to rows) {
      for (j <- 0 to columns) {
        if (i == 0 || j == 0) {
          result_matrix(i)(j) = 0
        }
        else {
          if (text1(i - 1) == text2(j - 1)) {
            result_matrix(i)(j) = 1 + result_matrix(i - 1)(j - 1)
          }
          else {
            result_matrix(i)(j) = max(result_matrix(i - 1)(j), result_matrix(i)(j - 1))
          }
        }
      }
    }

    result_matrix(rows)(columns)
  }

  print(longestCommonSubsequence("bde", "abcbde"))
}
