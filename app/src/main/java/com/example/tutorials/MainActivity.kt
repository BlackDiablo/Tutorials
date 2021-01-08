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
}