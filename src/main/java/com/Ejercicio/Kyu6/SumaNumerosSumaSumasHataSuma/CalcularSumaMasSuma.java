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

        return result;
    }
}
