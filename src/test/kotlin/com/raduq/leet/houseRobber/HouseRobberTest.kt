package com.raduq.leet.houseRobber

import io.kotest.core.spec.style.StringSpec
import io.kotest.matchers.shouldBe

class HouseRobberTest : StringSpec({

  "should rob house 1, 2, 3, 1" {
    HouseRobber().rob(intArrayOf(1, 2, 3, 1)) shouldBe 4
  }

  "should rob house 2,7,9,3,1" {
    HouseRobber().rob(intArrayOf(2, 7, 9, 3, 1)) shouldBe 12
  }

  "should rob house 1, 2, 3, 1 weird solution" {
    HouseRobber().robWeirdSolution(intArrayOf(1, 2, 3, 1)) shouldBe 4
  }

  "should rob house 2,7,9,3,1 weird solution" {
    HouseRobber().robWeirdSolution(intArrayOf(2, 7, 9, 3, 1)) shouldBe 12
  }

  "should rob house 1, 2, 3, 1 simple no math" {
    HouseRobber().robSimpleFastNoMath(intArrayOf(1, 2, 3, 1)) shouldBe 4
  }

  "should rob house 2,7,9,3,1 simple no math" {
    HouseRobber().robSimpleFastNoMath(intArrayOf(2, 7, 9, 3, 1)) shouldBe 12
  }

  "should rob house 1, 2, 3, 1 with simple for + Math.max" {
    HouseRobber().robSimpleFast(intArrayOf(1, 2, 3, 1)) shouldBe 4
  }

  "should rob house 2,7,9,3,1 with simple for + Math.max" {
    HouseRobber().robSimpleFast(intArrayOf(2, 7, 9, 3, 1)) shouldBe 12
  }

  "should rob house 1, 2, 3, 1 with Iterator" {
    HouseRobber().robSimpleIterator(intArrayOf(1, 2, 3, 1)) shouldBe 4
  }

  "should rob house 2,7,9,3,1 with Iterator" {
    HouseRobber().robSimpleIterator(intArrayOf(2, 7, 9, 3, 1)) shouldBe 12
  }

  "should rob house 1, 2, 3, 1 with Iterator + pait" {
    HouseRobber().robIteratorPair(intArrayOf(1, 2, 3, 1)) shouldBe 4
  }

  "should rob house 2,7,9,3,1 with Iterator + pait" {
    HouseRobber().robIteratorPair(intArrayOf(2, 7, 9, 3, 1)) shouldBe 12
  }

  "should rob house 1, 2, 3, 1 with simple for" {
    HouseRobber().robSimple(intArrayOf(1, 2, 3, 1)) shouldBe 4
  }

  "should rob house 2,7,9,3,1 with simple for" {
    HouseRobber().robSimple(intArrayOf(2, 7, 9, 3, 1)) shouldBe 12
  }

  "should rob house 1, 2, 3, 1 with reduce" {
    HouseRobber().robReduce(intArrayOf(1, 2, 3, 1)) shouldBe 4
  }

  "should rob house 2,7,9,3,1 with reduce" {
    HouseRobber().robReduce(intArrayOf(2, 7, 9, 3, 1)) shouldBe 12
  }

  "should rob house with fold" {
    HouseRobber().robFold(intArrayOf(1, 2, 3, 1)) shouldBe 4
  }

  "should rob house with fold with pairs algorithm" {
    HouseRobber().robFoldPaired(intArrayOf(1, 2, 3, 1)) shouldBe 4
  }

  "should rob house 2,7,9,3,1 with fold with pairs algorithm" {
    HouseRobber().robFoldPaired(intArrayOf(2, 7, 9, 3, 1)) shouldBe 12
  }

  "should rob house 1, 2, 3, 1 recursive" {
    val nums = intArrayOf(1, 2, 3, 1)
    HouseRobber().robRecursive(
      nums,
      nums.size,
      nums.lastIndex,
      0,
      0 to 0
    ) shouldBe 4
  }

  "should rob house 2,7,9,3,1 recursive" {
    val nums = intArrayOf(2, 7, 9, 3, 1)
    HouseRobber().robRecursive(
      nums,
      nums.size,
      nums.lastIndex,
      0,
      0 to 0
    ) shouldBe 12
  }

})
