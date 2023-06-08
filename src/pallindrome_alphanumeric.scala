object Solution {
    def isPalindrome(s: String): Boolean = {
        val filtered_string = s.split(" +").toList.mkString("").filter(c =>(c.isDigit	 || c.isLetter)).toLowerCase()
        filtered_string == filtered_string.reverse 
    }
}
