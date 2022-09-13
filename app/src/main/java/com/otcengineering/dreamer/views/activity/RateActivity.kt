package com.otcengineering.dreamer.views.activity

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.otcengineering.dreamer.databinding.ActivityRateBinding
import com.otcengineering.dreamer.databinding.ActivityRemovedeviceBinding

class RateActivity : AppCompatActivity() {

    private val binding: ActivityRateBinding by lazy { ActivityRateBinding.inflate(layoutInflater) }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(binding.root)
        supportActionBar?.hide()

        binding.letsGo.setOnClickListener {
            finishAffinity()
            System.exit(0)
        }
    }

}