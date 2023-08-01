package Non_DP.trees

class TreeNode4(_value: Int = 0, _left: TreeNode4 = null, _right: TreeNode4 = null) {
  var value: Int = _value
  var left: TreeNode4 = _left
  var right: TreeNode4 = _right
}

object BalancedBST extends App{
    def sortedArrayToBST(nums: Array[Int]): TreeNode4 = {
      def build(l: Int, r: Int): TreeNode4 = {
        (l, r) match {
          case (left, right) if(left > right) => null
          case (left, right) => {
            var mid = ((left + right) / 2 ).toInt
            new TreeNode4(nums(mid), build(left, mid - 1), build(mid + 1, right))
          }
        }
      }

      build(0, (nums.length - 1))
    }

  println(sortedArrayToBST(Array(-10,-3,0,5,9)))
  }
