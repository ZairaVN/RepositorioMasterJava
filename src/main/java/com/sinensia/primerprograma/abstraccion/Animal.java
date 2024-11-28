package com.sinensia.primerprograma.abstraccion;

import com.sinensia.primerprograma.clases.Alimento;
import com.sinensia.primerprograma.clases.Producto;
import com.sinensia.primerprograma.enumerado.Tipo;
import lombok.*;

/**
 * The type Animal.
 */
@Setter
@Getter
@ToString
@Builder
public abstract class Animal {
    private int id;
    private Tipo tipo;
    private String nombre;
    private int dia_insercion;
    private double peso;
    private Alimento alimento;
    private Producto producto;
    private boolean isAlimentado;

    /**
     * Instantiates a new Animal.
     *
     * @param id       the id
     * @param tipo     the tipo
     * @param nombre   the nombre
     * @param alimento the alimento
     * @param producto the producto
     */
    public Animal(int id, Tipo tipo, String nombre, Alimento alimento, Producto producto){
        this.id = id;
        this.tipo = tipo;
        this.nombre = nombre;
        this.dia_insercion = 0;
        this.alimento = alimento;
        this.producto = producto;
        this.isAlimentado = false;
    }

    /**
     * Hacer ruido, metodo abstracto
     */
    public abstract void hacerRuido();


    public void alimentar(){
        System.out.println("El animal ha sido alimentado, ha comido 1 unidad de " + getAlimento().getNombreAlimento());
    }
}
