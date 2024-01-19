package com.Ejercicio.Kyu7.SumaCubos;

public class SumarCubos {
    public static long sumaCubos(long n){
        long cuboSuma = 0;
        for (int i = 1; i <= n; i++) {
            cuboSuma += (long)Math.pow(i,3);
            //cuboSuma += (long) i*i*i;

        }
        return cuboSuma;
    }
}
