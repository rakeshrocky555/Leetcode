package Non_DP.trees


 //Definition for a binary tree node.
 class TreeNode(_value: Int = 0, _left: TreeNode = null, _right: TreeNode = null) {
    var value: Int = _value
    var left: TreeNode = _left
    var right: TreeNode = _right
 }

object SameTrees extends App{
  def isSameTree(p: TreeNode, q: TreeNode): Boolean = {
    (p, q) match {
      case (null, null) => true
      case (t1, t2) if(t1 != null && t2 != null) => if(t1.value != t2.value){
        false
      }
      else{
        isSameTree(t1.left, t2.left) && isSameTree(t1.right, t2.right)
      }
      case _ => false
    }
  }

  val p1 = new TreeNode(12, new TreeNode(6), new TreeNode(8))
  val p2 = new TreeNode(12, new TreeNode(6), new TreeNode(7))
  print(isSameTree(p1, p2))
}
