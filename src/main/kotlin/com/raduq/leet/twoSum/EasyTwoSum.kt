package com.raduq.leet.twoSum

class EasyTwoSum {

  fun twoSumOpt(nums: IntArray, target: Int): IntArray {
    val indexMap = mutableMapOf<Int, Int>()
    for ((index, num) in nums.withIndex()) {
      indexMap.forEach {
        if (it.value + num == target) {
          return intArrayOf(it.key, index)
        }
      }
      indexMap[index] = num
    }
    return intArrayOf()
  }

  fun twoSum(nums: IntArray, target: Int): IntArray {
    val indexMap = mutableMapOf<Int, Int>()
    for ((index, num) in nums.withIndex()) {
      for ((key, value) in indexMap.entries) {
        if(value + num == target) return intArrayOf(key, index)
      }
      indexMap[index] = num
    }
    throw IllegalArgumentException("Answer is empty")
  }
}
