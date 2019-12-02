package com.fobidlim.mvp_koin.presenters

import com.fobidlim.mvp_koin.libs.ActivityPresenter
import com.fobidlim.mvp_koin.views.MainView

class MainPresenter(view: MainView? = null) : ActivityPresenter<MainView>(view!!) {

    fun onButtonClicked() {
        view.showMessage("Hello World!")
    }
}