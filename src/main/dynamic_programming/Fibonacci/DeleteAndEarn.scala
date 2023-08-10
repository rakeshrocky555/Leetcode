package dynamic_programming.Fibonacci
import scala.math._

object DeleteAndEarn extends App{

  def deleteAndEarn(nums: Array[Int]): Int = {
    //val nums_sorted = nums

    //val nums_unique = nums.sorted.toSet
    var hs_map = Map[Int, Int]()

    nums.foreach(value => {
      if(hs_map.getOrElse(value, 0) != 0){
        hs_map = hs_map ++ Map(value -> (hs_map.getOrElse(value, 0) + 1))
      }
      else {
        hs_map = hs_map ++ Map(value -> 1)
      }
    })

    val nums_unique = hs_map.keys.toList.sorted
    var res = Array.ofDim[Int](nums_unique.length)


    //iteration
    res(0) = nums_unique.head * hs_map.getOrElse(nums_unique.head, 0)

    for(i <- 1 to (nums_unique.length - 1)){
      if(nums_unique(i) != (nums_unique(i - 1) + 1)){
        res(i) = (nums_unique(i) * hs_map.getOrElse(nums_unique(i), 0)) + res(i - 1)
      }
      else{
        res(i) = max(res(i - 1), if((i - 2) >= 0){
          res(i - 2) + (nums_unique(i) * hs_map.getOrElse(nums_unique(i), 0))
        }
        else{
          nums_unique(i) * hs_map.getOrElse(nums_unique(i), 0)
        })

      }
    }

    res.last



  }

  println(deleteAndEarn(Array(2,2,3,3,3,4)))
}
