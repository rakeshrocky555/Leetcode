object Solution {
    def removeElement(nums: Array[Int], `val`: Int): Int = {
        
        val res = nums.filter(_ != `val`)
        for(i <- 0 to res.length-1){
            nums(i) = res(i)
        }
        res.length
        
    }
}
