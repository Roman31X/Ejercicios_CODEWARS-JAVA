package com.Ejercicio.Kyu8.QueTanBuenoEresRealmente;

public class CalcularPromedio {
    public static boolean berificarPuntaje(int[] classPoints, int yourPoints){
        double promedioSalon = 0, notaTotal = 0;
        for (int i = 0; i < classPoints.length; i++) {
            notaTotal += classPoints[i];
        }
        promedioSalon = notaTotal/ classPoints.length;
        return (yourPoints > promedioSalon)?true:false;
    }
}
