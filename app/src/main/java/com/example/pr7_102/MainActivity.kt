package com.example.pr7_102

import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.MediaController
import com.example.pr7_102.databinding.ActivityMainBinding

private lateinit var binding: ActivityMainBinding
class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)


        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        initVideoPlayer()
        binding.vbtn.setOnClickListener {
            Intent(this,youtube::class.java).also { startActivity(it) }
        }
    }
    private fun initVideoPlayer(){
        val mediaController = MediaController(this)
        val uri: Uri = Uri.parse("android.resources://" + "com.example.pr7_102" + "/"+ R.raw.thestoryoflight)
        binding.videoView.setMediaController(mediaController)
        mediaController.setAnchorView(binding.videoView)
        binding.videoView.setVideoURI(uri)
        binding.videoView.requestFocus()
        binding.videoView.start()
    }
}

