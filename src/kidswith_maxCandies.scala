object Solution {
    def kidsWithCandies(candies: Array[Int], extraCandies: Int): List[Boolean] = {
        val max_value = candies.max
        val result = candies.map(candy => {
            if((candy + extraCandies) >= max_value){
                true
            }
            else{
                false
            }
        })
        result.toList
    }
}
