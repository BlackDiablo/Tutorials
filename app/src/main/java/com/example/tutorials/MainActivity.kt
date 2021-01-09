package com.example.tutorials

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.tutorials.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(binding.root)
    }

    override fun onStart() {
        super.onStart()
        println("Activity_onStart")

    }

    override fun onResume() {
        super.onResume()
        println("Activity_onResume")
    }

    override fun onPause() {
        super.onPause()
        println("Activity_OnPause")
    }

    override fun onStop() {
        super.onStop()
        println("Activity_onStop")
    }

    override fun onRestart() {
        super.onRestart()
        println("Activity_onRestart")
    }

    override fun onDestroy() {
        super.onDestroy()
        println("Activity_onDestroy")
    }
}