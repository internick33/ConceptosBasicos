package com.example.conceptosbasicos

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.CheckBox
import android.widget.Toast

class CheckboxActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_checkbox)
    }

    fun clickOnHobby(view: View) {

        val checkBox: CheckBox = view as CheckBox
        val checked: Boolean = checkBox.isChecked

        when(view.id){
            R.id.checkBoxDeporte -> {
                if(checked){
                    Toast.makeText(this, "Se ha marcado deporte", Toast.LENGTH_LONG).show()
                } else {
                    Toast.makeText(this, "Se ha desmarcado deporte", Toast.LENGTH_LONG).show()
                }

            }
            R.id.checkBoxVideoGames -> {
                if(checked){
                    Toast.makeText(this, "Se ha marcado videojuegos", Toast.LENGTH_LONG).show()
                } else {
                    Toast.makeText(this, "Se ha desmarcado videojuegos", Toast.LENGTH_LONG).show()
                }
            }
        }
    }
}