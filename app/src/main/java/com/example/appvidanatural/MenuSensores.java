package com.example.appvidanatural;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MenuSensores extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu_sensores);
    }
    public  void prox (View view){
        Intent intent= new Intent(MenuSensores.this, Sensores.class);
        startActivity(intent);

    }
    public  void giros (View view){
        Intent intent= new Intent(MenuSensores.this, Giroscopio.class);
        startActivity(intent);

    }
}
