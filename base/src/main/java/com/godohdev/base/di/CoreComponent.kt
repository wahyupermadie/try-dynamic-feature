package com.godohdev.base.di

import com.godohdev.base.di.modules.NetworkModule
import dagger.Component
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


