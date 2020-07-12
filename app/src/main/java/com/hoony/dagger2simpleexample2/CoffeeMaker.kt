package com.hoony.dagger2simpleexample2

import com.hoony.dagger2simpleexample2.interfaces.Heater
import javax.inject.Inject

class CoffeeMaker @Inject constructor(heater: Heater) {

    fun brew(coffeeBean: CoffeeBean): String =
        "CoffeeBean(${coffeeBean.name()}) [_]P coffee! [_]P "
}