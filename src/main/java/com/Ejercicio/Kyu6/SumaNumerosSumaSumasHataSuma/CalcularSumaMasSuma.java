package com.Ejercicio.Kyu6.SumaNumerosSumaSumasHataSuma;

import java.math.BigInteger;

public class CalcularSumaMasSuma {
    public static BigInteger sumaSuma(int n){
        BigInteger sum = BigInteger.ZERO;
        BigInteger result = BigInteger.ZERO;
        BigInteger auxiliar = BigInteger.ZERO;


        for (int i = 1; i <= n; i++) {
            sum = sum.add(BigInteger.valueOf(i));
            result = result.add(sum);
        }
        auxiliar = result;
        result = result.add(BigInteger.valueOf(1));
        result = result.multiply(auxiliar);
        result = result.divide(BigInteger.valueOf(2));
        return result;
    }
}
