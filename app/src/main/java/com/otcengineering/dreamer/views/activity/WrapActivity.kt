package com.otcengineering.dreamer.views.activity

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.otcengineering.dreamer.databinding.ActivityWrapBinding

class WrapActivity : AppCompatActivity() {

    private val binding: ActivityWrapBinding by lazy { ActivityWrapBinding.inflate(layoutInflater) }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(binding.root)
        supportActionBar?.hide()

        binding.letsGo.setOnClickListener {
            startActivity(Intent(this, RemoveDeviceActivity::class.java))
        }

        binding.alreadyKnow.setOnClickListener {
            startActivity(Intent(this, RateActivity::class.java))
        }
    }

}