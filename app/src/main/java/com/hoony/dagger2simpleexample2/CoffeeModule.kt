package com.hoony.dagger2simpleexample2

import com.hoony.dagger2simpleexample2.interfaces.A_Heater
import com.hoony.dagger2simpleexample2.interfaces.Heater
import dagger.Binds
import dagger.Module
import dagger.Provides

@Module
class CoffeeModule {
    @CoffeeScope
    @Provides
    fun provideCoffeeMaker(heater: Heater): CoffeeMaker = CoffeeMaker(heater)

    @CoffeeScope
    @Provides
    fun provideHeater(): Heater = A_Heater()

    @Provides
    fun provideCoffeeBean(): CoffeeBean = CoffeeBean()

//    @Binds
//    abstract fun provideCoffeeBean(ethiopiaBean: EthiopiaBean): CoffeeBean
}