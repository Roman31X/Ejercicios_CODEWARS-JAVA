package com.Ejercicio.Kyu8.NombreEnCartelera;

public class CostoNombreCartelera {
    public static int billboard(String name, int price) {
        int length = name.length();

        int totalCost = 0;

        for (int i = 0; i < length; i++) {
            totalCost += price;
        }

        return totalCost;
    }
}
