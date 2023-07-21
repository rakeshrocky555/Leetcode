package Non_DP.hashing

object Single_number extends App{

    def singleNumber(nums: Array[Int]): Int = {
      var hashmp = Map[Int, Int]()
      nums.foreach(value => {
        hashmp = hashmp ++ Map(value -> (hashmp.getOrElse(value, 0) + 1))
      })
      //return the result in linear time
      hashmp.filter(value => (value._2 == 1)).head._1
    }

  println(singleNumber(Array(1,2,1)))
  }
