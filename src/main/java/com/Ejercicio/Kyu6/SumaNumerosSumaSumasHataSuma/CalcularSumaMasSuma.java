package com.Ejercicio.Kyu6.SumaNumerosSumaSumasHataSuma;

import java.math.BigInteger;

public class CalcularSumaMasSuma {
    public static BigInteger sumaSuma(int n){
        BigInteger nBigInteger = BigInteger.valueOf(n);
        BigInteger sumN = nBigInteger.multiply(nBigInteger.add(BigInteger.ONE)).divide(BigInteger.valueOf(2));
        BigInteger result = sumN.multiply(sumN.add(BigInteger.ONE)).divide(BigInteger.valueOf(4));

        return result;
    }
}
