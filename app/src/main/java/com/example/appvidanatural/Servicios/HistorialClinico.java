package com.example.appvidanatural.Servicios;

public class HistorialClinico {

    private int pkHistorialclinico;
    private String fecha_modificacion;
    private  Object fkConsulta;
    private Object fkEnfermedad;
    private  String naturalezaycomportamiento;

    public HistorialClinico(){


    }
    public void Historialclinico(int pkHistorialclinico, String fecha_modificacion, Object fkConsulta, Object fkEnfermedad, String naturalezaycomportamiento){
        this.pkHistorialclinico = pkHistorialclinico;
        this.fecha_modificacion = fecha_modificacion;
        this.fkConsulta = fkConsulta;
        this.fkEnfermedad = fkEnfermedad;
        this.naturalezaycomportamiento = naturalezaycomportamiento;
    }

    public int getPkHistorialclinico() {
        return pkHistorialclinico;
    }

    public void setPkHistorialclinico(int pkHistorialclinico) {
        this.pkHistorialclinico = pkHistorialclinico;
    }

    public String getFecha_modificacion() {
        return fecha_modificacion;
    }

    public void setFecha_modificacion(String fecha_modificacion) {
        this.fecha_modificacion = fecha_modificacion;
    }

    public Object getFkConsulta() {
        return fkConsulta;
    }

    public void setFkConsulta(Object fkConsulta) {
        this.fkConsulta = fkConsulta;
    }

    public Object getFkEnfermedad() {
        return fkEnfermedad;
    }

    public void setFkEnfermedad(Object fkEnfermedad) {
        this.fkEnfermedad = fkEnfermedad;
    }

    public String getNaturalezaycomportamiento() {
        return naturalezaycomportamiento;
    }

    public void setNaturalezaycomportamiento(String naturalezaycomportamiento) {
        this.naturalezaycomportamiento = naturalezaycomportamiento;
    }
}
