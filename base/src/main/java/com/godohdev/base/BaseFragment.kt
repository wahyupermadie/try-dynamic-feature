package com.godohdev.base

import android.os.Bundle
import androidx.fragment.app.Fragment


/**
 *
 * Created by Wahyu Permadi on 2020-01-14.
 * Android Engineer
 *
 **/

abstract class BaseFragment : Fragment(){

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
    }
}