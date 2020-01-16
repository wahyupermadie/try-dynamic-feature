package com.godohdev.base.di.scope

import javax.inject.Scope
import kotlin.annotation.AnnotationRetention.RUNTIME

/**
 *
 * Created by Wahyu Permadi on 2020-01-15.
 * Android Engineer
 *
 **/

/**
 * Scope for a feature module.
 */
@Scope
@Retention(RUNTIME)
annotation class FeatureScope