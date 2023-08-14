package com.raduq.wars.doubled

class Doubled {

    fun maps(x: IntArray): IntArray {
        return x.map { it * 2 }.toIntArray()
    }
}
