import scala.math._
object Peak_Element extends App{
  def findPeakElement(nums: Array[Int]): Int = {
    var i = 0
    var flag = true
    var res = 0

    while(i < nums.length && flag){
      i match {
        case 0 => {
          if(nums.length == 1){
            flag = false
          }
          else if(nums(i+1) < nums(i)){
            res = 0
          }
          i = i + 1
        }
        case numb => {
          if(numb == nums.length-1){
            if(nums(i) > nums(i-1)){
              res = i
              flag = false
            }
          }
          else if(nums(i) > max(nums(i+1), nums(i-1))){
            res = i
            flag = false
          }
          i = i + 1
        }
      }
    }
    res
  }

  println(findPeakElement(Array(1,2,1)))
}
