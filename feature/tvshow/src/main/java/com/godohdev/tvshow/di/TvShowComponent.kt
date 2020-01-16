package com.godohdev.tvshow.di

import com.godohdev.base.base.BaseComponent
import com.godohdev.base.di.CoreComponent
import com.godohdev.base.di.FeatureScope
import com.godohdev.try_dynamic_feature.CoreApplication
import com.godohdev.tvshow.TvShowFragment
import dagger.BindsInstance
import dagger.Component
import dagger.android.AndroidInjection
import dagger.android.support.AndroidSupportInjection
import dagger.android.support.AndroidSupportInjectionModule
import javax.inject.Singleton


/**
 *
 * Created by Wahyu Permadi on 2020-01-15.
 * Android Engineer
 *
 **/

@Component(modules = [AndroidSupportInjectionModule::class, FragmentBuilder::class, TvNetworkModule::class],
    dependencies = [CoreComponent::class])
@FeatureScope
interface TvShowComponent : BaseComponent<TvShowFragment>{
    @Component.Builder
    interface Builder {
        @BindsInstance fun fragment(fragment: TvShowFragment) : Builder
        fun coreComponent(coreComponent: CoreComponent) : Builder
        fun build() : TvShowComponent
    }
}