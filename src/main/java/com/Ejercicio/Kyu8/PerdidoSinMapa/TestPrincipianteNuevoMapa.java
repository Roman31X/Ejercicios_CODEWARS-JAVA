package com.Ejercicio.Kyu8.PerdidoSinMapa;

import java.util.Arrays;

import static com.Ejercicio.Kyu8.PerdidoSinMapa.PrincipiantePerdidoSinMapa.mapa;

public class TestPrincipianteNuevoMapa {
    public static void main(String[] args) {
        System.out.println("Test de nuevo mapa para principiantes el doble de una matriz");
        int[] nuevo1  = mapa(new int[]{1,2,3});
        System.out.println("Matriz [1,2,3] : doble es : "+ Arrays.toString(nuevo1));
        int[] nuevo2  = mapa(new int[]{4, 1, 1, 1, 4});
        System.out.println("Matriz [4, 1, 1, 1, 4] : doble es : "+ Arrays.toString(nuevo2));
        int[] nuevo3  = mapa(new int[]{1, 1, 1, 1, 1, 1});
        System.out.println("Matriz [1, 1, 1, 1, 1, 1] : doble es : "+ Arrays.toString(nuevo3));
    }
}
