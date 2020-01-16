package com.godohdev.tvshow.di

import com.godohdev.tvshow.TvShowFragment
import dagger.Module
import dagger.android.ContributesAndroidInjector


/**
 *
 * Created by Wahyu Permadi on 2020-01-16.
 * Android Engineer
 *
 **/

@Module
abstract class FragmentBuilder {

    @ContributesAndroidInjector
    abstract fun bindWelcomeFragment(): TvShowFragment
}