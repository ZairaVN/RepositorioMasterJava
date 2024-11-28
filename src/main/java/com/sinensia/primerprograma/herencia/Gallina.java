package com.sinensia.primerprograma.herencia;

import com.sinensia.primerprograma.abstraccion.Animal;
import com.sinensia.primerprograma.clases.Alimento;
import com.sinensia.primerprograma.clases.Producto;
import com.sinensia.primerprograma.enumerado.Tipo;
import com.sinensia.primerprograma.interfaces.GallinaInterfaz;

public class Gallina extends Animal implements GallinaInterfaz {

    public Gallina(int id, Tipo tipo, String nombre, Alimento alimento, Producto producto) {
        super(id, tipo, nombre,  alimento, producto);
    }

    @Override
    public void hacerRuido() {
        System.out.println("La gallina no canta, esta dormida");
    }

    @Override
    public void ponerHuevos(int numHuevos) {
        System.out.println("Gallina " + getNombre()+ " ha puesto " + numHuevos+ " huevos.");
    }
}
