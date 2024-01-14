package com.Ejercicio.Kyu8.GalonesyMillas;

public class CalculoGalonesMIllas {
    public static boolean RecorridoMillas(double distanceToPump, double mpg, double fuelLeft){
        return ((mpg * fuelLeft) >= distanceToPump)?true:false;
    }
}
