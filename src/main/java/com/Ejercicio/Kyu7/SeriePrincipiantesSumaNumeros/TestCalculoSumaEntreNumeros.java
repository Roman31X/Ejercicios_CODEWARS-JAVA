package com.Ejercicio.Kyu7.SeriePrincipiantesSumaNumeros;

public class TestCalculoSumaEntreNumeros {
    public static void main(String[] args) {
        System.out.println("Test para calcular la suma entre dos números enteros");
        CalcularSumaEntreNumeros numero = new CalcularSumaEntreNumeros();
        System.out.println("Números [1,0] : "+numero.respuestaSuma(1,0));
        System.out.println("Números [0,-1] : "+numero.respuestaSuma(0,-1));
        System.out.println("Números [0,1] : "+numero.respuestaSuma(0,1));

    }
}
