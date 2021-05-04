package com.example.singin

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.singin.databinding.ActivityMainBinding


class MainActivity : AppCompatActivity() {
    lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        addCallbacks()
    }
    private fun addCallbacks() {
        binding.button.setOnClickListener {
            val intent = Intent(this,info:: class.java)
            val name = binding.textView.text.toString()
            val password = binding.textView2.text.toString()
            intent.putExtra(constant.username,name)
            intent.putExtra(constant.password,password)
            startActivity(intent)
        }
    }
}