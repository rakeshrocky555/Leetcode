object Solution {
    def twoSum(nums: Array[Int], target: Int): Array[Int] = {
        // var i = 0
        // var j = 0
        var res = Array(0,0)
        for(i <- 0 until (nums.length - 1)){
            for(j <- i + 1 until nums.length)
            if(nums(i) + nums(j) == target){
                res(0) = i
                res(1) = j
            }
    }
    res
}
}
