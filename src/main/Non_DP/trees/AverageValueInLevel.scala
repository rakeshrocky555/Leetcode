package Non_DP.trees

class TreeNodeA1(_value: Int = 0, _left: TreeNodeA1 = null, _right: TreeNodeA1 = null) {
  var value: Int = _value
  var left: TreeNodeA1 = _left
  var right: TreeNodeA1 = _right
}

object AverageValueInLevel extends App{
    def averageOfLevels(root: TreeNodeA1): Array[Double] = {
      var list_nodes = List[TreeNodeA1]()
      var node_values = List[Int]()
      var res = Array[Double]()

      if(root == null){
        Array(0.toDouble)
      }
      else{
        //base case
        list_nodes = List(root)
        var nodes = list_nodes

        //iteration
        while(list_nodes != List[TreeNodeA1]()){

          var values = List[Int]()

          //appending values
          list_nodes.foreach(node => {
            print(node.value)
            values = values :+ node.value
          })

          println()
          //calculate average of all the values in the array
          res = res :+ (values.map(_.toDouble).sum/(values.length.toDouble))

          //node_values = node_values :+ root.value
          nodes = List[TreeNodeA1]()
          list_nodes.foreach(node => {
            nodes = nodes ++ (List(node.left, node.right).filter(_ != null))
          })
          list_nodes = nodes

          //empty the node

        }
        //return the array
        res
      }
    }

  val p1 = new TreeNodeA1(12, new TreeNodeA1(6), new TreeNodeA1(8))
  println(averageOfLevels(p1))
  }
