package Non_DP.Stocks

object BestTimeII extends App{
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
          if(l != r){
            max_bid = max_bid + (prices(r) - prices(l))
            l = l + 1
          }
          r = r + 1
        }
      }

      max_bid
    }

  println(maxProfit(Array(7,1,5,3,6,4)))
  }
