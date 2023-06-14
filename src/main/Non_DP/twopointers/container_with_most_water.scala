package Non_DP.twopointers

import scala.math.min

object container_with_most_water extends App {
  def maxArea(height: Array[Int]): Int = {

    var l = 0
    var r = height.length - 1
    var temp_area = 0
    var max_area = 0

    //iterate using two pointer technique
    while (l < r) {
      temp_area = (r - l) * (min(height(l), height(r)))
      if (temp_area > max_area) {
        max_area = temp_area
      }
      //exchange the heights
      if (height(l) > height(r)) {
        r = r - 1
      }
      else {
        l = l + 1
      }
    }

    max_area

  }

  println(maxArea(Array(1, 8, 6, 2, 5, 4, 8, 3, 7)))
}
