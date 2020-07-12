package com.hoony.dagger2simpleexample2.interfaces

class A_Pump(private val heater: Heater) : Pump {
    override fun pump(): String =
        if (heater.isHot()) {
            "Pumping...\n"
        } else {
            "Heater not hot!!\n"
        }
}