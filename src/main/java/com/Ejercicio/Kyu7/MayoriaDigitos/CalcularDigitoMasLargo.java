package com.Ejercicio.Kyu7.MayoriaDigitos;

public class CalcularDigitoMasLargo {
    public static int findLongest(int[] numbers) {
        int longestNumber = numbers[0]; // Inicializamos con el primer número
        for (int i = 1; i < numbers.length; i++) {
            if (countDigits(numbers[i]) > countDigits(longestNumber)) {
                longestNumber = numbers[i];
            }
        }
        return longestNumber;
    }

    public static int countDigits(int number) {
        int count = 0;
        while (number != 0) {
            number /= 10;
            count++;
        }
        return count;
    }
}
