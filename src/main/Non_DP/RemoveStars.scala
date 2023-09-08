package Non_DP
import scala.collection.mutable.Stack

object RemoveStars extends App{
  def removeStars(s: String): String = {
      var stk = Stack[Char]()
      for (i <- 0 until s.length) {
        s(i) match {
          case '*' => {
            if (!(stk.isEmpty)) {
              stk.pop()
            }
          }
          case _ => stk.push(s(i))
        }
      }
      //result
      stk.mkString("").reverse
    }
  println(removeStars("Leet*code*"))
}
