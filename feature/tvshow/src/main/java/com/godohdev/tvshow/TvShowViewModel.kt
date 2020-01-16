package com.godohdev.tvshow

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import com.godohdev.base.base.BaseViewModel
import com.godohdev.base.data.model.ResponseMovies
import com.godohdev.base.data.network.ApiService
import io.reactivex.android.schedulers.AndroidSchedulers
import io.reactivex.disposables.CompositeDisposable
import io.reactivex.schedulers.Schedulers
import javax.inject.Inject


/**
 *
 * Created by Wahyu Permadi on 2020-01-16.
 * Android Engineer
 *
 **/

class TvShowViewModel @Inject constructor(
    val apiService: ApiService
) : BaseViewModel() {

    fun fetchData() : LiveData<ResponseMovies>{
        val data = MutableLiveData<ResponseMovies>()
        val disposable= apiService.getMoviesPopular()
            .observeOn(AndroidSchedulers.mainThread())
            .subscribeOn(Schedulers.io())
            .subscribe({
                data.value = it
            },{
                data.value = null
            })
        CompositeDisposable().addAll(disposable)
        return data
    }
}