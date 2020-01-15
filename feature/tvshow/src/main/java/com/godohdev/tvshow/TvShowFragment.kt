package com.godohdev.tvshow

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.godohdev.base.BaseFragment
import com.godohdev.base.data.network.ApiService
import com.godohdev.try_dynamic_feature.coreComponent
import com.godohdev.tvshow.databinding.FragmentTvShowBinding
import com.godohdev.tvshow.di.DaggerTvShowComponent
import dagger.android.support.AndroidSupportInjection
import io.reactivex.android.schedulers.AndroidSchedulers
import io.reactivex.schedulers.Schedulers
import javax.inject.Inject

class TvShowFragment : BaseFragment() {
    private lateinit var binding : FragmentTvShowBinding

    @Inject
    lateinit var apiService: ApiService

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        inject(this)
        binding = FragmentTvShowBinding.inflate(inflater, container, false)
        return binding.root
    }

    @SuppressLint("CheckResult")
    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)

        Log.d("DATA_GUE","DATA "+(apiService))
        apiService.getMoviesPopular()
            .observeOn(AndroidSchedulers.mainThread())
            .subscribeOn(Schedulers.io())
            .subscribe({
                Log.d("DATA_GUE","DATA "+it.results)
            },{

            })
    }
}
