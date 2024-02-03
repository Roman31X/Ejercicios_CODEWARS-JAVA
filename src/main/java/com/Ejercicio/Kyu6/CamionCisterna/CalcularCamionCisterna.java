package com.Ejercicio.Kyu6.CamionCisterna;

public class CalcularCamionCisterna {
    public static int TanqueVol(int h, int d, int vt){
        double radius = d / 2.0;
        double length = vt / (Math.PI * Math.pow(radius, 2));

        double segmentHeight = radius - h;
        double segmentVolume = Math.pow(radius, 2) * Math.acos(segmentHeight / radius) - segmentHeight * Math.sqrt(Math.pow(radius, 2) - Math.pow(segmentHeight, 2));

        double liquidVolume = length * segmentVolume;

        return (int) Math.floor(liquidVolume);
    }
}
