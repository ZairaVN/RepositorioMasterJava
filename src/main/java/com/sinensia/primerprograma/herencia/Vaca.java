package com.sinensia.primerprograma.herencia;

import com.sinensia.primerprograma.abstraccion.Animal;
import com.sinensia.primerprograma.clases.Alimento;
import com.sinensia.primerprograma.clases.Producto;
import com.sinensia.primerprograma.enumerado.Tipo;
import com.sinensia.primerprograma.interfaces.LecheInterfaz;

public class Vaca extends Animal implements LecheInterfaz {
    public Vaca(int id, Tipo tipo, String nombre, int dia_insercion, double peso, Alimento idAlimento, Producto producto) {
        super(id, tipo, nombre, dia_insercion, idAlimento, producto);
    }

    @Override
    public void hacerRuido() {
        System.out.println("La vaca hace: 'muuuuuu'");
    }

    @Override
    public void alimentar(){
        System.out.println("El animal ha sido alimentado, ha comido 3 unidades de " + getAlimento().getNombreAlimento());
    }

    @Override
    public void darLeche() {
        System.out.println("Vaca "+ getNombre()+ " esta siendo ordeñada");
    }
}