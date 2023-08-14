package com.raduq.leet.validParentheses

import io.kotest.core.spec.style.StringSpec
import io.kotest.matchers.shouldBe

class ParenthesesValidatorTest : StringSpec({

  "should () be valid" {
    ParenthesesValidator().isValid("()") shouldBe true
  }

  "should ()[]{} be valid" {
    ParenthesesValidator().isValid("()[]{}") shouldBe true
  }

  "should {[]} be valid" {
    ParenthesesValidator().isValid("{[]}") shouldBe true
  }

  "should [{()}] be valid" {
    ParenthesesValidator().isValid("[{()}]") shouldBe true
  }

  "should (([]){}) be valid" {
    ParenthesesValidator().isValid("(([]){})") shouldBe true
  }

  "should (] be invalid" {
    ParenthesesValidator().isValid("(]") shouldBe false
  }

  "should ([)] be invalid" {
    ParenthesesValidator().isValid("([)]") shouldBe false
  }

  "should ] be invalid" {
    ParenthesesValidator().isValid("]") shouldBe false
  }
})
