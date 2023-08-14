package com.raduq.leet.palindrome

class PalindromeNumber {

  fun isPalindrome(x: Int): Boolean {
    val xArray = x.toString().toCharArray()
    var lastIndex = xArray.lastIndex
    for (xNum in xArray) {
      val last = xArray.getOrNull(lastIndex) ?: return true
      if (xNum != last) return false
      lastIndex--
    }
    return true
  }
}
