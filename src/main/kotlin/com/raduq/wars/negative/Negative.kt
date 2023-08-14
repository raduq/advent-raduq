package com.raduq.wars.negative

class Negative {

    fun makeNegative(x: Int): Int {
        return if (x < 0) x else x - (x * 2)
    }
}
