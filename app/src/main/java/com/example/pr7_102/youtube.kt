package com.example.pr7_102

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.core.view.WindowCompat
import com.example.pr7_102.databinding.ActivityMainBinding
import com.example.pr7_102.databinding.ActivityYoutubeBinding

private lateinit var binding: ActivityYoutubeBinding
class youtube : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        WindowCompat.setDecorFitsSystemWindows(window,false)
        super.onCreate(savedInstanceState)
        binding = ActivityYoutubeBinding.inflate(layoutInflater)
        setContentView(binding.root)
        initYoutubePlayer()
        binding.ytbtn.setOnClickListener {  }
    }
}