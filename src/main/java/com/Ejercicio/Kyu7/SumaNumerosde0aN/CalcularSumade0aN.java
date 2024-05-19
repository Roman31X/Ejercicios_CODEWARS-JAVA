package com.Ejercicio.Kyu7.SumaNumerosde0aN;

public class CalcularSumade0aN {
    public static String showSequence(int value){
        if (value < 0) {
            return value + "<0";
        }

        // Caso cuando el número es 0
        if (value == 0) {
            return "0=0";
        }

        // Para los valores positivos
        StringBuilder sequence = new StringBuilder();
        int sum = 0;

        for (int i = 0; i <= value; i++) {
            if (i > 0) {
                sequence.append("+");
            }
            sequence.append(i);
            sum += i;
        }

        sequence.append(" = ").append(sum);
        return sequence.toString();
    }
}
