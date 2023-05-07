package com.javaeat;

import java.util.ArrayList;

public class Comida {

    private String titulo_C;
    private ArrayList<String> ingredientes_C;
    private double precio_C;
    private String foto_C;

    public Comida(String titulo_C, ArrayList<String> ingredientes_C, double precio_C, String foto_C) {
        this.titulo_C = titulo_C;
        this.ingredientes_C = ingredientes_C;
        this.precio_C = precio_C;
        this.foto_C = foto_C;
    }

    public String getTitulo_C() {
        return titulo_C;
    }

    public ArrayList<String> getIngredientes_C() {
        return ingredientes_C;
    }

    public double getPrecio_C() {
        return precio_C;
    }

    public String getFoto_C() {
        return foto_C;
    }

    @Override
    public String toString() {
        return "Comida{" + "Titulo:" + titulo_C + "/ Ingredientes:" + ingredientes_C + "/ Precio de venta:" + precio_C + "/ Foto:" + foto_C + '}';
    }

}
