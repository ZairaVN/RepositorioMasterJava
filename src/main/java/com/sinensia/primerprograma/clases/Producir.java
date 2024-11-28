package com.sinensia.primerprograma.clases;

import com.sinensia.primerprograma.abstraccion.Animal;
import com.sinensia.primerprograma.herencia.Cerdo;
import com.sinensia.primerprograma.herencia.Oveja;

import java.time.LocalDate;

import static java.time.temporal.ChronoUnit.DAYS;

/**
 * The type Producir.
 */
public class Producir {

    /**
     * Metodo para producir el cerdo.
     *
     * @param cerdo the cerdo
     */
    public void producir(Cerdo cerdo) {
        int numTrufas = switch (cerdo.getEstacion()) {
            case RIMAVERA, VERANO -> (int) (Math.random() * 2) + 2;
            case OTOÑO -> (int) (Math.random() * 2);
            case INVIERNO -> 0;
        };
        System.out.println("El cerdo " + cerdo.getNombre() + " ha recolectado " + numTrufas + " porque estamos en " + cerdo.getEstacion());
    }

    /**
     * Metodo para producir la oveja.
     *
     * @param oveja the oveja

    public void producir(Oveja oveja){
        long diferencia = DAYS.between(oveja.getFechaEsquilado(), LocalDate.now());
        if(diferencia>=2){

    }
    }
     */

    public String queAnimalEs(Animal animalObject) {
        String animalName = "";

        if (animalObject instanceof Cerdo) {
            Cerdo cerdo = (Cerdo) animalObject;
            producir(cerdo);
        }

        return animalName;
    }



}
