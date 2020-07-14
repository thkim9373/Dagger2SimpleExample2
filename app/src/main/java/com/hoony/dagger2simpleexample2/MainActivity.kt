package com.hoony.dagger2simpleexample2

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    private val cafeComponent by lazy {
//        DaggerCafeComponent.builder()
//            .cafeModule(CafeModule("example cafe"))
//            .build()

        DaggerCafeComponent.create()
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        setListener()
    }

    private fun setListener() {
        btClick.setOnClickListener {
            var log = ""

            log += "${cafeComponent.cafeInfo().welcome()}\n\n"
            log += getCafeInfoLog()
            log += getCoffeeMakerLog()
            log += getCoffeeBeanLog()

            text.text = log
        }
    }

    private fun getCafeInfoLog(): String {
        val cafeInfo1 = cafeComponent.cafeInfo()
        val cafeInfo2 = cafeComponent.cafeInfo()

//        log += "cafeInfo1.hashCode() : ${cafeInfo1.hashCode()}\n"
//        log += "cafeInfo2.hashCode() : ${cafeInfo2.hashCode()}\n"

        return "cafeInfo1 == cafeInfo2 : ${cafeInfo1 == cafeInfo2}\n\n"
    }

    private fun getCoffeeMakerLog(): String {
        var result = ""

        val coffeeComponent1 = cafeComponent.coffeeComponent().build()
        val coffeeMaker1 = coffeeComponent1.coffeeMaker()
        val coffeeMaker2 = coffeeComponent1.coffeeMaker()

        result += "coffeeMaker1 == coffeeMaker2 : ${coffeeMaker1 == coffeeMaker2}\n"

        val coffeeComponent2 = cafeComponent.coffeeComponent().build()
        val coffeeMaker3 = coffeeComponent2.coffeeMaker()

        result += "coffeeMaker1 == coffeeMaker3 : ${coffeeMaker1 == coffeeMaker3}\n\n"

        return result
    }

    private fun getCoffeeBeanLog(): String {
        val coffeeComponent = cafeComponent.coffeeComponent().build()
        val coffeeBean1 = coffeeComponent.coffeeBean()
        val coffeeBean2 = coffeeComponent.coffeeBean()

        return "coffeeBean1 == coffeeBean2 : ${coffeeBean1 == coffeeBean2}"
    }
}