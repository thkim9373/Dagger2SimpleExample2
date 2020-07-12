package com.hoony.dagger2simpleexample2

class CafeInfo(private val name: String) {
    constructor() : this("")

    fun welcome(): String =
        "Welcome${if (name.isNotEmpty()) " $name" else ""}!"
}