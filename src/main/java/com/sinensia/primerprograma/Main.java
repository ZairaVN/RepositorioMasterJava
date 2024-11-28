package com.sinensia.primerprograma;

import com.sinensia.primerprograma.clases.Alimento;
import com.sinensia.primerprograma.clases.Producir;
import com.sinensia.primerprograma.clases.Producto;
import com.sinensia.primerprograma.herencia.Cerdo;
import com.sinensia.primerprograma.herencia.Gallina;


public class Main {
    public static void main(String[] args) {
        //crear Alimentos
        Alimento maiz = new Alimento(1, "Maiz", 0.5, 50);
        Alimento trigo = new Alimento(2, "Trigo", 0.6, 50);
        Alimento pasto = new Alimento(3, "Pasto", 0.4, 50);

        //crear Productos
        Producto huevo = new Producto(1, "huevo", 1.2, 0);
        Producto trufas = new Producto(2, "Trufas", 120, 0);
        Producto leche = new Producto(3, "Leche", 2.8, 0);
        Producto lana = new Producto(4, "Lana", 50, 0);

        //crear Animales
//        Animal animal = new Gallina(1,)





    }
}
