package com.raduq.wars.abbr

import io.kotest.core.spec.style.StringSpec
import io.kotest.matchers.shouldBe

class AbbreviateNameTest : StringSpec({

    "should abbreviate Sam Harris" {
        AbbreviateName().abbrevName("Sam Harris") shouldBe "S.H"
    }
    "should abbreviate Patrick Feenan" {
        AbbreviateName().abbrevName("Patrick Feenan") shouldBe "P.F"
    }
})
