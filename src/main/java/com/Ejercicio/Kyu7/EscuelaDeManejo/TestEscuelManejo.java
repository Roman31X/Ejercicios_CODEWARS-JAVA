package com.Ejercicio.Kyu7.EscuelaDeManejo;

import static com.Ejercicio.Kyu7.EscuelaDeManejo.CalcularCostoEscuelaManejo.costo;

public class TestEscuelManejo {
    public static void main(String[] args) {
        System.out.println("Test para calcular costo de la escuela de manejo por tiempo");
        System.out.println("Tiempos [1] : costo es "+costo(1));
        System.out.println("Tiempos [45] : costo es "+costo(45));
        System.out.println("Tiempos [102] : costo es "+costo(102));
        System.out.println("Tiempos [63] : costo es "+costo(63));
        System.out.println("Tiempos [84] : costo es "+costo(84));
        System.out.println("Tiempos [102] : costo es "+costo(102));
        System.out.println("Tiempos [273] : costo es "+costo(273));
        System.out.println("Tiempos [628836] : costo es "+costo(628836));

    }
}
