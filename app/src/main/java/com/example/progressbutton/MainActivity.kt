package com.example.progressbutton

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.lifecycle.lifecycleScope
import com.example.progressbutton.databinding.ActivityMainBinding
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.progressButton.setOnClickListener {
            binding.progressButton.setLoading()
            lifecycleScope.launch {
                delay(3_000)
                binding.progressButton.setNormal()
            }
        }
    }
}
