package dynamic_programming

object Unique_Paths2 extends App{
  def uniquePathsWithObstacles(obstacleGrid: Array[Array[Int]]): Int = {
    val m = obstacleGrid.length
    val n = obstacleGrid(0).length

    var arr = Array.ofDim[Int](m, n)
    var flag = 0
    for(i <- m-1 to 0 by -1){
      if(obstacleGrid(i)(n-1) == 1 || flag == 1){
        arr(i)(n-1) = 0
        flag = 1
      }
      else{
        arr(i)(n-1) = 1
      }
    }
    flag = 0

    for(i <- n-1 to 0 by -1){
      if(obstacleGrid(m-1)(i) == 1 || flag == 1){
        arr(m-1)(i) = 0
        flag = 1
      }
      else{
        arr(m-1)(i) = 1
      }
    }


    for(i <- m-2 to 0 by -1){
      for(j <- n-2 to 0 by -1){
        if(obstacleGrid(i)(j) == 1){
          arr(i)(j) = 0
        }
        else{
          arr(i)(j) = arr(i+1)(j) + arr(i)(j+1)
        }
      }
    }

    arr(0)(0)
  }

  println(uniquePathsWithObstacles(Array(Array(0,0,0), Array(0,1,0))))
}