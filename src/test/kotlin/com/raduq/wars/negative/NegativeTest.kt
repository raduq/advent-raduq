package com.raduq.wars.negative

import io.kotest.core.spec.style.StringSpec
import io.kotest.matchers.shouldBe

class NegativeTest : StringSpec({
    "should negative 5" {
        Negative().makeNegative(5) shouldBe -5
    }

    "should negative 0" {
        Negative().makeNegative(0) shouldBe 0
    }

    "should negative -5" {
        Negative().makeNegative(-5) shouldBe -5
    }


})
