package com.example.appvidanatural;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;


public class HistorialclinicoPacientes extends AppCompatActivity {

    TextView viewNombre, viewIdentificacion, viewDireccion, viewCorreo;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_historialclinico);
        getSupportActionBar().hide();

        viewNombre = findViewById(R.id.viewNombre);
        viewIdentificacion = findViewById(R.id.viewIdentificacion);
        viewDireccion = findViewById(R.id.viewDireccion);
        viewCorreo = findViewById(R.id.viewCorreo);

        String ident = MainActivity.usuarioSession.getFkPersona().getIdentificacion();
        String nombre = MainActivity.usuarioSession.getNombreusuario();
        String direccion = MainActivity.usuarioSession.getFkPersona().getDireccion();
        String correo = MainActivity.usuarioSession.getFkPersona().getCorreo();

        viewNombre.setText(nombre);
        viewIdentificacion.setText(ident);
        viewDireccion.setText(direccion);
        viewCorreo.setText(correo);


    }

    public void onHome(View view){
        Intent intent = new Intent(HistorialclinicoPacientes.this, SplashScreen.class);
        startActivity(intent);
    }

    public void Hitorialclinico(View view){
        Intent intent = new Intent(HistorialclinicoPacientes.this, Info_Historial.class);
        startActivity(intent);

    }

}
