object Solution {
    def removeDuplicates(nums: Array[Int]): Int = {
        val len = nums.length
        val u_list = nums.toSet.toList.sorted
        val u_len = u_list.size
        for(i <- 0 to len-1){
            if(i < u_len){
                nums(i) = u_list(i)
            }
            else{
                nums(i) = 0
            }
        }
        u_len
    }
}
