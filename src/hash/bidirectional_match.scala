object Solution {
    def wordPattern(pattern: String, s: String): Boolean = {
        val s_list = s.split(" +").toList
        val pattern_list = pattern.split("").toList
        var s_map = Map[String, Int]()
        var pattern_map = Map[String, Int]()
        var pattern_count = 0
        var s_count = 0
        var pattern_array = Array[Int]()
        var s_array = Array[Int]()

        //
        for(i <- 0 to s_list.length-1){
            if(s_map.get(s_list(i)) == None){
                s_map = s_map ++ Map(s_list(i) -> s_count)
                s_array = s_array :+ s_count
                s_count = s_count + 1
            }
            else{
                s_array = s_array :+ s_map.get(s_list(i)).get
            }
        }

        for(i <- 0 to pattern_list.length-1){
            if(pattern_map.get(pattern_list(i)) == None){
                pattern_map = pattern_map ++ Map(pattern_list(i) -> pattern_count)
                pattern_array = pattern_array :+ pattern_count
                pattern_count = pattern_count + 1
            }
            else{
                pattern_array = pattern_array :+ pattern_map.get(pattern_list(i)).get
            }
        }


        pattern_array.toList.foreach(println)
        s_array.toList.foreach(println)
        s_array.toList == pattern_array.toList
    }
}
