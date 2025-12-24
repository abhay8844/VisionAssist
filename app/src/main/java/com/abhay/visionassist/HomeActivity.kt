package com.abhay.visionassist // Make sure this matches your package name

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity
import com.abhay.visionassist.MainActivity
import com.abhay.visionassist.R

class HomeActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_home)

        // Find the button from the XML
        val startButton = findViewById<Button>(R.id.btn_start)

        // What happens when you click it
        startButton.setOnClickListener {
            // "this" = Current Screen, "MainActivity" = Camera Screen
            val intent = Intent(this, MainActivity::class.java)
            startActivity(intent)
        }
    }
}