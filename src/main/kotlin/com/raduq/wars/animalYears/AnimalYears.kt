package com.raduq.wars.animalYears

class AnimalYears {

    fun calculateYears(years: Int): Array<Int> {
        return arrayOf(years, calculate(years, 4), calculate(years, 5));
    }

    private fun calculate(years: Int, laterYearsNum: Int): Int {
        var num = 0
        repeat(years) {
            num += when (it) {
                0 -> 15
                1 -> 9
                else -> laterYearsNum
            }
        }
        return num
    }
}
