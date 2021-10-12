package com.example.checkin

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class PlanEvent : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_plan_event)


        val save=findViewById<Button>(R.id.button4)
        save.setOnClickListener{
            val intent = Intent(this, EventsPage::class.java)
            startActivity(intent)
        }
    }
}