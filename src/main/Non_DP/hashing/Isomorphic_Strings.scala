package Non_DP.hashing

object Isomorphic_Strings extends App{
    def isIsomorphic(s: String, t: String): Boolean = {


      var hash_map = Map[Char, Char]()
      var hash_map1 = Map[Char, Char]()
      var flag = true
      flag = (s.length == t.length)

      for(i <- 0 to (s.length-1)){
        if(flag){
          //
          if(hash_map.getOrElse(s(i), '.') == '.'){
            hash_map = hash_map ++ Map(s(i) -> t(i))
          }
          else{
            flag = (hash_map.getOrElse(s(i), '.') == t(i))
          }
          //
          if(hash_map1.getOrElse(t(i), '.') == '.'){
            hash_map1 = hash_map1 ++ Map(t(i) -> s(i))
          }
          else{
            flag = (hash_map1.getOrElse(t(i), '.') == s(i))
          }
        }
      }

      //result
      flag
    }

  println(isIsomorphic("abs", "dex"))
  }
