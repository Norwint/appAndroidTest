package com.otcengineering.dreamer.views.fragment

import android.os.Bundle
import android.os.CountDownTimer
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.otcengineering.dreamer.databinding.FragmentCloseeyesBinding


class CloseEyesFragment : Fragment() {
    private val binding: FragmentCloseeyesBinding by lazy { FragmentCloseeyesBinding.inflate(layoutInflater) }


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding.fragment = this
        var lastSecond =  0L
        val timer = object: CountDownTimer(5000, 1000) {
            override fun onTick(millisUntilFinished: Long) {
                val seconds = millisUntilFinished / 1000

                if(lastSecond != seconds){}
                lastSecond = seconds

                val sec: Long = seconds % 60
                val min: Long = (seconds / 60) % 60

                val strSec = if (sec < 10) "0" + Integer.toString(sec.toInt()) else Integer.toString(
                    sec.toInt()
                )
                val strmin = if (min < 10) "0" + Integer.toString(min.toInt()) else Integer.toString(
                    min.toInt()
                )

                binding.contador.text = strmin + ":" +strSec

            }
            override fun onFinish() {
                binding.contador.text = "finished"
            }
        }
        timer.start()
        return binding.root
    }

}