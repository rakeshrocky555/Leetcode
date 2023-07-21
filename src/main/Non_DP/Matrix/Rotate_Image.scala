package Non_DP.Matrix

object Rotate_Image extends App{

  def rotate(matrix: Array[Array[Int]]): Unit = {
    val n = matrix.length
    var result = Array.ofDim[Int](n, n)

    for(i <- 0 to n-1){
      for(j <- 0 to n-1){
        result(j)(n-1-i) = matrix(i)(j)
      }
    }

    //return the result
    for(i <- 0 to n-1){
      for(j <- 0 to n-1){
        matrix(i)(j) = result(i)(j)
        println(matrix(i)(j))
      }
    }

    //matrix.foreach(println)
  }

  rotate(Array(Array(1,2), Array(3,4)))
}
