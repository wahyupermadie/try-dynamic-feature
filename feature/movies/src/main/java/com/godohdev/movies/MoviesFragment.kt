package com.godohdev.movies

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.godohdev.base.BaseFragment
import com.godohdev.movies.databinding.FragmentMoviesBinding


/**
 *
 * Created by Wahyu Permadi on 2020-01-13.
 * Android Engineer
 *
 **/

class MoviesFragment : BaseFragment(){
    private lateinit var binding : FragmentMoviesBinding
    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentMoviesBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        (requireActivity()).title = "My title"

    }
}