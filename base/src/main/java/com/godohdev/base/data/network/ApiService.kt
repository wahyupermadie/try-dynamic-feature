package com.godohdev.base.data.network

import com.godohdev.base.data.model.ResponseMovies
import io.reactivex.Flowable
import retrofit2.http.Field
import retrofit2.http.GET


/**
 *
 * Created by Wahyu Permadi on 2020-01-15.
 * Android Engineer
 *
 **/

interface ApiService {

    @GET("/movie/popular")
    fun getMoviesPopular(@Field("api_key") key : String? = "01c5d0d1ff15325934327ab3965e26f6") : Flowable<ResponseMovies>
}