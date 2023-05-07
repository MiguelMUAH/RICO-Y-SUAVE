package com.javaeat;

public class Empresa extends Cliente{

    private String CIF_E;
    private String web_E;

    public Empresa(String CIF_E, String web_E, String nombre, String correo_electronico, String clave, Direccion direccion, TarjetaCredito tarjeta_credito, int telefono) {
        super(nombre, correo_electronico, clave, direccion, tarjeta_credito, telefono);
        this.CIF_E = CIF_E;
        this.web_E = web_E;
    }

    public String getCIF_E() {
        return CIF_E;
    }

    public String getWeb_E() {
        return web_E;
    }

    @Override
    public String toString() {
        return super.toString() + "\n# Empresa{" + "CIF_E=" + CIF_E + ", web_E=" + web_E + '}';
    }

    

}
