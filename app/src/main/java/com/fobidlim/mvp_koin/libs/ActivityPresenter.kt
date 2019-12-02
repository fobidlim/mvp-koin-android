package com.fobidlim.mvp_koin.libs

import androidx.annotation.CallSuper

open class ActivityPresenter<View : ActivityView>(
    protected val view: View
) {

    @CallSuper
    fun onCreate() {
    }
}