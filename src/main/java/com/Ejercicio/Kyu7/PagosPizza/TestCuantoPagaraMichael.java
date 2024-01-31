package com.Ejercicio.Kyu7.PagosPizza;

import static com.Ejercicio.Kyu7.PagosPizza.CalcularCuantoPagaMichael.michaelPaga;

public class TestCuantoPagaraMichael {
    public static void main(String[] args) {
        System.out.println("Test para calcular cuanto pagara Michael por la pizza");
        System.out.println("Pizza precio [15] : "+michaelPaga(15));
        System.out.println("Pizza precio [4] : "+michaelPaga(4));
        System.out.println("Pizza precio [30] : "+michaelPaga(30));
        System.out.println("Pizza precio [80] : "+michaelPaga(80));
        System.out.println("Pizza precio [22] : "+michaelPaga(22));
        System.out.println("Pizza precio [5.9181] : "+michaelPaga(5.9181));
        System.out.println("Pizza precio [28.789] : "+michaelPaga(28.789));
        System.out.println("Pizza precio [4.325] : "+michaelPaga(4.325));
    }
}
