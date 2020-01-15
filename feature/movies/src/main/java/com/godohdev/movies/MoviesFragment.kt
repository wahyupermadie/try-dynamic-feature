package com.godohdev.movies

//import com.godohdev.movies.di.DaggerMoviesComponent
import android.annotation.SuppressLint
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.godohdev.base.BaseFragment
import com.godohdev.base.data.network.ApiService
import com.godohdev.base.di.CoreComponent
import com.godohdev.base.di.DaggerCoreComponent
import com.godohdev.movies.databinding.FragmentMoviesBinding
import com.godohdev.movies.di.DaggerMoviesComponent
import javax.inject.Inject


/**
 *
 * Created by Wahyu Permadi on 2020-01-13.
 * Android Engineer
 *
 **/

class MoviesFragment : BaseFragment(){
    private lateinit var binding : FragmentMoviesBinding

    private val coreComponent : CoreComponent by lazy {
        DaggerCoreComponent.create()
    }

    @Inject
    lateinit var apiService: ApiService

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        DaggerMoviesComponent.builder()
            .fragmentMovies(this)
            .coreComponent(coreComponent)
            .build()
            .inject(this)

        binding = FragmentMoviesBinding.inflate(inflater, container, false)
        return binding.root
    }

    @SuppressLint("CheckResult")
    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        (requireActivity()).title = "My title"

//        apiService.getMoviesPopular()
//            .observeOn(AndroidSchedulers.mainThread())
//            .subscribeOn(Schedulers.io())
//            .subscribe({
//                Log.d("DATA_GUE","DATA "+it.results)
//            },{
//
//            })
    }
}