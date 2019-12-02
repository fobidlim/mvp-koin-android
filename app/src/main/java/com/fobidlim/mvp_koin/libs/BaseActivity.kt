package com.fobidlim.mvp_koin.libs

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.fobidlim.mvp_koin.libs.qualifiers.RequiresActivityPresenter
import kotlin.reflect.KClass

open class BaseActivity<Presenter : ActivityPresenter<out ActivityView>> : AppCompatActivity() {

    protected lateinit var presenter: Presenter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        assignPresenter()
    }

    private fun assignPresenter() {
        val annotation = javaClass.getAnnotation(RequiresActivityPresenter::class.java)
        val presenterClass = if (annotation == null) null else annotation.value as KClass<Presenter>

        presenterClass?.let {
            createPresenter(presenterClass)?.let { p ->
                presenter = p
            }
        }
    }

    private fun createPresenter(presenterClass: KClass<Presenter>): Presenter? {
        presenterClass.constructors.forEach {
            if (it.parameters.size == 1) {
                return it.call(this as ActivityView)
                    .apply {
                        onCreate()
                    }
            }
        }
        return null
    }

}