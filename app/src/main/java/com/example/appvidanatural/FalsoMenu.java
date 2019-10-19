package com.example.appvidanatural;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class FalsoMenu extends AppCompatActivity {
Button sensor, mapaqs;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_falso_menu);
        sensor=findViewById(R.id.BtnSensor);
   mapaqs=findViewById(R.id.BtnMapa);

    }
    public  void sensorr  (View view){
        Intent intent= new Intent(FalsoMenu.this,  MenuSensores.class);
        startActivity(intent);


    }
    public void mapass (View view){
        Intent intent= new Intent(FalsoMenu.this, mapas.class);
        startActivity(intent);

    }
}
