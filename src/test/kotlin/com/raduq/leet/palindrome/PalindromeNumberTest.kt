package com.raduq.leet.palindrome

import io.kotest.core.spec.style.StringSpec
import io.kotest.matchers.shouldBe

class PalindromeNumberTest : StringSpec({

  "should be true when number is 121" {
    PalindromeNumber().isPalindrome(121) shouldBe true
  }

  "should be true when number is 0" {
    PalindromeNumber().isPalindrome(0) shouldBe true
  }

  "should be true when number is 1" {
    PalindromeNumber().isPalindrome(1) shouldBe true
  }

  "should be false when number is -121" {
    PalindromeNumber().isPalindrome(-121) shouldBe false
  }

  "should be false when number is 10" {
    PalindromeNumber().isPalindrome(10) shouldBe false
  }
})
