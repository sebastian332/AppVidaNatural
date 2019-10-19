package com.example.appvidanatural;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Person;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import com.example.appvidanatural.Servicios.Persona;
import com.example.appvidanatural.Servicios.Post_Persona;

import java.util.ArrayList;
import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class VistaPersona extends AppCompatActivity {

    ListView list;
    ArrayList<String> titles = new ArrayList<>();
    ArrayAdapter arrayAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_vista_persona);

        list.setAdapter(arrayAdapter);
        getPostPersona();
    }

    public void getPostPersona(){
        Retrofit retrofit = new Retrofit.Builder()
                .baseUrl("http://10.75.196.79:8083/vidanatural-1.0.0")
                .addConverterFactory(GsonConverterFactory.create())
                .build();
        Post_Persona post_persona = retrofit.create(Post_Persona.class);
        Call<List<Persona>> call = post_persona.getPostPersona();

                call.enqueue(new Callback<List<Persona>>() {
            @Override
            public void onResponse(Call<List<Persona>> call, Response<List<Persona>> response) {
                for(Persona persona : response.body()) {
                    titles.add(persona.getNombres());
                }
                arrayAdapter.notifyDataSetChanged();
            }

            @Override
            public void onFailure(Call<List<Persona>> call, Throwable t) {

            }
        });
    }
}
