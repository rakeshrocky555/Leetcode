package dynamic_programming

object UniqueBST  extends App{
  def numTrees(n: Int): Int = {

    var res_arr = Array.ofDim[Int](n + 1)
    res_arr(0) = 1
    res_arr(1) = 1
    var temp_total = 0

    n match {
      case nof if((nof == 0) || (nof == 1)) => 1
      case _ => {
        for(node <- 2 to n){
          temp_total = 0
          for(root <- 1 to node){
            var left = root - 1
            var right = node - root
            temp_total = temp_total + (res_arr(left) * res_arr(right))
          }
          res_arr(node) = temp_total
        }

        //result
        res_arr(n)
      }
    }
  }
  println(numTrees(5))
}
