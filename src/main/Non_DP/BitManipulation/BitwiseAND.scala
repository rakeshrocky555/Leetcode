package Non_DP.BitManipulation

object BitwiseAND extends App{
    def rangeBitwiseAnd(left: Int, right: Int): Int = {

      var result = left & right
      var operand = (left + 1)
      while((operand < right) && (operand > left)){
        result = result & operand
        operand = operand + 1
      }

      result

    }

  println(rangeBitwiseAnd(5, 7))
  }
