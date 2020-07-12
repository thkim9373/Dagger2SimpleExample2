package com.hoony.dagger2simpleexample2

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    private val coffeeComponent by lazy {
        DaggerCoffeeComponent.builder()
            .cafeModule(CafeModule())
            .build()
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        setListener()
    }

    private fun setListener() {
        btClick.setOnClickListener {
            var log = ""

            val cafeInfo1 = coffeeComponent.cafeInfo()
            val cafeInfo2 = coffeeComponent.cafeInfo()

            log += "cafeInfo1.hashCode() : ${cafeInfo1.hashCode()}\n"
            log += "cafeInfo2.hashCode() : ${cafeInfo2.hashCode()}\n"

            val coffeeMaker1 = coffeeComponent.coffeeMaker()
            val coffeeMaker2 = coffeeComponent.coffeeMaker()

            log += "coffeeMaker1.hashCode() : ${coffeeMaker1.hashCode()}\n"
            log += "coffeeMaker2.hashCode() : ${coffeeMaker2.hashCode()}\n"

            text.text = log
        }
    }
}