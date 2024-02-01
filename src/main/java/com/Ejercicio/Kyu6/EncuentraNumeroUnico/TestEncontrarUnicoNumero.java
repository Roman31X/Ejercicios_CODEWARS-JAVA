package com.Ejercicio.Kyu6.EncuentraNumeroUnico;

import static com.Ejercicio.Kyu6.EncuentraNumeroUnico.EncontrarNumeroUnicoMatriz.unicoNumero;

public class TestEncontrarUnicoNumero {
    public static void main(String[] args) {
        System.out.println("Test para encontrar  al único numero dentro de una Matriz");
        System.out.println("Matriz [0,1,0] : "+unicoNumero(new double[] {0,1,0}));
        System.out.println("Matriz [1,1,1,2,1,1] : "+unicoNumero(new double[] {1,1,1,2,1,1}));
    }
}
