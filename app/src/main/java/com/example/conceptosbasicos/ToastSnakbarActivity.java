package com.example.conceptosbasicos;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import com.google.android.material.snackbar.Snackbar;

public class ToastSnakbarActivity extends AppCompatActivity implements View.OnClickListener {

    Button btnToast, btnSnackbar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_toast_snakbar);

        btnToast = findViewById(R.id.buttonToast);
        btnSnackbar =  findViewById(R.id.buttonSnackbar);

        //Evento click
        btnToast.setOnClickListener(this);
        btnSnackbar.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        if(view.getId() == R.id.buttonToast){
            Toast.makeText(this, "Soy un toast", Toast.LENGTH_SHORT).show();
        } else if(view.getId() == R.id.buttonSnackbar){
            Snackbar.make(view, "Snackbar", Snackbar.LENGTH_LONG).show();
        }
    }
}