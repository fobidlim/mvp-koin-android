package com.fobidlim.mvp_koin.libs

import android.util.Log

class Calculator {

    init {
        Log.d("Calculator", "init: ${toString()}")
    }

    fun sum(a: Int, b: Int): Int = a + b
}