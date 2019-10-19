package com.example.appvidanatural;

import androidx.appcompat.app.AppCompatActivity;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.example.appvidanatural.Servicios.PostUsuario;
import com.example.appvidanatural.Servicios.Usuario;

import java.util.List;

public class MainActivity extends AppCompatActivity {


    Button btnIngresar,btnRegistrar;
    EditText nombreusuario, contrasena;
    String nombreU,contra;

    public static Usuario usuarioSession;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        inicializar();

        getSupportActionBar().hide();
    }

    public void inicializar(){
        nombreusuario = findViewById(R.id.edtNombreUsuario);
        contrasena = findViewById(R.id.EditCotraseña);
        btnIngresar = findViewById(R.id.BtnIngresar);

          nombreU = nombreusuario.getText().toString();
          contra = contrasena.getText().toString();

          btnIngresar.setOnClickListener(new View.OnClickListener() {
              @Override
              public void onClick(View v) {
                  getUsuarios(nombreusuario.getText().toString(), contrasena.getText().toString());
              }
          });

    }

    private void getUsuarios(String nombreUsuario, String contrasena){
        Retrofit retrofit = new Retrofit.Builder()
                .baseUrl("http://10.75.196.79:8083/vidanatural-1.0.0/")
                .addConverterFactory(GsonConverterFactory.create()).build();

        PostUsuario postUsuario = retrofit.create(PostUsuario.class);

            Call<List<Usuario>> call = postUsuario.getUsuarios(nombreUsuario,contrasena);

        call.enqueue(new Callback<List<Usuario>>() {
            @Override
            public void onResponse(Call<List<Usuario>> call, Response<List<Usuario>> response) {
                for (Usuario usert : response.body()){
                    if (usert != null){
                    usuarioSession = usert;
                    Toast.makeText(MainActivity.this, "Bienvenido"+usert.getNombreusuario(), Toast.LENGTH_SHORT).show();

                  paginaSiguiente();
                    }else {
                        Toast.makeText(MainActivity.this, "Usuario Invalido", Toast.LENGTH_SHORT).show();
                    }
                }

            }

            @Override
            public void onFailure(Call<List<Usuario>> call, Throwable t) {
                Toast.makeText(MainActivity.this, "Credenciales incorrectas", Toast.LENGTH_SHORT).show();
            }
        });


    }

 public void paginaSiguiente(){
     Intent intent = new Intent(MainActivity.this, HistorialclinicoPacientes.class);
     startActivity(intent);

 }

}
