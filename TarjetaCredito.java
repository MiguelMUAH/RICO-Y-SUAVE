package com.javaeat;

import java.time.LocalDate;

public class TarjetaCredito {

    private String nombre_titular;
    private int numero;
    private LocalDate fecha_caducidad;

    public TarjetaCredito(String nombre_titular, int numero, LocalDate fecha_caducidad) {
        this.nombre_titular = nombre_titular;
        this.numero = numero;
        this.fecha_caducidad = fecha_caducidad;
    }

    public String getNombre_titular() {
        return nombre_titular;
    }

    public int getNumero() {
        return numero;
    }

    public LocalDate getFecha_caducidad() {
        return fecha_caducidad;
    }

    @Override
    public String toString() {
        return "Tarjeta de Credito{" + "Nombre del titular:" + nombre_titular + "/ Numero:" + numero + "/ Fecha de caducidad:" + fecha_caducidad + '}';
    }

}
