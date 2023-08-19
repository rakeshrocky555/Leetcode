package Non_DP.ArrayModule

object MergeSortedArray extends App{
    def merge(nums1: Array[Int], m: Int, nums2: Array[Int], n: Int): Unit = {

      //bringing zeroes to the begining
      for(i <- (m-1) to 0 by -1){
        nums1(i + n) = nums1(i)
      }
      for(i <- 0 to (n-1)){
        nums1(i) = 0
      }

      var counter = 0
      var i = n
      var j = 0
      //core logic
      while(counter < (m + n)){
        if((i < (m + n)) && (j < n) && (nums1(i) < nums2(j))){
          nums1(counter) = nums1(i)
          i = i + 1
        }
        else if(j < n){
          nums1(counter) = nums2(j)
          j = j + 1
        }
        counter = counter + 1
      }
    }

  println(merge(Array(1,2,3,0,0,0), 3, Array(2,5,6), 3))
  }
