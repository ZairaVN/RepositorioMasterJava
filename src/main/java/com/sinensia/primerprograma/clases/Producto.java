package com.sinensia.primerprograma.clases;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
public class Producto {
    private int idProducto;
    private String nombreProducto;
    private double precioProducto;
    private int cantidadDisponibleProducto;

    public Producto (int idProducto, String nombreProducto, double precioProducto, int cantidadDisponibleProducto){
        this.idProducto = idProducto;
        this.nombreProducto = nombreProducto;
        this.precioProducto = precioProducto;
        this.cantidadDisponibleProducto = cantidadDisponibleProducto;
    }

}
