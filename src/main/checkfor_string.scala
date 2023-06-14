// object Solution {
    
//     def strStr(haystack: String, needle: String): Int = {
        
//         var first = 0
//         var index = -1
//         for(s <- 0 to (haystack.length() - needle.length())){
//             if(haystack.substring(s, s + needle.length()) == needle){
//                 if(first == 0){
//                     index = s
//                     first = 1
//                 }
//             }
//         }
//         index
//     }
// }
object Solution extends App{
    def strStr(haystack: String, needle: String): Int = {
        haystack.indexOf(needle, 0)
    }

    strStr("Hello", "Hello")
}
