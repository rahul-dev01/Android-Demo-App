package com.example.demoapp

import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)


        val inputOne = findViewById<EditText>(R.id.editTextText)
        val inputTwo = findViewById<EditText>(R.id.editTextText2)
        val calculateButton = findViewById<Button>(R.id.button)
        val resultTextView = findViewById<TextView>(R.id.textView3)


        calculateButton.setOnClickListener {
            val num1 = inputOne.text.toString()
            val num2 = inputTwo.text.toString()

            if (num1.isNotEmpty() && num2.isNotEmpty()) {
                try {
                    val sum = num1.toDouble() + num2.toDouble()
                    resultTextView.text = "Result: $sum"
                } catch (e: NumberFormatException) {
                    resultTextView.text = "Invalid input!"
                }
            } else {
                resultTextView.text = "Please enter numbers"
            }
        }
    }
}