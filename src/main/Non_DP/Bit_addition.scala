package Non_DP


import scala.math._
object Bit_addition extends App{
  def addBinary(a: String, b: String): String = {

    var a1 = a.reverse
    var b1 = b.reverse
    var a_digit = 0
    var b_digit = 0
    var carry = 0
    var fin_result = ""
    var temp_sum = 0

    for(i <- 0 to (max(a.length, b.length) - 1)){
      a_digit = if(i < a1.length){a1(i).toString.toInt} else 0
      b_digit = if(i < b1.length){b1(i).toString.toInt} else 0

      //
      temp_sum = a_digit + b_digit + carry

      if(temp_sum < 2){
        carry = 0
        fin_result =  temp_sum.toString + fin_result
      }
      else if(temp_sum == 2){
        carry = 1
        fin_result = "0" + fin_result
      }
      else{
        carry = 1
        fin_result = "1" + fin_result
      }
    }

    if(carry == 1){
      "1" + fin_result
    }
    else{
      fin_result
    }
  }

  println(addBinary("1000", "1010"))
}
