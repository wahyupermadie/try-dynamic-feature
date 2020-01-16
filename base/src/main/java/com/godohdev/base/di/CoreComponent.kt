package com.godohdev.base.di

import com.godohdev.base.di.modules.NetworkModule
import dagger.Component
import okhttp3.OkHttpClient
import okhttp3.logging.HttpLoggingInterceptor
import retrofit2.Retrofit
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

    fun provideOkHttp() : OkHttpClient
    fun provideLoggingInterceptor() : HttpLoggingInterceptor
    fun provideRetrofit() : Retrofit
}


