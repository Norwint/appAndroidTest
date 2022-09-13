package com.otcengineering.dreamer.views.activity

import android.app.Activity
import android.content.Intent
import android.os.Bundle
import android.os.Handler
import android.os.Looper
import com.otcengineering.dreamer.databinding.ActivityGetpreparedBinding
import com.otcengineering.dreamer.views.popups.CustomDialog

class GetPreparedActivity : Activity() {

    private val binding: ActivityGetpreparedBinding by lazy { ActivityGetpreparedBinding.inflate(layoutInflater) }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(binding.root)
        binding.activity = this
    }

    fun popup () {

        var dialog = CustomDialog(this, "Lets get started")
        dialog.setLoading(false)
        dialog.show()

        Handler(Looper.getMainLooper()).postDelayed({
            startActivity(Intent(this, MainActivity::class.java))
        }, 2000)
    }

}