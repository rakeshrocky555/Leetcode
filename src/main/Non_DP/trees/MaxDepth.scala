package Non_DP.trees
import scala.math._

class TreeNode1(_value: Int = 0, _left: TreeNode1 = null, _right: TreeNode1 = null) {
  var value: Int = _value
  var left: TreeNode1 = _left
  var right: TreeNode1 = _right
}

object MaxDepth extends App{
  def maxDepth(root: TreeNode1): Int = {
    root match {
      case null => 0
      case node => 1 + max(maxDepth(node.left), maxDepth(node.right))
    }
  }

  val p1 = new TreeNode1(12, new TreeNode1(6), new TreeNode1(8))
  print(maxDepth(p1))
}
