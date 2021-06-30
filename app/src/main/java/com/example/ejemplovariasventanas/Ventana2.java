package com.example.ejemplovariasventanas;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;

public class Ventana2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ventana2);  //asocia el contentView a esa actividad

    }

    public void cerrarVentana(View view) {
        finish();
    }

}