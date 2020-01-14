package com.godohdev.tvshow

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.godohdev.base.BaseFragment
import com.godohdev.tvshow.databinding.FragmentTvShowBinding

class TvShowFragment : BaseFragment() {
    private lateinit var binding : FragmentTvShowBinding
    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentTvShowBinding.inflate(inflater, container, false)
        return binding.root
    }
}
