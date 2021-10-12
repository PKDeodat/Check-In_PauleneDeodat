package com.example.checkin

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class EventsPage : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_events_page)

        val plan=findViewById<Button>(R.id.button2)
        plan.setOnClickListener{
            val intent = Intent(this, PlanEvent::class.java)
            startActivity(intent)
        }

        val weather=findViewById<Button>(R.id.button3)
        weather.setOnClickListener{
            val intent = Intent(this, WeatherPage::class.java)
            startActivity(intent)
        }
    }
}