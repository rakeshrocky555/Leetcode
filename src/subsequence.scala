object Solution {
    def isSubsequence(s: String, t: String): Boolean = {
        var flag = 0
        var j = 0
        for(i <- 0 to t.length-1){
            if(j < s.length && t(i) == s(j)){
                j = j + 1
                flag = flag + 1
            }
        }
        flag == s.length
    }
}
