object HappyNumber extends App{
  def isHappy(n: Int): Boolean = {
    n match {
      case x if(x == 1) => true
      case _ => if(n!=7 && n < 10){
        false
      }else{
        isHappy(n.toString.split("").map(_.toInt).toList.fold(0){(a,b) => (a + b*b)})
      }
    }
  }

  println(isHappy(100))
}
