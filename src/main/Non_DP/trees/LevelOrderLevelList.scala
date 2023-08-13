package Non_DP.trees

class TreeNode1L(_value: Int = 0, _left: TreeNode1L = null, _right: TreeNode1L = null) {
  var value: Int = _value
  var left: TreeNode1L = _left
  var right: TreeNode1L = _right
}


object LevelOrderLevelList extends App{
    def levelOrder(root: TreeNode1L): List[List[Int]] = {
      var list_nodes = List[TreeNode1L]()
      var node_values = List[Int]()
      var res = List[List[Int]]()

      if(root == null){
        res
      }
      else{
        //base case
        list_nodes = List(root)
        var nodes = list_nodes

        //iteration
        while(list_nodes != List[TreeNode1L]()){

          var values = List[Int]()

          //appending values
          list_nodes.foreach(node => {
            print(node.value)
            values = values :+ node.value
          })

          println()
          //append the list to the array
          res = res ++ List(values)

          //node_values = node_values :+ root.value
          nodes = List[TreeNode1L]()
          list_nodes.foreach(node => {
            nodes = nodes ++ (List(node.left, node.right).filter(_ != null))
          })
          list_nodes = nodes

        }
        //return the array
        res
      }
    }
  
  val p1 = new TreeNode1L(12, new TreeNode1L(6), new TreeNode1L(8))
  println(levelOrder(p1))
  }
