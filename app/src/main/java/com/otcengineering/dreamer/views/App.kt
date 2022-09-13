package com.otcengineering.dreamer.views

import android.app.Application
import com.otcengineering.elausasdk.bluetooth.Bluetooth

class App : Application() {

    override fun onCreate() {
        super.onCreate()
        Bluetooth.init(this)
    }

}