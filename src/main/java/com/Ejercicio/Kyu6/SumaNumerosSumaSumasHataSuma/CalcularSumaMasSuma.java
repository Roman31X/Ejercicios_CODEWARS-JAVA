package com.Ejercicio.Kyu6.SumaNumerosSumaSumasHataSuma;

import java.math.BigInteger;

public class CalcularSumaMasSuma {
    public static BigInteger sumaSuma(int n){
        /*BigInteger sum = BigInteger.ZERO;
        BigInteger result = BigInteger.ZERO;

        for (int i = 1; i <= n; i++) {
            sum = sum.add(BigInteger.valueOf(i));
            result = result.add(sum);
        }

        result = result.add(BigInteger.ONE).multiply(result).divide(BigInteger.valueOf(2));
        return result;*/
        BigInteger nBigInteger = BigInteger.valueOf(n);

        // Calcular S(n) = n * (n + 1) / 2
        BigInteger sumN = nBigInteger.multiply(nBigInteger.add(BigInteger.ONE)).divide(BigInteger.valueOf(2));

        // Simplificar la expresión final sin necesidad de calcular S(n) dos veces
        BigInteger result = sumN.multiply(sumN.add(BigInteger.ONE)).divide(BigInteger.valueOf(4));
        //result = result.add(BigInteger.ONE).multiply(result).divide(BigInteger.valueOf(2));

        return result;
    }
}
