object Solution {
    def searchInsert(nums: Array[Int], target: Int): Int = {
      binarySearchInsert(nums, 0, nums.length-1, target)
    }


  def binarySearchInsert(nums: Array[Int], start: Int, end: Int, target: Int): Int = {
    val midIndex = (end-start)/2 + start
    if (start>end) start
    else nums(midIndex) match {
      case m if m==target => midIndex
      case m if m>target => binarySearchInsert(nums, start, midIndex-1, target)
      case _ => binarySearchInsert(nums, midIndex+1, end, target)
    }
  }
}
