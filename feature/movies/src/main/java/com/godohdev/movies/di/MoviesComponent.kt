package com.godohdev.movies.di

import androidx.fragment.app.Fragment
import com.godohdev.base.di.CoreComponent
import com.godohdev.base.di.FeatureScope
import com.godohdev.movies.MoviesFragment
import dagger.BindsInstance
import dagger.Component


/**
 *
 * Created by Wahyu Permadi on 2020-01-15.
 * Android Engineer
 *
 **/

@Component(modules = [MoviesNetworkModule::class], dependencies = [CoreComponent::class])
@FeatureScope
interface MoviesComponent {
    @Component.Builder
    interface Builder {
        @BindsInstance
        fun fragmentMovies(moviesFragment: MoviesFragment) : Builder
        fun coreComponent(coreComponent: CoreComponent) : Builder
        fun build() : MoviesComponent
    }

    fun inject(fragment: Fragment)
}