package Non_DP.trees

class TreeNodeMS(_value: Int = 0, _left: TreeNodeMS = null, _right: TreeNodeMS = null) {
  var value: Int = _value
  var left: TreeNodeMS = _left
  var right: TreeNodeMS = _right
}

object MaxlevelSumOfBT extends App{
  def maxLevelSum(root: TreeNodeMS): Int = {
    var list_nodes = List[TreeNodeMS]()
    var node_values = List[Int]()
    var res = 0

    var level = 1
    var max_level = level
    var sum = 0
    var max_sum = 0

    //start the logic
    if (root == null) {
      max_level
    }
    else {
      //base case
      list_nodes = List(root)
      var nodes = list_nodes
      max_sum = root.value

      //iteration
      while (list_nodes != List[TreeNode]()) {

        var values = List[Int]()

        //appending values
        list_nodes.foreach(node => {
          print(node.value)
          values = values :+ node.value
        })

        println()
        //calculate average of all the values in the array
        res = (values.sum)

        nodes = List[TreeNodeMS]()
        list_nodes.foreach(node => {
          nodes = nodes ++ (List(node.left, node.right).filter(_ != null))
        })
        list_nodes = nodes

        //logic for the updating the value of level
        if (max_sum < res) {
          max_level = level
          max_sum = res
        }

        //incrementing the level
        level += 1
      }
      //return the array
      max_level
    }
  }

  val p1 = new TreeNodeMS(12, new TreeNodeMS(6), new TreeNodeMS(8))
  println(maxLevelSum(p1))
}
