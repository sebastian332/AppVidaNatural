package com.example.appvidanatural;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;

import com.example.appvidanatural.Servicios.HistorialClinico;
import com.example.appvidanatural.Servicios.Persona;
import com.example.appvidanatural.Servicios.Post_Historial;
import com.example.appvidanatural.Servicios.Post_Persona;

import java.util.ArrayList;
import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class Info_Historial extends AppCompatActivity {



    TextView NombrePaciente;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_info__historial);
        getSupportActionBar().hide();

       // NombrePaciente.findViewById(R.id.NombrePaciente);

     //   String nombres = MainActivity.usuarioSession.getFkPersona().getNombres();

     //   NombrePaciente.setText(nombres);



    }

    public void onHome(View view){
        Intent intent = new Intent(Info_Historial.this, HistorialclinicoPacientes.class);
        startActivity(intent);
    }

}

