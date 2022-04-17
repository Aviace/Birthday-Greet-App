package com.example.birthdayapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.example.birthdayapp.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

       binding.createBirthdayButton.setOnClickListener {

           val name = binding.nameInput.editableText.toString()

           Toast.makeText(this, "Card created!", Toast.LENGTH_SHORT).show()

           val intent = Intent(this, BirthdayGreetingActivity::class.java)
           intent.putExtra(BirthdayGreetingActivity.NAME_EXTRA, name)

           startActivity(intent)
       }
    }


}