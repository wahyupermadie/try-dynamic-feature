package com.godohdev.base

import android.annotation.SuppressLint
import android.os.Bundle
import android.util.Log
import androidx.fragment.app.Fragment
import com.godohdev.base.data.network.ApiService
import dagger.android.support.AndroidSupportInjection
import io.reactivex.android.schedulers.AndroidSchedulers
import io.reactivex.schedulers.Schedulers
import javax.inject.Inject


/**
 *
 * Created by Wahyu Permadi on 2020-01-14.
 * Android Engineer
 *
 **/

abstract class BaseFragment : Fragment(){
    @SuppressLint("CheckResult")
    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
    }
}