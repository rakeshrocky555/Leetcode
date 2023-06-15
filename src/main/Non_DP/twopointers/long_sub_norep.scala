package Non_DP.twopointers
import scala.math._
object long_sub_norep extends App{
  def lengthOfLongestSubstring(s: String): Int = {
    var temp_map = Map[Char, Int]()
    var max_length = 0
    var l = 0
    var r = 0

    while(r < s.length && l <= r){
      if(temp_map.get(s(r)) == None){
        temp_map = temp_map ++ Map(s(r) -> 0)
        //temp_length = temp_length + 1
        max_length = max(max_length, (r - l + 1))
        r = r + 1
      }
      else{
        temp_map = temp_map.filter(value => value._1 != s(l))
        l = l + 1
      }
    }

    max_length
  }

  println(lengthOfLongestSubstring("abcab"))
}