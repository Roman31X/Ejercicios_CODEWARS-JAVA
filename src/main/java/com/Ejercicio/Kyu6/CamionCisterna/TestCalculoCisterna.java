package com.Ejercicio.Kyu6.CamionCisterna;

import static com.Ejercicio.Kyu6.CamionCisterna.CalcularCamionCisterna.TanqueVol;

public class TestCalculoCisterna {
    public static void main(String[] args) {
        System.out.println("Calcula el contenido del cilindro de la cisterna");
        System.out.println("DATOS [5,7,3848] : "+TanqueVol(5,7,3848));
        System.out.println("DATOS [2,7,3848] : "+TanqueVol(2,7,3848));
    }
}
