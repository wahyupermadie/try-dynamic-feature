package com.godohdev.tvshow.di

import androidx.lifecycle.ViewModel
import com.godohdev.base.di.key.ViewModelKey
import com.godohdev.base.di.viewmodel.ViewModelFactory
import com.godohdev.tvshow.TvShowViewModel
import dagger.Binds
import dagger.Module
import dagger.multibindings.IntoMap


/**
 *
 * Created by Wahyu Permadi on 2020-01-16.
 * Android Engineer
 *
 **/

@Module
abstract class ViewModelModule {

    @Binds
    @IntoMap
    @ViewModelKey(TvShowViewModel::class)
    abstract fun bindViewTvShowViewModel(tvShowViewModel: TvShowViewModel) : ViewModel

}