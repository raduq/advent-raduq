package com.raduq.leet.romanToInteger

import io.kotest.core.spec.style.StringSpec
import io.kotest.matchers.shouldBe

class RomanToIntegerTest : StringSpec({

  "should be I be 1" {
    RomanToInteger().romanToInt("I") shouldBe 1
  }

  "should be II be 2" {
    RomanToInteger().romanToInt("II") shouldBe 2
  }

  "should be III be 3" {
    RomanToInteger().romanToInt("III") shouldBe 3
  }

  "should be IV be 4" {
    RomanToInteger().romanToInt("IV") shouldBe 4
  }

  "should be V be 5" {
    RomanToInteger().romanToInt("V") shouldBe 5
  }

  "should be LVIII be 58" {
    RomanToInteger().romanToInt("LVIII") shouldBe 58
  }

  "should be MCMXCIV be 1994" {
    RomanToInteger().romanToInt("MCMXCIV") shouldBe 1994
  }

})
