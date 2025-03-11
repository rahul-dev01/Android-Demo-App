package com.example.demoapp

import android.graphics.Color
import android.os.Bundle
import android.view.View
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class p21BackgroundColorChange : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_p21_background_color_change)

        val colorDisplay : View = findViewById(R.id.colorDisplay)
        val colorTeal : View = findViewById(R.id.colorTeal)
        val colorRed : View = findViewById(R.id.colorRed)
        val  colorGreen : View = findViewById(R.id.colorGreen)

        colorTeal.setOnClickListener{
            colorDisplay.setBackgroundColor(Color.parseColor("#008080"))
        }
        colorRed.setOnClickListener {
            colorDisplay.setBackgroundColor(Color.RED) // Red color
        }

        colorGreen.setOnClickListener {
            colorDisplay.setBackgroundColor(Color.GREEN)
        }
    }
}