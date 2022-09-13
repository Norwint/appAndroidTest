package com.otcengineering.dreamer.views.fragment

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.otcengineering.dreamer.R
import com.otcengineering.dreamer.databinding.FragmentStep1task1Binding

class Step1Task1Fragment : Fragment() {
    private val binding: FragmentStep1task1Binding by lazy { FragmentStep1task1Binding.inflate(layoutInflater) }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_step1task1, container, false)
    }

}