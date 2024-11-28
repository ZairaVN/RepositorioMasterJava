package com.sinensia.primerprograma.herencia;

import com.sinensia.primerprograma.abstraccion.Animal;
import com.sinensia.primerprograma.clases.Alimento;
import com.sinensia.primerprograma.clases.Producto;
import com.sinensia.primerprograma.enumerado.Tipo;
import com.sinensia.primerprograma.interfaces.LecheInterfaz;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.time.LocalDate;
@Getter
@Setter
@ToString
public class Oveja extends Animal implements LecheInterfaz {
    private LocalDate fechaEsquilado;

    public Oveja(int id, Tipo tipo, String nombre, int dia_insercion, double peso, Alimento idAlimento, Producto producto) {
        super(id, tipo, nombre, dia_insercion, idAlimento, producto);
        this.fechaEsquilado = LocalDate.now().minusMonths(1);
    }

    @Override
    public void hacerRuido() {
        System.out.println("La obeja hace: 'beeee'");
    }

    @Override
    public void darLeche() {
        System.out.println("Oveja "+ getNombre()+ " esta siendo ordeñada");
    }
}
