package Non_DP.twopointers
import scala.math._


object best_time_buy_sell_stock extends App{
  def maxProfit(prices: Array[Int]): Int = {
    var l = 0
    var r = 0
    var max_bid = 0
    //two pointers technique
    while(r < prices.length && l <= r){
      if(prices(l) > prices(r)){
        l = l + 1
        //r = r + 1
      }
      else{
        max_bid = max(max_bid, (prices(r) - prices(l)))
        r = r + 1
      }
    }

    max_bid
  }

  print(maxProfit(Array(7,1,5,3,6,4)))
}
