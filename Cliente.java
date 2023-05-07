package com.javaeat;

public class Cliente {
    
    private String nombre;
    private String correo_electronico;
    private String clave;
    private Direccion direccion;
    private TarjetaCredito tarjeta_credito;
    private int telefono;

    public Cliente(String nombre, String correo_electronico, String clave, Direccion direccion, TarjetaCredito tarjeta_credito, int telefono) {
        this.nombre = nombre;
        this.correo_electronico = correo_electronico;
        this.clave = clave;
        this.direccion = direccion;
        this.tarjeta_credito = tarjeta_credito;
        this.telefono = telefono;
    }

    public String getNombre() {
        return nombre;
    }

    public String getCorreo_electronico() {
        return correo_electronico;
    }

    public String getClave() {
        return clave;
    }

    public Direccion getDireccion() {
        return direccion;
    }

    public TarjetaCredito getTarjeta_credito() {
        return tarjeta_credito;
    }

    public int getTelefono() {
        return telefono;
    }

    public void setClave(String clave) {
        this.clave = clave;
    }

    public void setDireccion(Direccion direccion) {
        this.direccion = direccion;
    }

    public void setTarjeta_credito(TarjetaCredito tarjeta_credito) {
        this.tarjeta_credito = tarjeta_credito;
    }

    @Override
    public String toString() {
        return "Cliente{" + "Nombre:" + nombre + "/ Correo electronico:" + correo_electronico + "/ Clave:" + clave + "/ Direccion:" + direccion + "/ Tarjeta credito:" + tarjeta_credito + "/ Telefono:" + telefono + '}';
    }
    
    
}
