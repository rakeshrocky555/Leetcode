package Non_DP.trees

class TreeNode1v(_value: Int = 0, _left: TreeNode1v = null, _right: TreeNode1v = null) {
  var value: Int = _value
  var left: TreeNode1v = _left
  var right: TreeNode1v = _right
}

object ValidateBST extends App{
  def isValidBST(root: TreeNode1v): Boolean = {

    //inorder traversal needs to be in ascending order

    def function(node: TreeNode1v): List[Int] = {
      node match {
        case null => List()
        case _ => {
          function(node.left) ++ List(node.value) ++ function(node.right)
        }
      }
    }

    val inorder_list = function(root)
    inorder_list.foreach(println)
    //(inorder_list.sorted.toSet.toList).foreach(print)

    inorder_list.zip(inorder_list.sorted.toSet.toList.sorted).filter(value => {value._1 == value._2}).length == (inorder_list.length)
  }

  val p1 = new TreeNode1v(12, new TreeNode1v(6), new TreeNode1v(8))
  isValidBST(p1)
}
