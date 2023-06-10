import scala.math._

object Solution {
    def minPathSum(grid: Array[Array[Int]]): Int = {
        val r = grid.length
        val c = grid.head.length
        var res_grid = Array.ofDim[Int](r, c)
        for(i <- r-1 to 0 by -1){
            for(j <- c-1 to 0 by -1){
                if(j==c-1 && i==r-1){
                    res_grid(i)(j) = grid(i)(j)
                }
                else if(i==r-1){
                    res_grid(i)(j) = grid(i)(j) + res_grid(i)(j+1)
                }
                else if(j==c-1){
                    res_grid(i)(j) = grid(i)(j) + res_grid(i+1)(j)
                }
                else{
                    res_grid(i)(j) = grid(i)(j) + min(res_grid(i+1)(j), res_grid(i)(j+1))
                }
            }
        }
        res_grid(0)(0)
    }
}
