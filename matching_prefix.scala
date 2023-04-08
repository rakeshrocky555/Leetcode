object Solution {
    def longestCommonPrefix(strs: Array[String]): String = {
        val min_len = (strs.map(s => s.length)).min
    val len_array = strs.length
    

    val min_str = strs.filter(s => s.length==min_len).head
    

var i = 0
var acc = 0
for(j <- 0 to min_len-1){
  for(j1 <- 0 to len_array-2){
    if(strs(j1)(j) != strs(j1+1)(j)){
      acc = 1
    }
  }
  if(acc == 0){
    i = i + 1
  }
}
i
min_str.substring(0, i)
    }
}
