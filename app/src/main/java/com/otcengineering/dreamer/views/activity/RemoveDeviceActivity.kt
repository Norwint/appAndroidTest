package com.otcengineering.dreamer.views.activity

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.otcengineering.dreamer.databinding.ActivityRemovedeviceBinding

class RemoveDeviceActivity : AppCompatActivity() {

    private val binding: ActivityRemovedeviceBinding by lazy { ActivityRemovedeviceBinding.inflate(layoutInflater) }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(binding.root)
        supportActionBar?.hide()

        binding.letsGo.setOnClickListener {
            startActivity(Intent(this, RateActivity::class.java))
        }
    }

}