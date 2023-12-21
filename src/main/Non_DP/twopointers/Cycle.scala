package Non_DP.twopointers


import scala.math._
import scala.collection.mutable.Stack
//REACT - Read Examples Analysis Code Test

class ListNodeC(_x: Int = 0){
  var next: ListNodeC = null
  var x = _x
}

object Main extends App {
  def hasCycle(slow: ListNodeC, fast: ListNodeC): Boolean = {
    (slow, fast) match {
      case (l, r) if(l == r) => true
      case (l, r) if((l != null) && (r != null) && (r.next != null)) => hasCycle(l.next, r.next.next)
      case (_, _) => false
    }
  }

  var n = new ListNodeC(1)
  n.next = new ListNodeC(2)
  n.next.next = n

  val result = Option(n).fold(false)(node => hasCycle(node, node.next))
  print(result)
}
