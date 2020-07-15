package com.hoony.dagger2simpleexample2

import javax.inject.Inject

class EthiopiaBean @Inject constructor() : CoffeeBean() {
    override fun name(): String = "EthiopiaBean"
}