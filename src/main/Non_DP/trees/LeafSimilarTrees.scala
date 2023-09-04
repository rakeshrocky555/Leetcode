package Non_DP.trees

class TreeNodeLS(_value: Int = 0, _left: TreeNodeLS = null, _right: TreeNodeLS = null) {
  var value: Int = _value
  var left: TreeNodeLS = _left
  var right: TreeNodeLS = _right
}

object LeafSimilarTrees extends App{
  def leafSimilar(root1: TreeNodeLS, root2: TreeNodeLS): Boolean = {

    //inorder traversal
    def inorder_traversal(node: TreeNodeLS): List[Int] = {
      node match {
        case null => Nil
        //case n if((n.left == null) && (n.right == null)) => List(n.value)
        case _ => {
          inorder_traversal(node.left) ++ {
            node match {
              case nd if ((nd.left == null) && (nd.right == null)) => List(nd.value)
              case _ => Nil
            }
          } ++ inorder_traversal(node.right)
        }
      }
    }

    //calling statement
    inorder_traversal(root1) == inorder_traversal(root2)
  }

  val p1 = new TreeNodeLS(12, new TreeNodeLS(6), new TreeNodeLS(8))
  val p2 = new TreeNodeLS(12, new TreeNodeLS(6), new TreeNodeLS(8))
  println(leafSimilar(p1, p2))

}
