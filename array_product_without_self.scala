object Solution {
    def productExceptSelf(nums: Array[Int]): Array[Int] = {
        val total_product = nums.reduce((a, b) => a*b)
        val flag = if(nums.filter(num => num == 0).length > 1) true else false
        val total_product_without_zero =nums.filter(num => num != 0) match {
            case first if(first.isEmpty) => 0
            case second => second.fold(1)((a, b) => a*b)
        }
        nums.map(value => {
            if(flag){
                0
            }
            else if(value == 0){
                total_product_without_zero
            }
            else{
                ((total_product/value).toInt)
            }
        })
    }
}
