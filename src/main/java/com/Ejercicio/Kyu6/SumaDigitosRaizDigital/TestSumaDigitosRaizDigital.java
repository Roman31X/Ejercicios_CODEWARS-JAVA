package com.Ejercicio.Kyu6.SumaDigitosRaizDigital;

import static com.Ejercicio.Kyu6.SumaDigitosRaizDigital.SumaDigitalRaizDigital.digital_root;

public class TestSumaDigitosRaizDigital {
    public static void main(String[] args) {
        System.out.println("Test de suma de los digitos de un número");
        System.out.println("Número [16] : "+digital_root(16));
        System.out.println("Número [100] : "+digital_root(100));
        System.out.println("Número [-458] : "+digital_root(-458));
        System.out.println("Número [905438] : "+digital_root(905438));

    }
}
