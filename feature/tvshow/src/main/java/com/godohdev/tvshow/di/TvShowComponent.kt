package com.godohdev.tvshow.di

import com.godohdev.base.base.BaseFragmentComponent
import com.godohdev.base.di.CoreComponent
import com.godohdev.base.di.scope.FeatureScope
import com.godohdev.tvshow.TvShowFragment
import dagger.Component
import dagger.android.support.AndroidSupportInjectionModule


/**
 *
 * Created by Wahyu Permadi on 2020-01-15.
 * Android Engineer
 *
 **/

@Component(modules = [AndroidSupportInjectionModule::class, FragmentBuilder::class, TvNetworkModule::class],
    dependencies = [CoreComponent::class])
@FeatureScope
interface TvShowComponent : BaseFragmentComponent<TvShowFragment> {
    @Component.Builder
    interface Builder {
        fun coreComponent(coreComponent: CoreComponent) : Builder
        fun build() : TvShowComponent
    }
}