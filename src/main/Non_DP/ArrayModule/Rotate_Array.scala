package Non_DP.ArrayModule

object Rotate_Array extends App{

    def rotate(nums: Array[Int], k: Int): Unit = {

      val steps = (k % (nums.length)).toInt
      var nums1 = Array.ofDim[Int](nums.length)
      for(i <- 0 to (nums.length - 1)){
        nums1(i) = nums(i)
      }
      //nums1.foreach(println)

      for(i <- 0 to (nums.length - 1)){
        //nums1.foreach(print)
        nums(((i + steps) % (nums.length))) = nums1(i)
      }

      nums.foreach(println)
    }

  println(rotate(Array(1,2,3,4,5,6,7), 3))
  }
