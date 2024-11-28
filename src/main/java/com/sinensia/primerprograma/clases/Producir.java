package com.sinensia.primerprograma.clases;

import com.sinensia.primerprograma.abstraccion.Animal;
import com.sinensia.primerprograma.herencia.Cerdo;
import com.sinensia.primerprograma.herencia.Gallina;
import com.sinensia.primerprograma.herencia.Oveja;
import com.sinensia.primerprograma.herencia.Vaca;

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
        if (cerdo.isAlimentado()) {

            int numTrufas = switch (cerdo.getEstacion()) {
                case RIMAVERA, VERANO -> (int) (Math.random() * 2) + 2;
                case OTOÑO -> (int) (Math.random() * 2);
                case INVIERNO -> 0;
            };
            System.out.println("El cerdo " + cerdo.getNombre() + " ha recolectado " + numTrufas + " porque estamos en " + cerdo.getEstacion());
        }
    }

    /**
     * Metodo para producir la oveja.
     *
     * @param oveja the oveja
     */
    public void producir(Oveja oveja) {
        long diferencia = DAYS.between(oveja.getFechaEsquilado(), LocalDate.now());
        if (oveja.isAlimentado()) {
            if (diferencia >= 2) {
                System.out.println("La oveja " + oveja.getNombre() + " esta siendo esquilada. Ha dado cinco unidades de lana");
            } else {
                System.out.println("La oveja " + oveja.getNombre() + " no puede ser esquilada en este momento.");
            }
        }
    }


    /**
     * Metodo producir para la vaca. Produce un 1% de su peso
     *
     * @param vaca the vaca
     */
    public void producir(Vaca vaca) {
        if (vaca.isAlimentado()) {
            System.out.println("La vaca " + vaca.getNombre() + " ha producido " + vaca.getPeso() * 0.01 + " litros de leche");
        }
    }

    /**
     * Metodo producir para las gallinas. Produce huevos segun su tiempo en la granja
     *
     * @param gallina the gallina
     */
    public void producir(Gallina gallina){
        if(gallina.isAlimentado()){
            if(gallina.getDia_insercion()>40){
                gallina.ponerHuevos(1);
            }else if(gallina.getDia_insercion()>3){
                gallina.ponerHuevos(2);
            }else{
                System.out.println("la gallina "+ gallina.getNombre()+ " aun es demasiado joven para poner huevos");
            }
            gallina.setDia_insercion(gallina.getDia_insercion()+1); //aumentamos el dia de la gallina
        }
    }

}
