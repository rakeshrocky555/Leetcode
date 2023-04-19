import scala.math._
object Solution {
    def reverse(x: Int): Int = {
        try{
            if(x > 0){
            x.toString.split("").toList.reverse.mkString.toInt
        }
        else{
            ((x*(-1)).toString.split("").toList.reverse.mkString.toInt)*(-1)
        }
        }

        catch {
            case e: Exception => 0
        }
        
        
    }
}
