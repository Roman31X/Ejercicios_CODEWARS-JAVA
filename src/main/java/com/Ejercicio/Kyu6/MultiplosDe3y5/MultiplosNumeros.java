package com.Ejercicio.Kyu6.MultiplosDe3y5;

public class MultiplosNumeros {
    public int solucion(int number){
        int multiCinco = 0,multiTres = 0, total = 0;
        for (int i = 0; i < number; i++) {
            multiTres = i%3;
            multiCinco = i%5;
            total += (multiTres == 0 || multiCinco == 0)?i:0;
        }
        return total;
    }
}
