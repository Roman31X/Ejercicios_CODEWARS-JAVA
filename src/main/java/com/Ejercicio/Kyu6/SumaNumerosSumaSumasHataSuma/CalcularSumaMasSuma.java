package com.Ejercicio.Kyu6.SumaNumerosSumaSumasHataSuma;

import java.math.BigInteger;

public class CalcularSumaMasSuma {
    public static BigInteger sumaSuma(int n){
        BigInteger sum = BigInteger.ZERO;
        BigInteger result = BigInteger.ZERO;

        for (int i = 1; i <= n; i++) {
            sum = sum.add(BigInteger.valueOf(i));
            result = result.add(sum);
        }

        result = result.add(BigInteger.ONE).multiply(result).divide(BigInteger.valueOf(2));
        return result;
        /*
        *
        BigInteger N = BigInteger.valueOf(n);
        BigInteger result = N.multiply(N.add(BigInteger.ONE)).multiply(N.add(BigInteger.valueOf(2))).divide(BigInteger.valueOf(6));
        return result;
        * */
    }
}
