package com.otcengineering.dreamer.views.activity

import android.content.Intent
import android.os.Bundle
import android.os.Handler
import android.os.Looper
import android.view.View
import androidx.appcompat.app.AppCompatActivity
import com.otcengineering.dreamer.R
import com.otcengineering.dreamer.databinding.ActivityMainBinding
import com.otcengineering.dreamer.views.fragment.*
import com.otcengineering.dreamer.views.popups.CustomDialog
import com.otcengineering.elausasdk.bluetooth.Bluetooth
import id.ionbit.ionalert.IonAlert

class MainActivity : AppCompatActivity() {
    private val binding: ActivityMainBinding by lazy { ActivityMainBinding.inflate(layoutInflater) }
    var cont = 1

    override fun onCreate(savedInstanceState: Bundle?) {

        super.onCreate(savedInstanceState)
        setContentView(binding.root)
        supportActionBar?.hide()

        val transaction = supportFragmentManager.beginTransaction()
        transaction.replace(R.id.fragment,
            Step5Task1Fragment()
        )
        transaction.addToBackStack(null)
        transaction.commit()
        binding.back.visibility = View.INVISIBLE
        binding.next.text = getString(R.string.check_device)

        binding.next.setOnClickListener{

            var dialog = CustomDialog(this, getString(R.string.checking_device))
            dialog.setLoading(true)
            dialog.show()


            Handler(Looper.getMainLooper()).postDelayed({
                var dialog = CustomDialog(this, getString(R.string.device_correct))
                dialog.setImage(true)
                dialog.show()
                Handler(Looper.getMainLooper()).postDelayed({
                    startActivity(Intent(this, Step2Activity::class.java))
                }, 1000)
            }, 2000)


//            if (cont >= 1) {
//
//            } else {
//                cont += 1
//                binding.back.visibility = View.VISIBLE
//            }
//            searchFragment()
        }

//        binding.back.setOnClickListener{
//            if (cont <= 2) {
//                cont = 1
//                binding.back.visibility = View.INVISIBLE
//            } else {
//                cont -= 1
//                binding.next.text = "Next"
//            }
//            searchFragment()
//        }
    }

    private fun searchFragment() {

        when(cont) {
            1 -> {
                val transaction = supportFragmentManager.beginTransaction()
                transaction.replace(R.id.fragment,
                    Step1Task1Fragment()
                )
                transaction.addToBackStack(null)
                transaction.commit()
            }
            2 -> {
                val transaction = supportFragmentManager.beginTransaction()
                transaction.replace(R.id.fragment, Step2Task1Fragment())
                transaction.addToBackStack(null)
                transaction.commit()
            }
            3 -> {
                val transaction = supportFragmentManager.beginTransaction()
                transaction.replace(R.id.fragment, Step3Task1Fragment())
                transaction.addToBackStack(null)
                transaction.commit()
            }
            4 -> {
                val transaction = supportFragmentManager.beginTransaction()
                transaction.replace(R.id.fragment, Step4Task1Fragment())
                transaction.addToBackStack(null)
                transaction.commit()
            }
            5 -> {
                val transaction = supportFragmentManager.beginTransaction()
                transaction.replace(R.id.fragment, Step5Task1Fragment())
                transaction.addToBackStack(null)
                transaction.commit()
                binding.next.text = "Check device"
            }
        }

    }

}