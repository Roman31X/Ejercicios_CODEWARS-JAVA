package com.Ejercicio.Kyu8.EsParejo;

import static com.Ejercicio.Kyu8.EsParejo.VerificarParejo.Verificar;

public class TestVerificarParejo {
    public static void main(String[] args) {
        System.out.println("Test de Verificación Parejo");
        System.out.println("Número [0] : "+Verificar(0));
        System.out.println("Número [0.5] : "+Verificar(0.5));
        System.out.println("Número [1] : "+Verificar(1));
        System.out.println("Número [2] : "+Verificar(2));
        System.out.println("Número [-4] : "+Verificar(-4));
    }
}
