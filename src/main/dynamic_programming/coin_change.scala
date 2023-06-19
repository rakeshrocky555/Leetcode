import scala.math._
object Coin_change extends App{
  def coinChange(coins: Array[Int], amount: Int): Int = {
    val coins1 = coins.sorted
    val given_coins_size = coins1.length
    var table_coins = Array.ofDim[Int](given_coins_size, (amount + 1))

    for(i <- 0 to (given_coins_size - 1)){
      table_coins(i)(0) = 0
    }

    for(i <- 1 to (amount)){
      table_coins(0)(i) = {
        if(coins1(0) > i){
          -1
        }
        else if(i % coins1(0) == 0){
          (i/coins1(0)).toInt
        }
        else{
          -1
        }
      }
    }

    //core logic
    for(i <- 1 to (given_coins_size - 1)){
      for(j <- 1 to (amount)){
        if(coins1(i) > j){
          table_coins(i)(j) = table_coins(i-1)(j)
        }
        else{
          if((1 + table_coins(i)(j-coins1(i))) == 0){
            table_coins(i)(j) = table_coins(i-1)(j)
          }
          else if(table_coins(i-1)(j) < 0){
            table_coins(i)(j) = 1 + table_coins(i)(j-coins1(i))
          }
          else{
            table_coins(i)(j) = min(table_coins(i-1)(j), 1 + table_coins(i)(j-coins1(i)))
          }
        }
      }
    }


    //result
    table_coins(given_coins_size-1)(amount)
  }

  println(coinChange(Array(1,2,3), 5))
}
