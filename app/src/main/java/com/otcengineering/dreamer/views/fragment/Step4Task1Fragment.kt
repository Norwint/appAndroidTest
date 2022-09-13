package com.otcengineering.dreamer.views.fragment

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.otcengineering.dreamer.R
import com.otcengineering.dreamer.databinding.FragmentStep4task1Binding

class Step4Task1Fragment : Fragment() {
    private val binding: FragmentStep4task1Binding by lazy { FragmentStep4task1Binding.inflate(layoutInflater) }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_step4task1, container, false)
    }

}