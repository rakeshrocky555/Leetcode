package Non_DP.twopointers

object three_sum extends App{
  def threeSum(nums: Array[Int]): List[List[Int]] = {
    var i = 0
    var l = 0
    var r = 0
    var res = List[List[Int]]()
    var target = 0
    var temp_sum = 0

    var nums1 = nums.sorted
    for(i <- 0 to (nums1.length - 3)){
      target = nums1(i)
      l = (i + 1)
      r = (nums.length - 1)
      while((l < r) && (l < nums.length) && (r < nums.length)) {
        temp_sum = target + nums1(l) + nums1(r)
        if(temp_sum == 0){
          res = res ++ List(List(nums1(i), nums1(l), nums1(r)))
          l = l + 1
          while((nums1(l - 1) == nums1(l)) && (l < r)){
            l = l + 1
          }
        }
        else if(temp_sum < 0){
          l = l + 1
        }
        else{
          r = r - 1
        }
      }
    }

    //return the result
    res.toSet.toList
  }

  println(threeSum(Array(1,0,1,2,-1,-4)))
}
