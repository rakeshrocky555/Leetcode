package Non_DP.Strings

object GreatestCommonDiv extends App{
    def gcdOfStrings(str1: String, str2: String): String = {
      var s1 = ""
      var s2 = ""
      if(str1.length >= str2.length){
        s1 = str1
        s2 = str2
      }
      else{
        s1 = str2
        s2 = str1
      }

      var flag = false
      var i = 0
      var res = ""

      while((!flag) && (i < s2.length)){
        if((s1.replaceAll(s2.slice(0, (s2.length - i)), "") == "") && (s2.replaceAll(s2.slice(0, (s2.length - i)), "") == "")){
          flag = true
          res = s2.slice(0, (s2.length - i))
        }
        i += 1
      }

      //answer
      res
    }

  println(gcdOfStrings("abcabcabc", "abc"))
}
