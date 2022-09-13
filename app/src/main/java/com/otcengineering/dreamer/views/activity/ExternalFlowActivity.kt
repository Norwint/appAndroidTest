package com.otcengineering.dreamer.views.activity

import android.content.Intent
import android.os.Bundle
import android.os.Handler
import android.os.Looper
import androidx.appcompat.app.AppCompatActivity
import com.otcengineering.dreamer.R
import com.otcengineering.dreamer.databinding.ActivityExternalflowBinding
import com.otcengineering.dreamer.views.popups.CustomDialog
import id.ionbit.ionalert.IonAlert

class ExternalFlowActivity : AppCompatActivity() {

    private val binding: ActivityExternalflowBinding by lazy { ActivityExternalflowBinding.inflate(layoutInflater) }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(binding.root)
        supportActionBar?.hide()

        binding.webview.loadUrl("https://mjn.cat/ca/")

        binding.button.setOnClickListener {
            var dialog = CustomDialog(this, "All test completed!")
            dialog.setImage(true)
            dialog.show()

            Handler(Looper.getMainLooper()).postDelayed({
                startActivity(Intent(this, WrapActivity::class.java))
            }, 2000)
        }
    }
}


