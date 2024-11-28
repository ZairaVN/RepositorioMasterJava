package com.sinensia.primerprograma.clases;

import com.sun.nio.sctp.AbstractNotificationHandler;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;


@Getter
@Setter
@ToString
public  class Alimento {
    private int idAlimento;
    private String nombreAlimento;
    private double precioAlimento;
    private int cantidadDisponibleAlimento;

    public Alimento(int idAlimento, String nombreAlimento, double precioAlimento, int cantidadDisponibleAlimento){
        this.idAlimento = idAlimento;
        this.nombreAlimento = nombreAlimento;
        this.precioAlimento =precioAlimento;
        this.cantidadDisponibleAlimento = cantidadDisponibleAlimento;
    }
}
