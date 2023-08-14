package com.raduq.wars.animalYears

import io.kotest.core.spec.style.StringSpec
import io.kotest.matchers.shouldBe

class AnimalYearsTest : StringSpec({
    "should calculate 1" {
        AnimalYears().calculateYears(1) shouldBe intArrayOf(1, 15, 15)
    }

    "should calculate 2" {
        AnimalYears().calculateYears(2) shouldBe intArrayOf(2, 24, 24)
    }

    "should calculate 10" {
        AnimalYears().calculateYears(10) shouldBe intArrayOf(10, 56, 64)
    }
})
