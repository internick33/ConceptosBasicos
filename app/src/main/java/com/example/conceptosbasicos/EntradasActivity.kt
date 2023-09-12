package com.example.conceptosbasicos

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.EditText

class EntradasActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_entradas)
    }

    fun login(view: View) {
        val editTextEmail = findViewById<EditText>(R.id.editTextEmailAddress)
        val editTextPassword = findViewById<EditText>(R.id.editTextPassword)
        val intentLogin = Intent(this, HomeActivity::class.java).apply {
            putExtra("Email", editTextEmail.toString())
        }
        startActivity(intentLogin)
    }
}