package com.raduq.leet.houseRobber

class HouseRobber {
  fun rob(nums: IntArray): Int {
    var house1 = 0
    var house2 = 0

    nums.forEach {
      val higher = house1.coerceAtLeast(house2 + it)
      house2 = house1
      house1 = higher
    }
    return house1
  }

  fun robSimple(nums: IntArray): Int {
    var acc1 = 0
    var acc2 = 0

    for (num in nums) {
      val higher = if (acc1 < acc2 + num) acc2 + num else acc1
      acc2 = acc1
      acc1 = higher
    }
    return acc1
  }

  fun robSimpleFastNoMath(nums: IntArray): Int {
    var acc1 = 0
    var acc2 = 0

    for (num in nums) {
      val acc2Num = acc2 + num
      acc2 = acc1
      acc1 = if(acc1 > acc2Num) acc1 else acc2Num
    }
    return acc1
  }

  fun robSimpleFast(nums: IntArray): Int {
    var max = 0
    var previous = 0

    for (num in nums) {
      val higher = maxOf(max, previous + num)
      previous = max
      max = higher
    }
    return max
  }

  fun robWeirdSolution(nums: IntArray): Int {
    return nums.sumOf {
      robSimpleRec(it, 0, 0).first
    }
  }

  fun robSimpleRec(num: Int, acc1: Int, acc2: Int): Pair<Int, Int> {
    return Math.max(acc1, acc2 + num) to acc1
  }

  fun robSimpleIterator(nums: IntArray): Int {
    var acc1 = 0
    var acc2 = 0

    val it = nums.iterator()
    while(it.hasNext()){
      val higher = Math.max(acc1, acc2 + it.next())
      acc2 = acc1
      acc1 = higher
    }
    return acc1
  }

  fun robIteratorPair(nums: IntArray): Int {
    val it = nums.iterator()
    var acc = 0 to 0
    while(it.hasNext()){
      acc = Math.max(acc.first, acc.second + it.next()) to acc.first
    }
    return acc.first
  }

  fun robReduce(nums: IntArray): Int {
    var acc2 = 0
    return nums.reduce { acc, element ->
      val higher = acc.coerceAtLeast(acc2 + element)
      acc2 = acc
      higher
    }
  }

  fun robPairReduce(nums: IntArray): Int {
    var acc2 = 0
    return nums.reduce { acc, element ->
      val higher = acc.coerceAtLeast(acc2 + element)
      acc2 = acc
      higher
    }
  }

  fun robFold(nums: IntArray): Int {
    var acc2 = 0
    return nums.fold(0) { acc: Int, element: Int ->
      val higher = acc.coerceAtLeast(acc2 + element)
      acc2 = acc
      higher
    }
  }

  fun robFoldPaired(nums: IntArray): Int {
    return nums.fold(0 to 0) { acc, element ->
      val higher = acc.first.coerceAtLeast(acc.second + element)
      higher to acc.first
    }.first
  }

  fun robRecursive(
    nums: IntArray,
    size: Int,
    last: Int,
    index: Int,
    acc: Pair<Int, Int>
  ): Int {
    if (size == 0) return 0
    return nums.getOrNull(index)?.let {
      if (size == 1) return it
      if (index == last) return acc.first.coerceAtLeast(acc.second + it)
      return robRecursive(
        nums,
        size,
        last,
        index.plus(1),
        acc.first.coerceAtLeast(acc.second + it) to acc.first
      )
    } ?: 0
  }

  /**
   * Fold applies the operation in the value (starting from 0) from left to right.
   */
  fun robFoldPairedExplained(nums: IntArray): Int {
    //starting from 0 and 0 (two accumulators both with zero)
    return nums.fold(0 to 0) { acc, element ->
      //check if first accumulator is higher than the second + current iteration
      val higher = acc.first.coerceAtLeast(acc.second + element)
      //puts the higher value as first in next iteration
      //puts the previous high value as second in next iteration
      higher to acc.first

      //in the end will have the highest possible value in first
      //and the second best will the in the second
    }.first
  }
}
