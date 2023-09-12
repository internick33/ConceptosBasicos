package com.example.conceptosbasicos

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.RadioButton
import android.widget.Toast

class RadioActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_radio)
    }

    fun sexoSeleccionado(view: View) {
        val radioButtonSeleccionado = view as RadioButton

        when(view.id){
            R.id.radioButtonMujer -> {
                Toast.makeText(this, "Se ha seleccionado mujer", Toast.LENGTH_LONG).show()
            }
            R.id.radioButtonHombre -> {
                Toast.makeText(this, "Se ha seleccionado Hombre", Toast.LENGTH_LONG).show()
            }
            R.id.radioButtonIndefinido -> {
                Toast.makeText(this, "Se ha seleccionado Indefinido", Toast.LENGTH_LONG).show()
            }
        }
    }
}