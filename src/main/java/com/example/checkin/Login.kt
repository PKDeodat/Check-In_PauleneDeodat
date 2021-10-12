package com.example.checkin

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_login.*

class Login : AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)



        val button=findViewById<Button>(R.id.Login2)
        button.setOnClickListener{
            val intent = Intent(this, EventsPage::class.java)
            startActivity(intent)
        }
        val butt=findViewById<Button>(R.id.signup)
        butt.setOnClickListener{
            val intent= Intent(this, SignUp::class.java)
            startActivity(intent)
        }

        
    }
}