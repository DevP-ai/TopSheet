package com.developer.android.dev.technologia.androidapp.topsheet

import android.os.Bundle
import android.view.View
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.androidbolts.topsheet.TopSheetBehavior
import com.developer.android.dev.technologia.androidapp.topsheet.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    private lateinit var topSheetBehavior: TopSheetBehavior<View>
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        topSheetBehavior = TopSheetBehavior.from(binding.topSheet)

        topSheetBehavior.state = TopSheetBehavior.STATE_COLLAPSED

        binding.openTopSheetButton.setOnClickListener {
            topSheetBehavior.state = TopSheetBehavior.STATE_EXPANDED
        }

        binding.closeTopSheetButton.setOnClickListener {
            topSheetBehavior.state = TopSheetBehavior.STATE_COLLAPSED
        }

    }
}