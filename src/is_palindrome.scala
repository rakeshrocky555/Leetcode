object Solution {
    def isPalindrome(x: Int): Boolean = {
        val str = x.toString()
        var result: Boolean = true
        for(c <- 0 to str.length-1){
            if(str(c) != str(str.length-1-c)){
                result = false
            }
        }
        result
    }

}
