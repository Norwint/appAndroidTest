package com.otcengineering.dreamer.views.activity

import android.content.Intent
import android.media.MediaPlayer
import android.os.Bundle
import android.os.Handler
import android.os.Looper
import android.view.View
import androidx.appcompat.app.AppCompatActivity
import com.otcengineering.dreamer.R
import com.otcengineering.dreamer.databinding.ActivityStep2Binding
import com.otcengineering.dreamer.views.fragment.*
import com.otcengineering.dreamer.views.popups.CustomDialog
import id.ionbit.ionalert.IonAlert

class Step2Activity  : AppCompatActivity() {

    private val binding: ActivityStep2Binding by lazy { ActivityStep2Binding.inflate(layoutInflater) }

    var cont = 1

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(binding.root)
        supportActionBar?.hide()

        binding.progressbar.progress = 10
        val transaction = supportFragmentManager.beginTransaction()
        transaction.replace(R.id.fragment, RelaxationFragment())
        transaction.addToBackStack(null)
        transaction.commit()

        binding.nextStep.visibility = View.INVISIBLE
        binding.repeat.visibility = View.INVISIBLE

        binding.letsGo.setOnClickListener {
            val transaction = supportFragmentManager.beginTransaction()
            transaction.replace(R.id.fragment, CloseEyesFragment())
            transaction.addToBackStack(null)
            transaction.commit()
            binding.letsGo.visibility = View.INVISIBLE

            Handler(Looper.getMainLooper()).postDelayed({
                val mp = MediaPlayer.create(this, R.raw.alarma)
            }, 3000)
            Handler(Looper.getMainLooper()).postDelayed({
                val transaction = supportFragmentManager.beginTransaction()
                transaction.replace(R.id.fragment, OpenEyesFragment())
                transaction.addToBackStack(null)
                transaction.commit()

                Handler(Looper.getMainLooper()).postDelayed({
                    val mp = MediaPlayer.create(this, R.raw.alarma)
                }, 3000)
                Handler(Looper.getMainLooper()).postDelayed({
                    binding.nextStep.visibility = View.VISIBLE
                    val transaction = supportFragmentManager.beginTransaction()
                    transaction.replace(R.id.fragment, RelaxationCompletedFragment())
                    transaction.addToBackStack(null)
                    transaction.commit()
                }, 5000)
            }, 5000)
        }

        binding.nextStep.setOnClickListener {
            startActivity(Intent(this, Step3Activity::class.java))
        }

//        binding.repeat.setOnClickListener {
//            cont = 1
//            val transaction = supportFragmentManager.beginTransaction()
//            transaction.replace(R.id.fragment, RelaxationFragment())
//            transaction.addToBackStack(null)
//            transaction.commit()
//            binding.letsGo.visibility = View.VISIBLE
//            binding.nextStep.visibility = View.INVISIBLE
//            binding.repeat.visibility = View.INVISIBLE
//        }

    }

private fun searchFragment() {

        when(cont) {
            2 -> {
                val transaction = supportFragmentManager.beginTransaction()
                transaction.replace(R.id.fragment, OpenEyesFragment())
                transaction.addToBackStack(null)
                transaction.commit()
            }
            3 -> {
                val transaction = supportFragmentManager.beginTransaction()
                transaction.replace(R.id.fragment, RelaxationCompletedFragment())
                transaction.addToBackStack(null)
                transaction.commit()
            }
            4 -> {
                startActivity(Intent(this, Step3Activity::class.java))
            }
        }

    }
}