package com.hoony.dagger2simpleexample2

import dagger.Module
import dagger.Provides
import javax.inject.Singleton

@Module(subcomponents = [CoffeeComponent::class])
class CafeModule(private val name: String?) {

    constructor() : this(null)

    @Singleton
    @Provides
    fun provideCafeInfo(): CafeInfo = if (name.isNullOrBlank()) CafeInfo() else CafeInfo(name)
}