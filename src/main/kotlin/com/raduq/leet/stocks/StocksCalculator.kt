package com.raduq.leet.stocks

class StocksCalculator {

  fun maxProfit(prices: IntArray): Int {
    var low = prices.first()
    var high = low
    for ((index, price) in prices.withIndex()) {
      if (index == 0) continue
      if (price < low)
        high = if(high > low) high else low
        low = price
    }
    val best = high - low
    return if(best > 0) best else 0
  }
}
