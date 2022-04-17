package com.example.birthdayapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.birthdayapp.databinding.ActivityBirthdayGreetingBinding
import com.example.birthdayapp.databinding.ActivityMainBinding

class BirthdayGreetingActivity : AppCompatActivity() {
    private  lateinit var  binding: ActivityBirthdayGreetingBinding

    companion object{
        const val NAME_EXTRA = "name_extra"
    }
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityBirthdayGreetingBinding.inflate(layoutInflater)
        setContentView(binding.root)
        val name = intent.getStringExtra(NAME_EXTRA)
        binding.birthdayGreeting.text = "Happy Birthday\n $name !"
    }
}