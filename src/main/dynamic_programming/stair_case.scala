object StairCase extends App{
    def climbStairs(n: Int): Int = {
        var res: Int = 0
        var arr = new Array[Int](n+1)
        for(i <- 0 to n){
            arr(0) = 0
        }
        n match {
                case value if(n == 0) => res = 0
                case value if(n == 1) => res = 1
                case _ => {
                    arr(n-1) = 1
                    arr(n) = 1
                    for(i <- n-2 to 0 by -1){
                        arr(i) = arr(i+1) + arr(i+2)
                    }
                    res = arr(0)
                }
        }
    res
    }
}
