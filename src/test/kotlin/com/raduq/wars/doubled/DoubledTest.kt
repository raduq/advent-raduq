package com.raduq.wars.doubled

import io.kotest.core.spec.style.StringSpec
import io.kotest.matchers.shouldBe

class DoubledTest : StringSpec({
    "should double (1, 2, 3)" {
        Doubled().maps(intArrayOf(1, 2, 3)) shouldBe intArrayOf(2, 4, 6)
    }

    "should double (4, 1, 1, 1, 4)" {
        Doubled().maps(intArrayOf(4, 1, 1, 1, 4)) shouldBe intArrayOf(8, 2, 2, 2, 8)
    }

    "should double (2, 2, 2, 2, 2, 2)" {
        Doubled().maps(intArrayOf(2, 2, 2, 2, 2, 2)) shouldBe intArrayOf(4, 4, 4, 4, 4, 4)
    }
})
