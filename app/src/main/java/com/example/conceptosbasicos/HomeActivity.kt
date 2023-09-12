package com.example.conceptosbasicos

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import android.widget.Toast

class HomeActivity : AppCompatActivity() {
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_home)

        val correo = intent.getStringExtra("Email").toString()

        Toast.makeText(this, correo, Toast.LENGTH_SHORT).show()

        val tvCorreo: TextView = findViewById(R.id.tvCorreo)
        //tvCorreo.text = correo.toString()
    }
}