package com.godohdev.base.base

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.godohdev.base.utils.Event
import com.godohdev.navigation.NavigationCommand


/**
 *
 * Created by Wahyu Permadi on 2020-01-16.
 * Android Engineer
 *
 **/

abstract class BaseViewModel : ViewModel(){

    private var _navigation = MutableLiveData<Event<NavigationCommand>>()
    val navigation : LiveData<Event<NavigationCommand>> get() = _navigation


}