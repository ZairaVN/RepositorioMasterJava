package com.sinensia.primerprograma.abstraccion;

import com.sinensia.primerprograma.clases.Alimento;
import com.sinensia.primerprograma.clases.Producto;
import com.sinensia.primerprograma.enumerado.Tipo;
import lombok.*;

import java.util.Objects;

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
    public Animal(int id, Tipo tipo, String nombre, Alimento alimento, Producto producto) {
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


    /**
     * Alimentar.
     */
    public void alimentar() {
        System.out.println("El animal ha sido alimentado, ha comido 1 unidad de " + getAlimento().getNombreAlimento());
    }


    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Animal animal = (Animal) o;
        return id == animal.id && dia_insercion == animal.dia_insercion && Double.compare(peso, animal.peso) == 0 && isAlimentado == animal.isAlimentado && tipo == animal.tipo && Objects.equals(nombre, animal.nombre) && Objects.equals(alimento, animal.alimento) && Objects.equals(producto, animal.producto);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, tipo, nombre, dia_insercion, peso, alimento, producto, isAlimentado);
    }
}
