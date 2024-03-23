package com.Ejercicio.Kyu7.RedondearMultiploDe5;

public class RedondearSuigienteMultiplo {
    public static int roundToNext5(int number) {
        if (number >= 0) {
            return number % 5 == 0 ? number : number + (5 - number % 5);
        } else {
            return number % 5 == 0 ? number : number - number % 5;
        }
    }
}
