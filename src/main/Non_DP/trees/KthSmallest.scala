package Non_DP.trees

class TreeNode1k(_value: Int = 0, _left: TreeNode1k = null, _right: TreeNode1k = null) {
  var value: Int = _value
  var left: TreeNode1k = _left
  var right: TreeNode1k = _right
}

object KthSmallest extends App{
  def kthSmallest(root: TreeNode1k, k: Int): Int = {

    //inorder traversal list kth element from the tree

    def function(node: TreeNode1k): List[Int] = {
      node match {
        case null => List()
        case _ => {
          function(node.left) ++ List(node.value) ++ function(node.right)
        }
      }
    }

    function(root)(k - 1)

  }


  val p1 = new TreeNode1k(12, new TreeNode1k(6), new TreeNode1k(8))
  kthSmallest(p1, 1)
}
