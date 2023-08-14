package com.raduq.wars.enumerableMagic

import io.kotest.core.spec.style.StringSpec
import io.kotest.matchers.shouldBe

class EnumerableMagicTest : StringSpec({

    "should be true when array is [1,2,3,4] and num is 2" {
        EnumerableMagic().include(intArrayOf(1, 2, 3, 4), 2) shouldBe true
    }

    "should be true when array is [1,2,4,5] and num is 3" {
        EnumerableMagic().include(intArrayOf(1, 2, 4, 5), 3) shouldBe false
    }
})
