package Non_DP.twopointers

object MoveZeroes extends App{
    def moveZeroes(nums: Array[Int]): Unit = {
      var pivot = 0
      var temp = 0
      var nums1 = nums
      for(i <- 0 until nums1.length){
        if(nums(i) != 0){
          temp = nums(i)
          nums(i) = nums(pivot)
          nums(pivot) = temp
          pivot += 1
        }
      }
      nums1
    }

    println(moveZeroes(Array(1,0,1)))
  }
