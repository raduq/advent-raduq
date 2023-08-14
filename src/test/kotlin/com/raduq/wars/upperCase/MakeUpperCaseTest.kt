package com.raduq.wars.upperCase

import io.kotest.core.spec.style.StringSpec
import io.kotest.matchers.shouldBe

class MakeUpperCaseTest : StringSpec({

    "should make hello Uppercase" {
        MakeUpperCase().makeUpperCase("hello") shouldBe "HELLO"
    }
})
