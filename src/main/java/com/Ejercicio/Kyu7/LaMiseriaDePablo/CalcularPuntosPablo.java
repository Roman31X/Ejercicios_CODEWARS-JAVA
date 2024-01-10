package com.Ejercicio.Kyu7.LaMiseriaDePablo;

public class CalcularPuntosPablo {
    public static String paul(String[] x){
        int puntos = 0;
        for (int i = 0; i < x.length ; i++) {
            puntos+= (x[i].equals("kata"))?5:
                     (x[i].equals("Petes kata"))?10:
                     (x[i].equals("life"))?0:1;
        }
        return (puntos < 40)?"Super happy!":
               (puntos < 70)?"Happy!":
               (puntos < 100)?"Sad!":"Miserable!";
    }
}
