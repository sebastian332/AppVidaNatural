package com.example.appvidanatural.Servicios;

public class Usuario {

    private int pkUsuario;
    private String nombreusuario;
    private String contrasena;
    private int tipousuarioenum;
    private Persona fkPersona;


    public Usuario() {

    }
    public Usuario(int pkUsuario, String contrasena, String nombreusuario, int tipousuarioenum, Persona fkPersona){
        this.pkUsuario = pkUsuario;
        this.contrasena = contrasena;
        this.tipousuarioenum = tipousuarioenum;
        this.fkPersona = fkPersona;
        this.nombreusuario = nombreusuario;

    }

    public int getPkUsuario() {
        return pkUsuario;
    }

    public void setPkUsuario(int pkUsuario) {
        this.pkUsuario = pkUsuario;
    }

    public String getContrasena() {
        return contrasena;
    }

    public void setContrasena(String contrasena) {
        this.contrasena = contrasena;
    }

    public int getTipousuarioenum() {
        return tipousuarioenum;
    }

    public void setTipousuarioenum(int tipousuarioenum) {
        this.tipousuarioenum = tipousuarioenum;
    }

    public Persona getFkPersona() {
        return fkPersona;
    }

    public void setFkPersona(Persona fkPersona) {
        this.fkPersona = fkPersona;
    }

    public String getNombreusuario() {
        return nombreusuario;
    }

    public void setNombreusuario(String nombreusuario) {
        this.nombreusuario = nombreusuario;
    }
}
