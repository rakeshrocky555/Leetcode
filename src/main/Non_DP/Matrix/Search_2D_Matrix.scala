package Non_DP.Matrix

object Search_2D_Matrix extends App{
  def searchMatrix(matrix: Array[Array[Int]], target: Int): Boolean = {
    var result = false
    val m = matrix.length
    val n = matrix(0).length

    var flag = false
    var row_flag = false
    var i = 0
    while(i < m && !row_flag){
      if(matrix(i)(n-1) == target){
        flag = true
        row_flag = true
      }
      else if(matrix(i)(n-1) < target){
        i = i + 1
      }
      else{
        row_flag = true
      }
    }

    row_flag match {
      case false => {
        matrix(0).filter(_ == target).length != 0
      }
      case true => {
        if(flag){
          true
        }
        else{
          matrix(i).filter(_ == target).length != 0
        }
      }
    }
  }


  println(searchMatrix(Array(Array(1,3,5,7),Array(10,11,16,20),Array(23,30,34,60)), 23))
}
