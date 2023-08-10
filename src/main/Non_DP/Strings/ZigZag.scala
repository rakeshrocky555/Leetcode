package Non_DP.Strings

object ZigZag extends App{

  def convert(s: String, numRows: Int): String = {
    var current = 0
    var result = ""
    var flag = 0

    for (row <- 0 to (numRows - 1)) {
      current = row
      flag = 0
      while (current < s.length) {
        result = result + s(current)
        val op1 = (2 * (numRows - 1) - 2 * (row))
        val op2 = (2 * (numRows - 1) - 2 * (numRows - 1 - row))
        //println(result)
        current = if (row == (numRows - 1)) {
          current + (2 * (numRows - 1) - 2 * (numRows - 1 - row))
        } else if ((flag % 2 == 0) || (row == 0) || (row == (numRows - 1))) {
          current + op1
        }
        else {
          current + op2
        }
        flag = flag + 1
      }
    }
    //result
    result
  }

  println(convert("PAYPALISHIRING", 3))
  println("Printing result")
  }
