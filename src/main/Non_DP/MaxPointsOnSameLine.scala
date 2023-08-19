package Non_DP
import scala.math._

object MaxPointsOnSameLine extends App{

    def maxPoints(points: Array[Array[Int]]): Int = {

      var hash_mp = Map[Double, Int]()

      var slope = 0.toDouble
      var numer = 0
      var denom = 0
      var res = 1

      for(i <- 0 until (points.length - 1)){
        for(j <- (i + 1) until points.length){
          numer = points(j)(1) - points(i)(1)
          denom = points(j)(0) - points(i)(0)
          slope = denom match {
            case 0 => -9999.toDouble
            case _ => (numer.toDouble/denom.toDouble)
          }
          hash_mp.get(slope) match {
            case Some(s) => {
              hash_mp = hash_mp ++ Map(slope -> (s + 1))
            }
            case None => {
              hash_mp = hash_mp ++ Map(slope -> 1)
            }
          }
        }
        res = max(res, hash_mp.values.toList.max + 1)
        hash_mp = Map[Double, Int]()
      }
      //result
      res
    }

 println(maxPoints(Array(Array(1, 2), Array(3, 5))))
  }
