package com.fobidlim.mvp_koin.libs.koin

import com.fobidlim.mvp_koin.libs.Calculator
import com.fobidlim.mvp_koin.libs.Environment
import org.koin.dsl.module

val presenterModule = module {
    single { Calculator() }
    single {
        Environment(get())
    }
}