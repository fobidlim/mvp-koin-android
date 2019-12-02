package com.fobidlim.mvp_koin.libs

import androidx.annotation.CallSuper
import org.koin.core.KoinComponent
import org.koin.core.inject

open class ActivityPresenter<View : ActivityView>(
    protected val view: View
) : KoinComponent {

    protected val environment: Environment by inject()

    @CallSuper
    fun onCreate() {
    }
}