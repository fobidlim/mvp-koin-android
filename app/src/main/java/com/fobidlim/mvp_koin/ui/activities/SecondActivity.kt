package com.fobidlim.mvp_koin.ui.activities

import android.os.Bundle
import android.widget.Toast
import com.fobidlim.mvp_koin.R
import com.fobidlim.mvp_koin.libs.BaseActivity
import com.fobidlim.mvp_koin.libs.qualifiers.RequiresActivityPresenter
import com.fobidlim.mvp_koin.presenters.SecondPresenter
import com.fobidlim.mvp_koin.views.SecondView

@RequiresActivityPresenter(SecondPresenter::class)
class SecondActivity : BaseActivity<SecondPresenter>(), SecondView {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_second)
    }

    override fun showMessage(message: String) =
        Toast.makeText(this, message, Toast.LENGTH_SHORT).show()
}