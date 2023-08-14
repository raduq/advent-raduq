package com.raduq.leet.jumpGame

class JumpGame2 {

  fun jump(nums: IntArray): Int {
    // The starting range of the first jump is [0, 0]
    var answer = 0
    val n = nums.size
    var curEnd = 0
    var curFar = 0
    for (i in 0 until n - 1) {
      // Update the farthest reachable index of this jump.
      curFar = maxOf(curFar, i + nums[i])

      // If we finish the starting range of this jump,
      // Move on to the starting range of the next jump.
      if (i == curEnd) {
        answer++
        curEnd = curFar
      }
    }
    return answer
  }

  fun jumpForEachIndexed(nums: IntArray): Int {
    var jumps = 0
    var lastJump = 0
    var newJump = 0
    nums.forEachIndexed { index, el ->
      if(index == nums.lastIndex) return jumps

      newJump = maxOf(newJump, index + el)
      if (index == lastJump) {
        jumps++
        lastJump = newJump
      }
    }
    return jumps
  }

  fun jumpRec(nums: IntArray): Int {
    if (nums.isEmpty() || nums.size == 1) return 0
    return keepJumping(nums, 0, 0)
  }

  private fun keepJumping(nums: IntArray, index: Int, jumps: Int): Int {
    if (index >= nums.lastIndex) return jumps
    val nextJump = maxOf(index, index + nums[index])
    return keepJumping(nums, index + nextJump, jumps.plus(1))
  }
}
