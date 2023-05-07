package com.javaeat;

import java.util.ArrayList;

public class Restaurante {

    private String CIF_R;
    private String nombre_R;
    private Direccion direccion_R;
    private String especialidad_R;
    private double calificacion_R;
    private double gastos_envio_R;
    private double tiempo_envio_medio_R;
    private boolean servicio_catering_R;

    public Restaurante(String CIF_R, String nombre_R, Direccion direccion_R, String especialidad_R, double calificacion_R, double gastos_envio_R, double tiempo_envio_medio_R, boolean servicio_catering_R) {
        this.CIF_R = CIF_R;
        this.nombre_R = nombre_R;
        this.direccion_R = direccion_R;
        this.especialidad_R = especialidad_R;
        this.calificacion_R = calificacion_R;
        this.gastos_envio_R = gastos_envio_R;
        this.tiempo_envio_medio_R = tiempo_envio_medio_R;
        this.servicio_catering_R = servicio_catering_R;
    }

    public String getCIF_R() {
        return CIF_R;
    }

    public String getNombre_R() {
        return nombre_R;
    }

    public Direccion getDireccion_R() {
        return direccion_R;
    }

    public String getEspecialidad_R() {
        return especialidad_R;
    }

    public double getCalificacion_R() {
        return calificacion_R;
    }

    public double getGastos_envio_R() {
        return gastos_envio_R;
    }

    public double getTiempo_envio_medio_R() {
        return tiempo_envio_medio_R;
    }

    public boolean isServicio_catering_R() {
        return servicio_catering_R;
    }

    @Override
    public String toString() {
        return "Restaurante{" + "CIF:" + CIF_R + "/ Nombre:" + nombre_R + "/ Direccion" + direccion_R + "/ Especialidad:" + especialidad_R + "/ Calificacion:" + calificacion_R + "/ Gastos de envio:" + gastos_envio_R + "/ Tiempo de envio medio:" + tiempo_envio_medio_R + "/ Servicio de catering:" + servicio_catering_R + '}';
    }

}
