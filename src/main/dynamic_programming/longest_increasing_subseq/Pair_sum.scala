package dynamic_programming.longest_increasing_subseq

object Pair_sum extends App{
  def findLongestChain(pairs: Array[Array[Int]]): Int = {
    var len = pairs.length
    var res = Array.fill(len)(1)
    var i = 0
    var j = 0

    val pairs_1 = pairs.sortBy(_ (1))
    for (i <- 1 to len - 1) {
      for (j <- 0 to i - 1) {
        if ((pairs_1(i)(0) > pairs_1(j)(1)) && (res(i) <= res(j))) {
          res(i) = res(i) + 1
        }
      }
    }

    res.max
  }

  println(findLongestChain(Array(Array(1,2), Array(3,4))))
}
