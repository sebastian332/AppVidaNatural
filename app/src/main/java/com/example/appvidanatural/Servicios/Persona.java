package com.example.appvidanatural.Servicios;

import java.util.Date;

public class Persona {
    private int pkPersona;
    private String identificacion;
    private String nombres;
    private  String apellidos;
    private Long fechanacimiento;
    private String direccion;
    private String correo;
    private Object fkEstadocivil;
    private Object fkGenero;
    private Object fkMunicipioorigen;
    private Object fkTipoidentificacion;

    public Persona(){

    }

    public Persona(int pkPersona, String identificacion, String nombres, String apellidos, Long fechanacimiento, String correo, Object fkEstadocivil,
    Object fkGenero, Object fkMunicipioorigen, Object fkTipoidentificacion, String direccion){

        this.pkPersona = pkPersona;
        this.identificacion = identificacion;
        this.nombres = nombres;
        this.apellidos = apellidos;
        this.fechanacimiento = fechanacimiento;
        this.correo = correo;
        this.fkEstadocivil = fkEstadocivil;
        this.fkGenero = fkGenero;
        this.fkMunicipioorigen = fkMunicipioorigen;
        this.fkTipoidentificacion = fkTipoidentificacion;
        this.direccion = direccion;
    }


    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public int getPkPersona() {
        return pkPersona;
    }

    public void setPkPersona(int pkPersona) {
        this.pkPersona = pkPersona;
    }

    public String getIdentificacion() {
        return identificacion;
    }

    public void setIdentificacion(String identificacion) {
        this.identificacion = identificacion;
    }

    public String getNombres() {
        return nombres;
    }

    public void setNombres(String nombres) {
        this.nombres = nombres;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public Long getFechanacimiento() {
        return fechanacimiento;
    }

    public void setFechanacimiento(Long fechanacimiento) {
        this.fechanacimiento = fechanacimiento;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public Object getFkEstadocivil() {
        return fkEstadocivil;
    }

    public void setFkEstadocivil(Object fkEstadocivil) {
        this.fkEstadocivil = fkEstadocivil;
    }

    public Object getFkGenero() {
        return fkGenero;
    }

    public void setFkGenero(Object fkGenero) {
        this.fkGenero = fkGenero;
    }

    public Object getFkMunicipioorigen() {
        return fkMunicipioorigen;
    }

    public void setFkMunicipioorigen(Object fkMunicipioorigen) {
        this.fkMunicipioorigen = fkMunicipioorigen;
    }

    public Object getFkTipoidentificacion() {
        return fkTipoidentificacion;
    }

    public void setFkTipoidentificacion(Object fkTipoidentificacion) {
        this.fkTipoidentificacion = fkTipoidentificacion;
    }
}
