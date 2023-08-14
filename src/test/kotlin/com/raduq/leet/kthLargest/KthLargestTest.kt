package com.raduq.leet.kthLargest

import io.kotest.core.spec.style.StringSpec
import io.kotest.matchers.shouldBe

class KthLargestTest : StringSpec({

  "should be 5 when array is [3,2,1,5,6,4] and k is 2" {
    KthLargest().findKthLargest(intArrayOf(3, 2, 1, 5, 6, 4), 2) shouldBe 5
  }

  "should be 5 when array is [3,2,3,1,2,4,5,5,6] and k is 4" {
    KthLargest().findKthLargest(
      intArrayOf(3, 2, 3, 1, 2, 4, 5, 5, 6),
      4
    ) shouldBe 4
  }
})
