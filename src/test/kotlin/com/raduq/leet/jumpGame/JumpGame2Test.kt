package com.raduq.leet.jumpGame

import io.kotest.core.spec.style.StringSpec
import io.kotest.matchers.shouldBe

class JumpGame2Test : StringSpec({

  "should jump [2,3,1,1,4]" {
    JumpGame2().jump(intArrayOf(2, 3, 1, 1, 4)) shouldBe 2
  }

  "should jump [2,3,0,1,4]" {
    JumpGame2().jump(intArrayOf(2, 3, 0, 1, 4)) shouldBe 2
  }

  "should jump [1,1,1,1]" {
    JumpGame2().jump(intArrayOf(1,1,1,1)) shouldBe 3
  }

  "should jump [1,2,1,1,1]" {
    JumpGame2().jump(intArrayOf(1,2,1,1,1)) shouldBe 3
  }

  "should not jump if array is empty" {
    JumpGame2().jump(intArrayOf()) shouldBe 0
  }

  "should not jump if array [0]" {
    JumpGame2().jump(intArrayOf()) shouldBe 0
  }

  "should not jump if array [1]" {
    JumpGame2().jump(intArrayOf(1)) shouldBe 0
  }

  "should jump [2,1]" {
    JumpGame2().jump(intArrayOf(2,1)) shouldBe 1
  }

})
