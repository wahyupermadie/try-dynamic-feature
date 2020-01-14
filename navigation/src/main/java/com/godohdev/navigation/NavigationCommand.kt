package com.godohdev.navigation

import androidx.lifecycle.ViewModel
import androidx.navigation.NavDirections


/**
 *
 * Created by Wahyu Permadi on 2020-01-14.
 * Android Engineer
 *
 **/

/**
 * A simple sealed class to handle more properly
 * navigation from a [ViewModel]
 */
sealed class NavigationCommand {
    data class To(val directions: NavDirections): NavigationCommand()
    object Back: NavigationCommand()
    object ClearAll: NavigationCommand()
}