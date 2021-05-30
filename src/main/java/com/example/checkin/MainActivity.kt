package com.example.checkin

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val button=findViewById<Button>(R.id.Login1)
        button.setOnClickListener{
            val intent = Intent(this, Login::class.java)
            startActivity(intent)
        }
    }
}