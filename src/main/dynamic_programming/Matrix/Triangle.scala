package dynamic_programming.Matrix
import scala.math._

object Triangle extends App{

  def minimumTotal(triangle: List[List[Int]]): Int = {

    var row = triangle.length - 1
    var result = Array.ofDim[Int]((row+1), (row+1))
    var index = 0
    var i = 0
    while(row >= 0){
      i = 0
      while(i < triangle(row).length){
        if(row == (triangle.length - 1)){
          result(row)(i) = triangle(row)(i)
        }
        else{
          result(row)(i) = triangle(row)(i) + min(result(row + 1)(i), result(row + 1)(i + 1))
        }
        i = i + 1
      }
      row = row - 1
    }

    result(0)(0)
    //result
    //func(0, 0)
  }

  println(minimumTotal(List(List(-10))))
}
