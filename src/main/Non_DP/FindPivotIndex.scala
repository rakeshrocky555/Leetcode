package Non_DP

object FindPivotIndex extends App{
    def pivotIndex(nums: Array[Int]): Int = {
      var total_sum = nums.fold(0)(_ + _)
      var left = 0
      var right = 0
      var result = -1
      var flag = false
      var i = 0

      while((!flag) && (i < nums.length)){
        i match {
          case 0 => {
            left = 0
            right = total_sum - nums(i)
          }
          case _ => {
            left = left + nums(i - 1)
            right = right - nums(i)
          }
        }
        if(left == right){
          result = i
          flag = true
        }
        i += 1
      }
      //result
      result
    }

  println(pivotIndex(Array(1,7,3,6,5,6)))
  }
