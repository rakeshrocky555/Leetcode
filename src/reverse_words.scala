object Solution {
    def reverseWords(s: String): String = {
        s.split(" +").toList.reverse.mkString(" ").trim()
    }
}
