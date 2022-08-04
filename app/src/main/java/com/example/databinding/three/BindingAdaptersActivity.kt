package com.example.databinding.three

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.databinding.R
import com.example.databinding.databinding.ActivityBindingAdaptersBinding

class BindingAdaptersActivity : AppCompatActivity() {

    private lateinit var binding: ActivityBindingAdaptersBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityBindingAdaptersBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val data = DataModel(
            "Title",
            "Description",
            "https://filmfare.wwmindia.com/content/2022/jun/ramcharansalmankhan11655726909.jpg"
        )

        binding.dataModel = data

    }
}