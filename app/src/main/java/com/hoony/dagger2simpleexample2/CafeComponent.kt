package com.hoony.dagger2simpleexample2

import dagger.Component
import javax.inject.Singleton

@Singleton
@Component(modules = [CafeModule::class])
interface CafeComponent {
    fun cafeInfo(): CafeInfo
    fun coffeeComponent(): CoffeeComponent.Builder

    @Component.Builder
    interface Builder {
        fun cafeModule(cafeModule: CafeModule): Builder
        fun build(): CafeComponent
    }
}