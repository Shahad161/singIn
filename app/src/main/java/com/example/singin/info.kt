package com.example.singin

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.singin.databinding.ActivityInfoBinding

class info : AppCompatActivity() {
    lateinit var binding: ActivityInfoBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityInfoBinding.inflate(layoutInflater)
        setContentView(binding.root)
        val name = intent.getStringExtra(constant.username)
        binding.textView.text = name
        val password = intent.getStringExtra(constant.password)
        binding.textView2.text = password

    }
}