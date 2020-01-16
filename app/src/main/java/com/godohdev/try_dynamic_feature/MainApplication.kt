package com.godohdev.try_dynamic_feature


/**
 *
 * Created by Wahyu Permadi on 2020-01-15.
 * Android Engineer
 *
 **/

import android.app.Activity
import android.app.Application
import android.content.Context
import androidx.fragment.app.Fragment
import com.godohdev.base.di.CoreComponent
import com.godohdev.base.di.DaggerCoreComponent


class CoreApplication : Application(){

    private val  coreComponent: CoreComponent by lazy {
        DaggerCoreComponent.create()
    }

    companion object {
        @JvmStatic
        fun coreComponent(context: Context) =
            (context.applicationContext as CoreApplication).coreComponent
    }
}

fun Activity.coreComponent() =
    CoreApplication.coreComponent(this)

fun Fragment.coreComponent() =
    this.context?.let { CoreApplication.coreComponent(it) }