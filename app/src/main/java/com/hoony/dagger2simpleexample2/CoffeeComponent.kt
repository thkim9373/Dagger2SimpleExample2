package com.hoony.dagger2simpleexample2

import dagger.Component
import javax.inject.Singleton

@Singleton
@Component(modules = [CafeModule::class])
interface CoffeeComponent {
    fun cafeInfo(): CafeInfo
    fun coffeeMaker(): CoffeeMaker
}