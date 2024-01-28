package com.Ejercicio.Kyu7.PalabraInversa;

import static com.Ejercicio.Kyu7.PalabraInversa.InvertirPalabra.reversoPalabra;

public class TestInvertiPalabra {
    public static void main(String[] args) {
        System.out.println("Test de inversion de palabra");
        System.out.println("\"!Los perros ladran¡\" : "+reversoPalabra("!Los perros ladran¡"));
        System.out.println("\"[dios.] lazy the over jumps...\" : "+reversoPalabra("[dios.] lazy the over jumps..."));

    }
}
