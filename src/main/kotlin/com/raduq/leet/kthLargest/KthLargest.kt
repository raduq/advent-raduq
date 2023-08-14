package com.raduq.leet.kthLargest

class KthLargest {
    fun findKthLargest(nums: IntArray, k: Int): Int {
        return nums.sortedDescending()[k-1]
    }
}
