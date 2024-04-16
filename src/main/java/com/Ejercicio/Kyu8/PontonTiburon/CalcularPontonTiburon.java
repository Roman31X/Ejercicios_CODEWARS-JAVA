package com.Ejercicio.Kyu8.PontonTiburon;

public class CalcularPontonTiburon {
    public static String shark(int pontoonDistance, int sharkDistance, int youSpeed, int sharkSpeed, boolean dolphin) {
        double yourTime = (double) pontoonDistance / youSpeed;
        double sharkTime;

        if (dolphin) {
            sharkTime = (double) sharkDistance / (sharkSpeed / 2.0);
        } else {
            sharkTime = (double) sharkDistance / sharkSpeed;
        }

        if (yourTime < sharkTime) {
            return "Alive!";
        } else {
            return "Shark Bait!";
        }
    }
}
