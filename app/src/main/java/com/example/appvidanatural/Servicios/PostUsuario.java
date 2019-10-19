package com.example.appvidanatural.Servicios;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Path;

public interface PostUsuario {

    String API_ROUTE_USUARIOS = "webresources/vidanatural.jpa.entidades.usuario/android/{nombreusuario}/{contrasena}";

    @GET(API_ROUTE_USUARIOS)
    Call<List<Usuario>> getUsuarios(@Path("nombreusuario") String groupId, @Path("contrasena") String groupPass);


}
