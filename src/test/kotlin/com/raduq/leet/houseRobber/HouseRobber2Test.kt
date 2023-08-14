package com.raduq.leet.houseRobber

import io.kotest.core.spec.style.StringSpec
import io.kotest.matchers.shouldBe

class HouseRobber2Test : StringSpec({

  "should rob house 0" {
    HouseRobber2().rob(intArrayOf(0)) shouldBe 0
  }

  "should rob house 2,3,2" {
    HouseRobber2().rob(intArrayOf(2, 3, 2)) shouldBe 3
  }

  "should rob house 1,2,3,1" {
    HouseRobber2().rob(intArrayOf(1, 2, 3, 1)) shouldBe 4
  }

  "should rob house 1,2,1,1" {
    HouseRobber2().rob(intArrayOf(1, 2, 1, 1)) shouldBe 3
  }

  "should rob house 1,2,3" {
    HouseRobber2().rob(intArrayOf(1, 2, 3)) shouldBe 3
  }

//  "should rob recursive house 0" {
//    HouseRobber2().robRecursive(intArrayOf(0), 0, 0, 0) shouldBe 0
//  }
//
//  "should rob recursive house 2,3,2" {
//    HouseRobber2().robRecursive(intArrayOf(2, 3, 2), 0, 0, 0) shouldBe 3
//  }
//
//  "should rob recursive house 1,2,3,1" {
//    HouseRobber2().robRecursive(intArrayOf(1, 2, 3, 1), 0, 0, 0) shouldBe 4
//  }
//
//  "should rob recursive house 1,2,3" {
//    HouseRobber2().robRecursive(intArrayOf(1, 2, 3), 0, 0, 0) shouldBe 3
//  }
//
//  "should rob recursive house 1,2,1,1" {
//    HouseRobber2().robRecursive(intArrayOf(1, 2, 1, 1), 0, 0, 0) shouldBe 3
//  }

})
