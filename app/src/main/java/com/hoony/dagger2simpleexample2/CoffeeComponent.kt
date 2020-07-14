package com.hoony.dagger2simpleexample2

import dagger.Subcomponent

@CoffeeScope
@Subcomponent(modules = [CoffeeModule::class])
interface CoffeeComponent {
    fun coffeeMaker(): CoffeeMaker
    fun coffeeBean(): CoffeeBean

    @Subcomponent.Builder
    interface Builder {
        fun build(): CoffeeComponent
    }
}