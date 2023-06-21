package Non_DP.trees

class TreeNode2(_value: Int = 0, _left: TreeNode2 = null, _right: TreeNode2 = null) {
  var value: Int = _value
  var left: TreeNode2 = _left
  var right: TreeNode2 = _right
}


object Inverse_BT extends App{
  def invertTree(root: TreeNode2): TreeNode2 = {
    var node_temp = new TreeNode2
    def invert(node1: TreeNode2): TreeNode2 = {
      node1 match {
        case null => null
        case node if(node.left == null && node.right == null) => node
        case node => {
          node_temp = node.left
          node.left = node.right
          node.right = node_temp

          node.left = invert(node.left)
          node.right = invert(node.right)
          node
        }
      }
    }


    val result = invert(root)
    //return the answer
    result
  }


  val p1 = new TreeNode2(12, new TreeNode2(6), new TreeNode2(8))
  print(invertTree(p1))
}
