package com.raduq.leet.houseRobber

class HouseRobber2 {

  fun rob(nums: IntArray): Int {
    if (nums.isEmpty()) return 0
    if (nums.size == 1) return nums[0]

    // Primeiro, vamos calcular o máximo de dinheiro que você pode roubar do início até a penúltima casa.
    val max1 = robHelper(nums.copyOfRange(0, nums.size - 1))

    // Agora, vamos calcular o máximo de dinheiro que você pode roubar da segunda casa até a última casa.
    val max2 = robHelper(nums.copyOfRange(1, nums.size))

    // Finalmente, retornamos o maior valor entre max1 e max2.
    return maxOf(max1, max2)
  }

  fun robHelper(nums: IntArray): Int {
    var prevMax = 0
    var currMax = 0

    for (num in nums) {
      val temp = currMax
      currMax = maxOf(currMax, prevMax + num)
      prevMax = temp
    }

    return currMax
  }

  fun rob2(nums: IntArray): Int {
    var m1 = 0
    var m2 = 0
    for (num in nums) {
      val higher = Math.max(m1, m2 + num)
      m2 = m1
      m1 = higher
    }
    return m1
  }

  fun robOld(nums: IntArray): Int {
    var house1 = 0
    var house2 = 0
    nums.forEachIndexed { index, value ->
      if (index != nums.lastIndex && index != 0) {
        if (house1 == house2 + value) return@forEachIndexed
        val higher = house1.coerceAtLeast(house2 + value)
        house2 = house1
        house1 = higher
        return@forEachIndexed
      }
      if (index == 0) {
        val higher = value.coerceAtLeast(nums.last() + house2)
        house2 = house1
        house1 = higher
        return@forEachIndexed
      }
      value.coerceAtLeast(nums.first() + house2)
    }
    return house1
  }

  fun robRecursive(nums: IntArray, index: Int, acc: Int, acc2: Int): Int {
    return nums.getOrNull(index)?.let {
      if (nums.size == 1) return it
      if (index != nums.lastIndex && index != 0) {
        val higher = acc.coerceAtLeast(acc2 + it)
        return robRecursive(
          nums = nums,
          index = index.plus(1),
          acc = higher,
          acc2 = acc
        )
      }
      if (index == 0) {
        val higher = it.coerceAtLeast(nums.last() + acc2)
        return robRecursive(nums = nums, index = 1, acc = higher, acc2 = acc)
      }
      return acc
    } ?: throw IllegalArgumentException("value not found")
  }

}
