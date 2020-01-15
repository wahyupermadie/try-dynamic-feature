package com.godohdev.tvshow.di

import androidx.fragment.app.Fragment
import com.godohdev.base.di.CoreComponent
import com.godohdev.base.di.FeatureScope
import com.godohdev.tvshow.TvShowFragment
import dagger.BindsInstance
import dagger.Component


/**
 *
 * Created by Wahyu Permadi on 2020-01-15.
 * Android Engineer
 *
 **/

@Component(modules = [NetworkModules::class], dependencies = [CoreComponent::class])
@FeatureScope
interface TvShowComponent {
    @Component.Builder
    interface Builder {
        fun coreComponent(coreComponent: CoreComponent) : Builder
        fun build() : TvShowComponent
    }

    fun inject(fragment: Fragment)
}