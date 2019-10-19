package com.example.appvidanatural.Servicios;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;

public interface Post_Persona {

    String API_ROUTE_PERSONA = "webresources/vidanatural.jpa.entidades.persona";

    @GET(API_ROUTE_PERSONA)
    Call<List<Persona>>  getPostPersona();
}
