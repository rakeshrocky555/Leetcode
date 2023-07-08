package dynamic_programming.strings

import scala.math._
object Edit_Distance extends App{
  def minDistance(word1: String, word2: String): Int = {
    val result = {
      val rows = word1.length
      val columns = word2.length
      var result_matrix = Array.ofDim[Int](rows+1, columns+1)

      for(i <- 0 to rows){
        for(j <- 0 to columns){
          if(i == 0 || j == 0){
            result_matrix(i)(j) = max(i, j)
          }
          else{
            if(word1(i-1) == word2(j-1)){
              result_matrix(i)(j) = result_matrix(i-1)(j-1)
            }
            else{
              result_matrix(i)(j) = 1 + min(min(result_matrix(i-1)(j), result_matrix(i)(j-1)), result_matrix(i-1)(j-1))
            }
          }
        }
      }

      result_matrix(rows)(columns)
    }
    result
  }

  println(minDistance("abc", "def"))
}
