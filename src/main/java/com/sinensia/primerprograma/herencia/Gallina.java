package com.sinensia.primerprograma.herencia;

import com.sinensia.primerprograma.abstraccion.Animal;
import com.sinensia.primerprograma.clases.Alimento;
import com.sinensia.primerprograma.clases.Producto;
import com.sinensia.primerprograma.enumerado.Tipo;
import com.sinensia.primerprograma.interfaces.GallinaInterfaz;

public class Gallina extends Animal implements GallinaInterfaz {

    public Gallina(int id, Tipo tipo, String nombre, int dia_insercion, double peso, Alimento idAlimento, Producto producto) {
        super(id, tipo, nombre, dia_insercion, idAlimento, producto);
    }

    @Override
    public void hacerRuido() {
        System.out.println("La gallina no canta, esta dormida");
    }

    @Override
    public void ponerHuevos() {
        System.out.println("Gallina " + getNombre()+ " esta poniendo hueos");
    }
}