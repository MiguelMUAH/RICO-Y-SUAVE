package com.javaeat;

public class ClienteParticular extends Cliente{

    private String DNI_CP;

    public ClienteParticular(String DNI_CP, String nombre, String correo_electronico, String clave, Direccion direccion, TarjetaCredito tarjeta_credito, int telefono) {
        super(nombre, correo_electronico, clave, direccion, tarjeta_credito, telefono);
        this.DNI_CP = DNI_CP;
    }
    

    

    public String getDNI_CP() {
        return DNI_CP;
    }

    @Override
    public String toString() {
        return super.toString() + "\n# ClienteParticular{" + "DNI=" + DNI_CP + '}';
    }


    

}
