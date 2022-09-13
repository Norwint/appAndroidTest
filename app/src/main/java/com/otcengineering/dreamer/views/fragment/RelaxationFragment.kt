package com.otcengineering.dreamer.views.fragment

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.otcengineering.dreamer.R
import com.otcengineering.dreamer.databinding.FragmentRelaxationBinding

class RelaxationFragment : Fragment() {
    private val binding: FragmentRelaxationBinding by lazy { FragmentRelaxationBinding.inflate(layoutInflater) }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_relaxation, container, false)
    }

}