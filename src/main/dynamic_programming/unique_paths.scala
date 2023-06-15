object Solution_1 {
    def uniquePaths(m: Int, n: Int): Int = {
        var arr = Array.ofDim[Int](m, n)
        for(i <- 0 to m-1){
            arr(i)(n-1) = 1
        }
        for(i <- 0 to n-1){
            arr(m-1)(i) = 1
        }
        for(i <- m-2 to 0 by -1){
            for(j <- n-2 to 0 by -1){
                arr(i)(j) = arr(i+1)(j) + arr(i)(j+1)
            }
        }
    arr(0)(0)
    }
}
