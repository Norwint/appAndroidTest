package com.otcengineering.dreamer.views.fragment

import android.os.Bundle
import android.os.CountDownTimer
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.otcengineering.dreamer.R
import com.otcengineering.dreamer.databinding.FragmentRelaxationcompletedBinding


class RelaxationCompletedFragment : Fragment() {
    private val binding: FragmentRelaxationcompletedBinding by lazy { FragmentRelaxationcompletedBinding.inflate(layoutInflater) }


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_relaxationcompleted, container, false)
    }

}