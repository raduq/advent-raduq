package com.raduq.leet.stocks

import io.kotest.core.spec.style.StringSpec
import io.kotest.matchers.shouldBe

class StocksCalculatorTest : StringSpec({

  "should [7,1,5,3,6,4] be 5" {
    StocksCalculator().maxProfit(intArrayOf(7, 1, 5, 3, 6, 4)) shouldBe 5
  }

  "should [7,6,4,3,1] be 0" {
    StocksCalculator().maxProfit(intArrayOf(7, 6, 4, 3, 1)) shouldBe 0
  }

})
