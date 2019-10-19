package com.example.appvidanatural.Servicios;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;

public interface Post_Historial {
    String API_ROUTE = "webresources/vidanatural.jpa.entidades.historialclinico";

    @GET(API_ROUTE)
    Call<List<HistorialClinico>> getPost();
}
