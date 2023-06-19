package Non_DP

import scala.math._
object TRailing_zeroes extends App{
  def trailingZeroes(n: Int): Int = {
    var fives = 0
    var num_of_fives = 1

    for(i <- 1 to n){
      num_of_fives = 1
      if(i % 5 == 0){
        var denominator = 5
        while((i % denominator == 0) && (denominator <= i)){
          //increment for the five squares
          num_of_fives = num_of_fives + 1
          denominator = pow(5, num_of_fives).toInt
        }
        fives = fives + num_of_fives - 1
      }
    }
    //return the result
    fives
  }

  println(trailingZeroes(30))
}
