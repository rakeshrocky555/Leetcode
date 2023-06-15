object Longest_Pallindromic_substring extends App{
  def longestPalindrome(s: String): String = {
    var l = 0
    var r = 0
    var max_str = ""
    var max_len = 0
    var value = s.length

    for(i <- 0 to (value - 1)){
      l = i
      r = i
      while((l >= 0 && r < value) && (s(l) == s(r))){
        if((r - l + 1) > max_len){
          max_len = (r - l + 1)
          max_str = s.substring(l, r+1)
        }
        l = l - 1
        r = r + 1
      }


      //even
      if((i-l) < (value - i + 1)){
        l = i
        r = i + 1
        while((l >= 0 && r < value) && (s(l) == s(r))){
          if((r - l + 1) > max_len){
            max_len = (r - l + 1)
            max_str = s.substring(l, r+1)
          }
          l = l - 1
          r = r + 1
        }
      }

    }
    max_str
  }

  println(longestPalindrome("abbc"))
}