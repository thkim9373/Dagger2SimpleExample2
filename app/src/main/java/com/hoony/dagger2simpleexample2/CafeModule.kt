package com.hoony.dagger2simpleexample2

import com.hoony.dagger2simpleexample2.interfaces.A_Heater
import com.hoony.dagger2simpleexample2.interfaces.Heater
import dagger.Module
import dagger.Provides
import javax.inject.Singleton

@Module
class CafeModule {
    @Singleton
    @Provides
    fun provideCafeInfo(): CafeInfo = CafeInfo()

    @Provides
    fun provideCoffeeMaker(heater: Heater): CoffeeMaker = CoffeeMaker(heater)

    @Provides
    fun provideHeater(): Heater = A_Heater()
}