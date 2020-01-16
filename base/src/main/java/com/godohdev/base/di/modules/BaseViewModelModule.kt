package com.godohdev.base.di.modules

import androidx.lifecycle.ViewModelProvider
import com.godohdev.base.di.viewmodel.ViewModelFactory
import dagger.Binds
import dagger.Module


/**
 *
 * Created by Wahyu Permadi on 2020-01-16.
 * Android Engineer
 *
 **/

@Module
abstract class BaseViewModelModule {
    @Binds
    internal abstract fun bindViewModelFactory(factory: ViewModelFactory): ViewModelProvider.Factory
}
