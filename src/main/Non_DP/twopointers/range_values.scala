package Non_DP.twopointers

object range_values extends App{
    def summaryRanges(nums: Array[Int]): List[String] = {

      var res_array = Array[String]()
      var l = 0
      var r = 0

      for (i <- 0 to nums.length - 1) {
        if (i == 0) {
          l = 0
          r = 0
        } else if (nums(i) == (1 + nums(i - 1))) {
          r = i
        } else {
          //appending
          if (l == r) {
            res_array = res_array ++ Array(nums(l).toString)
          } else {
            res_array = res_array ++ Array((nums(l).toString) + ("->") + (nums(r).toString))
          }
          l = i
          r = i
        }
      }
      //append for last one
      if (l == r && nums.length != 0) {
        res_array = res_array ++ Array(nums(l).toString)
      } else if (nums.length != 0) {
        res_array = res_array ++ Array((nums(l).toString) + ("->") + (nums(r).toString))
      }

      res_array.toList

    }

  println(summaryRanges(Array(0,1,2,4,5,6,8,9)))
  }
