package com.raduq.leet.twoSum

import com.raduq.leet.twoSum.EasyTwoSum
import io.kotest.core.spec.style.StringSpec
import io.kotest.matchers.shouldBe

class EasyTwoSumTest : StringSpec({

  "should sum [2,7,11,15] to 9" {
    EasyTwoSum().twoSum(intArrayOf(2, 7, 11, 15), 9) shouldBe intArrayOf(0, 1)
  }

  "should sum [2,3,4] to 6" {
    EasyTwoSum().twoSum(intArrayOf(3, 2, 4), 6) shouldBe intArrayOf(1, 2)
  }

  "should sum [3,3] to 6" {
    EasyTwoSum().twoSum(intArrayOf(3, 3), 6) shouldBe intArrayOf(0, 1)
  }

  "should sum [-1,-2,-3,-4,-5] to -8" {
    EasyTwoSum().twoSum(intArrayOf(-1,-2,-3,-4,-5), -8) shouldBe intArrayOf(2, 4)
  }

})
