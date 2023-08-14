package com.raduq.wars.abbr

class AbbreviateName {
    fun abbrevName(name: String) = name.split(" ").joinToString(".") { it.first().uppercase() }
}
