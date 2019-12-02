package com.fobidlim.mvp_koin.views

import com.fobidlim.mvp_koin.libs.ActivityView

interface MainView : ActivityView {

    fun showMessage(message: String)
}