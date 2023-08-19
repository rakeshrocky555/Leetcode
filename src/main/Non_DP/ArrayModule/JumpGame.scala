package Non_DP.ArrayModule

object JumpGame extends App{
    def canJump(nums: Array[Int]): Boolean = {
      var i = nums.length - 2
      var jump = 1
      while(i >= 0){
        if(nums(i) >= jump){
          jump = 1
        }
        else{
          jump = jump + 1
        }
        i -= 1
      }
      jump == 1
    }

  println(canJump(Array(3,2,1,0,4)))
  }
