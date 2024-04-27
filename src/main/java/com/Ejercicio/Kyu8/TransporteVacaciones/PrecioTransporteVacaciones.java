package com.Ejercicio.Kyu8.TransporteVacaciones;

public class PrecioTransporteVacaciones {
    public static int rentalCarCost(int d) {
        int dailyCost = 40;
        int totalCost = d * dailyCost;

        if (d >= 7) {
            totalCost -= 50;
        } else if (d >= 3) {
            totalCost -= 20;
        }

        return totalCost;
    }
}
