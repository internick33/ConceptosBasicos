package com.example.conceptosbasicos

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.TextView
import android.widget.Toast

class ClickEventActivity : AppCompatActivity(), View.OnClickListener {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_click_event)

        val btn1: Button = findViewById(R.id.button_1)

        btn1.setOnClickListener{ view ->
            Toast.makeText(this, "Click en el boton 1", Toast.LENGTH_LONG).show()
        }

        val tv2: TextView = findViewById(R.id.myTextView)

        tv2.setOnClickListener(this)
    }

    override fun onClick(v: View?) {
        Toast.makeText(this, "Click en el Textview", Toast.LENGTH_LONG).show()
    }
}