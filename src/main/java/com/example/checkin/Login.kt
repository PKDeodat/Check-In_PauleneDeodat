package com.example.checkin

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import kotlinx.android.synthetic.main.activity_login.*

class Login : AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)



        val button=findViewById<Button>(R.id.Login2)
        button.setOnClickListener{
            val intent = Intent(this, CalendarPage::class.java)
            startActivity(intent)
        }
        val sign =findViewById<Button>(R.id.signup)
        sign.setOnClickListener{
            val intent=Intent(this, SignUp::class.java)
        }
        
    }
}