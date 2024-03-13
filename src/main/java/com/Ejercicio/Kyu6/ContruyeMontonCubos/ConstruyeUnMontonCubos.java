package com.Ejercicio.Kyu6.ContruyeMontonCubos;

public class ConstruyeUnMontonCubos {
    public static long findNb(long m) {
        long volume = 0;
        long n = 0;

        while (volume < m) {
            n++;
            volume += n * n * n;
        }

        return volume == m ? n : -1;
    }
}
