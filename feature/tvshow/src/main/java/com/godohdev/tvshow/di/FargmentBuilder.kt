package com.godohdev.tvshow.di

import com.godohdev.base.data.network.ApiService
import com.godohdev.tvshow.TvShowFragment
import dagger.Binds
import dagger.Module
import dagger.Provides
import dagger.android.ContributesAndroidInjector


/**
 *
 * Created by Wahyu Permadi on 2020-01-15.
 * Android Engineer
 *
 **/

@Module
abstract class FragmentBuilder {
    @ContributesAndroidInjector(modules = [NetworkModules::class])
    internal abstract fun provideTvShowFragment() : TvShowFragment
}
