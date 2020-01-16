package com.godohdev.tvshow

import android.annotation.SuppressLint
import android.os.Bundle
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProviders
import com.godohdev.base.base.BaseFragment
import com.godohdev.base.data.network.ApiService
import com.godohdev.base.di.viewmodel.ViewModelFactory
import com.godohdev.tvshow.databinding.FragmentTvShowBinding
import io.reactivex.android.schedulers.AndroidSchedulers
import io.reactivex.schedulers.Schedulers
import okhttp3.OkHttpClient
import javax.inject.Inject

class TvShowFragment : BaseFragment() {
    private lateinit var binding : FragmentTvShowBinding

    @Inject
    lateinit var viewModelFactory: ViewModelFactory

    lateinit var viewModel : TvShowViewModel

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        inject(this)
        viewModel = ViewModelProviders.of(this, viewModelFactory)[TvShowViewModel::class.java]
        binding = FragmentTvShowBinding.inflate(inflater, container, false)
        binding.lifecycleOwner = viewLifecycleOwner
        return binding.root
    }

    @SuppressLint("CheckResult")
    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)

        viewModel.fetchData().observe(this, Observer {
            Log.d("DATA_GUE", "DATA "+it)
        })
    }
}
