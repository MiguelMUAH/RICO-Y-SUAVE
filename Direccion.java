package com.javaeat;

public class Direccion {

    private String calle;
    private int numero;
    private int numero_postal;
    private String ciudad;

    public Direccion(String calle, int numero, int numero_postal, String ciudad) {
        this.calle = calle;
        this.numero = numero;
        this.numero_postal = numero_postal;
        this.ciudad = ciudad;
    }

    public String getCalle() {
        return calle;
    }

    public int getNumero() {
        return numero;
    }

    public int getNumero_postal() {
        return numero_postal;
    }

    public String getCiudad() {
        return ciudad;
    }

    @Override
    public String toString() {
        return "Direccion{" + "Calle:" + calle + "/ Numero:" + numero + "/ Número postal:" + numero_postal + "/ Ciudad:" + ciudad + '}';
    }

}
