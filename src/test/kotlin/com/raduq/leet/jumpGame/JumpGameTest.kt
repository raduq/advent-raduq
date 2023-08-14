package com.raduq.leet.jumpGame

import io.kotest.core.spec.style.StringSpec
import io.kotest.matchers.shouldBe

class JumpGameTest : StringSpec({

  "should jump [2,3,1,1,4]" {
    JumpGame().canJump(intArrayOf(2, 3, 1, 1, 4)) shouldBe true
  }

  "should jump [1,1,1,0]" {
    JumpGame().canJump(intArrayOf(1, 1, 1, 0)) shouldBe true
  }

  "should jump [1,2,0,1]" {
    JumpGame().canJump(intArrayOf(1, 2, 0, 1)) shouldBe true
  }

  "should jump  [1,1,2,2,0,1,1]" {
    JumpGame().canJump(intArrayOf(1, 1, 2, 2, 0, 1, 1)) shouldBe true
  }

  "should not jump [3,2,1,0,4]" {
    JumpGame().canJump(intArrayOf(3, 2, 1, 0, 4)) shouldBe false
  }

  "should not jump [0,1]" {
    JumpGame().canJump(intArrayOf(0, 1)) shouldBe false
  }
})
