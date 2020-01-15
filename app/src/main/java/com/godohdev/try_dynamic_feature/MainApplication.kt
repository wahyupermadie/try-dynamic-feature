package com.godohdev.try_dynamic_feature

import android.app.Activity
import android.app.Application
import android.content.Context
import androidx.fragment.app.Fragment
import com.godohdev.base.di.CoreComponent
import com.godohdev.base.di.DaggerCoreComponent


/**
 *
 * Created by Wahyu Permadi on 2020-01-15.
 * Android Engineer
 *
 **/

class MainApplication : Application(){

    private val  coreComponent: CoreComponent by lazy {
        DaggerCoreComponent.builder().build()
    }

    companion object {
        @JvmStatic
        fun coreComponent(context: Context) =
            (context.applicationContext as MainApplication).coreComponent
    }
}

fun Fragment.coreComponent() = MainApplication.coreComponent(this.context!!)
fun Activity.coreComponent() = MainApplication.coreComponent(this)