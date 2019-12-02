package com.fobidlim.mvp_koin.presenters

import com.fobidlim.mvp_koin.libs.ActivityPresenter
import com.fobidlim.mvp_koin.views.MainView

class MainPresenter(
    view: MainView? = null
) : ActivityPresenter<MainView>(view!!) {

    fun sum(a: Int, b: Int) = view.run {
        showMessage("Hello World! ${environment.calculator.sum(a, b)}")
        showSecond()
    }
}