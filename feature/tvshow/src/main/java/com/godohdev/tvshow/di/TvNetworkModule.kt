package com.godohdev.tvshow.di

import com.godohdev.base.data.network.ApiService
import com.godohdev.base.di.scope.FeatureScope
import dagger.Module
import dagger.Provides
import retrofit2.Retrofit


/**
 *
 * Created by Wahyu Permadi on 2020-01-15.
 * Android Engineer
 *
 **/

@Module
class TvNetworkModule{

    @Provides
    @FeatureScope
    fun apiService(retrofit: Retrofit): ApiService {
        return retrofit.create(ApiService::class.java)
    }
}