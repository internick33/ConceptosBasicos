package com.example.conceptosbasicos

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        Log.i("LOG-CICLO", "Entramos en el metodo onCreate")
    }

    override fun onStart() {
        super.onStart()
        Log.i("LOG-CICLO", "Entramos en el metodo onStart")
    }

    override fun onResume() {
        super.onResume()
        Log.i("LOG-CICLO", "Entramos en el metodo onResume")
    }

    override fun onPause() {
        super.onPause()
        Log.i("LOG-CICLO", "Entramos en el metodo onPause")
    }

    override fun onStop() {
        super.onStop()
        Log.i("LOG-CICLO", "Entramos en el metodo onStop")
    }

    override fun onDestroy() {
        super.onDestroy()
        Log.i("LOG-CICLO", "Entramos en el metodo onDestroy")
    }
}