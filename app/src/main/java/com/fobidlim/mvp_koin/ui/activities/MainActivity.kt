package com.fobidlim.mvp_koin.ui.activities

import android.os.Bundle
import android.widget.Toast
import com.fobidlim.mvp_koin.R
import com.fobidlim.mvp_koin.libs.BaseActivity
import com.fobidlim.mvp_koin.libs.qualifiers.RequiresActivityPresenter
import com.fobidlim.mvp_koin.presenters.MainPresenter
import com.fobidlim.mvp_koin.views.MainView
import kotlinx.android.synthetic.main.activity_main.*

@RequiresActivityPresenter(MainPresenter::class)
class MainActivity : BaseActivity<MainPresenter>(), MainView {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        button.setOnClickListener { presenter.onButtonClicked() }
    }

    override fun showMessage(message: String) =
        Toast.makeText(this, message, Toast.LENGTH_SHORT).show()
}
