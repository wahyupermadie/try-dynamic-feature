@file:JvmName("Injector")
package com.godohdev.tvshow

import com.godohdev.try_dynamic_feature.CoreApplication.Companion.coreComponent
import com.godohdev.try_dynamic_feature.coreComponent
import com.godohdev.tvshow.di.DaggerTvShowComponent

/**
 *
 * Created by Wahyu Permadi on 2020-01-15.
 * Android Engineer
 *
 **/



fun inject(fragment: TvShowFragment) {

    fragment.coreComponent()?.let {
        DaggerTvShowComponent.builder()
            .fragment(fragment)
            .coreComponent(coreComponent(fragment.context!!))
            .build()
            .inject(fragment)
    }
}