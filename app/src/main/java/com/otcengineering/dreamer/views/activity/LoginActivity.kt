package com.otcengineering.dreamer.views.activity

import android.app.Activity
import android.content.Intent
import android.os.Bundle
import android.os.Handler
import android.os.Looper
import androidx.appcompat.app.AppCompatActivity
import com.otcengineering.dreamer.R
import com.otcengineering.dreamer.databinding.ActivityLoginBinding
import com.otcengineering.dreamer.network.Network
import com.otcengineering.dreamer.serial.LoginRequest
import com.otcengineering.dreamer.serial.LoginResponse
import com.otcengineering.dreamer.views.popups.CustomDialog
import com.otcengineering.elausasdk.bluetooth.Bluetooth
import retrofit2.Call
import retrofit2.Response

class LoginActivity : AppCompatActivity() {
    
    private val binding: ActivityLoginBinding by lazy { ActivityLoginBinding.inflate(layoutInflater) }
    val bluetooth : Bluetooth by lazy { Bluetooth(this) }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(binding.root)
        binding.activity = this

        if (!bluetooth.isBluetoothEnabled()) {
            bluetooth.requestEnableBluetooth{}
        }
    }

    var UDI = ""
    var codi = ""

    var logReq = LoginRequest("ES",UDI,codi)

    fun login () {

        Network.api.login(logReq).enqueue(object: retrofit2.Callback<LoginResponse> {
            override fun onResponse(call: Call<LoginResponse>, response: Response<LoginResponse>) {
                popup()
            }

            override fun onFailure(call: Call<LoginResponse>, t: Throwable) {

            }
        })

    }

    fun popup () {

        var dialog = CustomDialog(this, getString(R.string.connecting_to_device))
        dialog.setLoading(true)
        dialog.show()

        bluetooth.setOnConnectionChangedListener {
            Handler(Looper.getMainLooper()).postDelayed({
                var dialog = CustomDialog(this, getString(R.string.device_connected))
                dialog.setImage(true)
                dialog.show()
                Handler(Looper.getMainLooper()).postDelayed({
                    startActivity(Intent(this, MainActivity::class.java))
                }, 1000)
            }, 2000)
        }

        bluetooth.connect(this)

    }

}