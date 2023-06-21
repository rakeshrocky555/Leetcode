package Non_DP.trees

class TreeNode3(_value: Int = 0, _left: TreeNode3 = null, _right: TreeNode3 = null) {
  var value: Int = _value
  var left: TreeNode3 = _left
  var right: TreeNode3 = _right
}

object Symmetric_BT extends App{
  def isSymmetric(root: TreeNode3): Boolean = {
    def helper(l: TreeNode3, r: TreeNode3): Boolean = {
      if (l == null && r == null) true
      else if (l == null || r == null) false
      else l.value == r.value && helper(l.left, r.right) && helper(l.right, r.left)
    }

    if (root == null) true
    else helper(root.left, root.right)
  }

  val p1 = new TreeNode3(12, new TreeNode3(6), new TreeNode3(8))
  println(isSymmetric(p1))
}
