package com.fobidlim.mvp_koin

import android.app.Application
import com.fobidlim.mvp_koin.libs.koin.presenterModule
import org.koin.android.ext.koin.androidContext
import org.koin.core.context.startKoin

class ThisApplication : Application() {

    override fun onCreate() {
        super.onCreate()

        startKoin {
            androidContext(this@ThisApplication)
            modules(listOf(presenterModule))
        }
    }
}