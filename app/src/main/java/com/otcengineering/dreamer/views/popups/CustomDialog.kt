package com.otcengineering.dreamer.views.popups

import android.app.Dialog
import android.content.Context
import android.widget.TextView
import android.os.Bundle
import android.view.View
import android.view.Window

import com.otcengineering.dreamer.R;
import com.otcengineering.dreamer.databinding.DialogCustomBinding


class CustomDialog(context: Context, message: String) : Dialog(context, android.R.style.Theme_Light) {
    
//    private var txtMessage: TextView? = null
    private var message: String? = message
    private var showLoading = false
    private var showImage = false
    private val binding: DialogCustomBinding by lazy {
        DialogCustomBinding.inflate(layoutInflater)
    }

    fun setLoading(loading: Boolean){
        showLoading = loading
    }

    fun setImage(loading: Boolean){
        showImage = loading
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        requestWindowFeature(Window.FEATURE_NO_TITLE)
        setContentView(binding.root)
        // txtMessage = findViewById(R.id.textMessage)
        // txtMessage?.setText(message)
        binding.progress.visibility = if(showLoading) View.VISIBLE else View.GONE
        binding.correct.visibility = if(showImage) View.VISIBLE else View.GONE
        binding.textMessage.text = message
    }
}