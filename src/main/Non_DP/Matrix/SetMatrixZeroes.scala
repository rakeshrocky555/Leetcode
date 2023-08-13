package Non_DP.Matrix

object SetMatrixZeroes extends App{

    def getColumn(m: Array[Array[Int]], r: Int, col: Int): Array[Int] = {
      var arr = Array.ofDim[Int](r)
      arr = Array()
      for(i <- 0 until r){
        arr = arr :+ m(i)(col)
      }
      //arr.foreach(print)
      //println
      arr
    }

    def setZeroes(matrix: Array[Array[Int]]): Unit = {
      val rows = matrix.length
      val columns = matrix.head.length
      var matrix_r = Array.ofDim[Int](rows, columns)
      var matrix_c = Array.ofDim[Int](rows, columns)

      //rows
      for(i <- 0 until rows){
        for(j <- 0 until columns){
          if(matrix(i).indexOf(0) != -1){
            matrix_r(i)(j) = 0
          }
          else{
            matrix_r(i)(j) = matrix(i)(j)
          }
        }
      }



      //columns
      for(i <- 0 until columns){
        var column = getColumn(matrix, rows, i)
        //column.foreach(println)
        for(j <- 0 until rows){
          print(column.indexOf(0))
          if(column.indexOf(0) != -1){
            matrix_c(j)(i) = 0
          }
          else if((i < columns) && (j < rows)){
            matrix_c(j)(i) = matrix(j)(i)
          }
        }
      }

      //updating the matrix
      for(i <- 0 until rows){
        for(j <- 0 until columns){
          matrix(i)(j) = if((matrix_r(i)(j) == 0) || (matrix_c(i)(j) == 0)){
            0
          }
          else{
            matrix(i)(j)
          }
        }
      }


    }

  println(setZeroes(Array(Array(1, 2), Array(3, 4))))
  }
