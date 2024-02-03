package com.Ejercicio.Kyu8.CuentaOvejas;

import static com.Ejercicio.Kyu8.CuentaOvejas.ContadorOvejas.contadorOvejas;

public class TestContadorOvejas {
    public static void main(String[] args) {
        System.out.println("Test para contar ovejas si no puedes dormir");
        System.out.println("Contar [0] : "+contadorOvejas(0));
        System.out.println("Contar [1] : "+contadorOvejas(1));
        System.out.println("Contar [2] : "+contadorOvejas(2));
        System.out.println("Contar [5] : "+contadorOvejas(5));

    }
}
