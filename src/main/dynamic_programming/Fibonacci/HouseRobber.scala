package dynamic_programming.Fibonacci
import scala.math._
object HouseRobber extends App{

  def rob(nums: Array[Int]): Int = {

    val len = nums.length
    var res1 = 0
    var res2 = 0
    var temp = 0


    // def func(index: Int): Int = index match {
    //     case i if(i < len) => max(nums(i) + (if((i + 2) < len) {func(i + 2)} else 0),
    //         if((i+1) < len) {nums(i+1) + (if((i + 3) < len) {func(i + 3)} else 0)} else {0})
    //     case _ => 0
    // }

    for(i <- 0 to (len - 1)){
      res1 = max(nums(i) + res1, res2)
      temp = res1
      res1 = res2
      res2 = temp
    }

    //result
    res2

  }

  rob(Array(2,7,9,3,1))
}
