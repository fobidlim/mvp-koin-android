package com.fobidlim.mvp_koin.libs.qualifiers

import com.fobidlim.mvp_koin.libs.ActivityPresenter
import com.fobidlim.mvp_koin.libs.ActivityView
import java.lang.annotation.Inherited
import kotlin.reflect.KClass

@Inherited
@Retention(AnnotationRetention.RUNTIME)
annotation class RequiresActivityPresenter(
    val value: KClass<out ActivityPresenter<out ActivityView>>
)