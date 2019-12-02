package com.fobidlim.mvp_koin.presenters

import com.fobidlim.mvp_koin.libs.ActivityPresenter
import com.fobidlim.mvp_koin.views.SecondView

class SecondPresenter(view: SecondView? = null) : ActivityPresenter<SecondView>(view!!) {

    init {
        view!!.showMessage("Hello Second! ${environment.calculator.sum(2, 5)}")
    }
}