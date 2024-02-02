package com.Ejercicio.Kyu8.LosOpuestosAtraen;

import static com.Ejercicio.Kyu8.LosOpuestosAtraen.VerificarSiAtraen.esAmor;

public class TestParaSaberSiEsAmor {
    public static void main(String[] args) {
        System.out.println("Test para saber si Tommy y Sarah están enamorados");
        System.out.println("flor1 [1] flor2 [4] : "+esAmor(1,4));
        System.out.println("flor1 [2] flor2 [2] : "+esAmor(2,2));
        System.out.println("flor1 [1] flor2 [1] : "+esAmor(1,1));
        System.out.println("flor1 [0] flor2 [1] : "+esAmor(0,1));
    }
}
