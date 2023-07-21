package Non_DP.hashing

object Group_anagrams extends App{

  def groupAnagrams(strs: Array[String]): List[List[String]] = {
    var hash_mp = Map[String, List[String]]()

    for(str <- strs){
      var temp_key = str.split("").sorted.mkString
      hash_mp = hash_mp ++ Map(temp_key -> (hash_mp.getOrElse(temp_key, List()) :+ str))
    }

    //returning the result
    hash_mp.values.toList
  }

  println(groupAnagrams(Array("cat", "tac", "toe", "oet")))
}
