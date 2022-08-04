package com.example.databinding.second

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.databinding.R
import com.example.databinding.databinding.ActivitySecondBinding
import com.example.databinding.model.User

class SecondActivity : AppCompatActivity() {

    private lateinit var binding: ActivitySecondBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivitySecondBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val user = User("Narasimha","Yasam",25,true)

        binding.secondUser = user



    }
}