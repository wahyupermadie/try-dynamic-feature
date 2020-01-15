package com.godohdev.base.di

import android.app.Application
import com.godohdev.base.di.modules.NetworkModule
import dagger.BindsInstance
import dagger.Component
import dagger.android.AndroidInjectionModule
import okhttp3.OkHttpClient
import javax.inject.Singleton


/**
 *
 * Created by Wahyu Permadi on 2020-01-15.
 * Android Engineer
 *
 **/
@Component(
    modules = [NetworkModule::class]
)
@Singleton
interface CoreComponent {
    @Component.Builder
    interface Builder {
        fun build() : CoreComponent
    }
}


