package com.otcengineering.dreamer.views.activity

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.otcengineering.dreamer.R
import com.otcengineering.dreamer.databinding.ActivityStep3Binding
import com.otcengineering.dreamer.views.fragment.CloseEyesFragment

class Step3Activity  : AppCompatActivity() {

    private val binding: ActivityStep3Binding by lazy { ActivityStep3Binding.inflate(layoutInflater) }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(binding.root)
        supportActionBar?.hide()

        binding.letsGo.setOnClickListener {
            startActivity(Intent(this, ExternalFlowActivity::class.java))
        }

    }

}