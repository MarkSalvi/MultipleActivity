package com.example.multipleactivity

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.Toast

class Check : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_check)
        val button = findViewById<Button>(R.id.submitButton)
        button.setOnClickListener{

            // Display toast message
            Toast.makeText(applicationContext,
                "Your response has been recorded", Toast.LENGTH_LONG).show()
        }


    }
}