package com.sinensia.primerprograma.herencia;

import com.sinensia.primerprograma.abstraccion.Animal;
import com.sinensia.primerprograma.clases.Alimento;
import com.sinensia.primerprograma.clases.Producto;
import com.sinensia.primerprograma.enumerado.Estacion;
import com.sinensia.primerprograma.enumerado.Tipo;
import lombok.Builder;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
@Builder
public class Cerdo extends Animal {

    private Estacion estacion;

    public Cerdo(int id, Tipo tipo, String nombre, Alimento idAlimento, Producto producto, Estacion estacion) {
        super(id, tipo, nombre, idAlimento, producto);
        this.estacion = estacion;
    }

    @Override
    public void hacerRuido() {
        System.out.println("El cerdo hace: 'oing oing'");
    }
}
