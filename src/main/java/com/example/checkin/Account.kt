package com.example.checkin

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.ActionBar
import com.google.firebase.auth.FirebaseAuth
import com.example.checkin.databinding.ActivityAccountBinding

class Account : AppCompatActivity() {

    private lateinit var binding: ActivityAccountBinding
    private lateinit var actionBar: ActionBar
    private lateinit var firebaseAuth: FirebaseAuth

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding= ActivityAccountBinding.inflate(layoutInflater)
        setContentView(binding.root)

        actionBar= supportActionBar!!
        actionBar.title ="Account"

        firebaseAuth = FirebaseAuth.getInstance()
        checkUser()

        binding.logoutBtn.setOnClickListener{
            firebaseAuth.signOut()
            checkUser()
        }

        binding.eventpagebtn.setOnClickListener() {
            startActivity(Intent(this, EventsPage::class.java))
        }
    }

    private fun checkUser() {
        val firebaseUser= firebaseAuth.currentUser
        if(firebaseUser != null){
            val email= firebaseUser.email
            binding.emailTv.text=email

        }
        else{
            startActivity(Intent(this,Login::class.java))
            finish()
        }
    }
}