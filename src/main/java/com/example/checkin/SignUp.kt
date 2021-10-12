package com.example.checkin

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class SignUp : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_sign_up)

        val sign= findViewById<Button>(R.id.signup2)
        sign.setOnClickListener{
            val intent= Intent(this, Login::class.java)
            startActivity(intent)
        }
    }
}