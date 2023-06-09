object Solution {
    def canConstruct(ransomNote: String, magazine: String): Boolean = {
        var ransom_map = Map[Char, Int]()
        ransomNote.foreach(value => {
            ransom_map = ransom_map ++ Map(value -> (ransom_map.getOrElse(value, 0) + 1))
        })

        var magazine_map = Map[Char, Int]()
        magazine.foreach(value => {
            magazine_map = magazine_map ++ Map(value -> (magazine_map.getOrElse(value, 0) + 1))
        })

        ransom_map.forall(value => magazine_map.getOrElse(value._1, 0) >= value._2)
    }
}
