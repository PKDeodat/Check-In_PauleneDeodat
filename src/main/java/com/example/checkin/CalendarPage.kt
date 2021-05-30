package com.example.checkin

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class CalendarPage : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_calendar_page)
        val button=findViewById<Button>(R.id.Weatherpage)
        button.setOnClickListener{
            val intent = Intent(this, WeatherPage::class.java)
            startActivity(intent)
        }
    }
}