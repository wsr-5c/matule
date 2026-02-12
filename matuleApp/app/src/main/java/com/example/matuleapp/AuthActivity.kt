package com.example.matuleapp

import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.ImageButton
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity

class AuthActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.auth_activity)
        findViewById<Button>(R.id.button).setOnClickListener {
            val email = findViewById<EditText>(R.id.email).text.toString()
            val passw = findViewById<EditText>(R.id.Password).text.toString()
            if (email.isEmpty()&&passw.isEmpty()){
                Toast.makeText(this, "Заполните все поля", Toast.LENGTH_LONG).show()
            }
    }
}}
