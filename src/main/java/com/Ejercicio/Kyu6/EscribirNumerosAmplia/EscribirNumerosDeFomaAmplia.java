package com.Ejercicio.Kyu6.EscribirNumerosAmplia;

public class EscribirNumerosDeFomaAmplia {
    public static String expandedForm(int num)
    {
        String numString = String.valueOf(num);
        StringBuilder result = new StringBuilder();

        for (int i = 0; i < numString.length(); i++) {
            int digit = Character.getNumericValue(numString.charAt(i));
            if (digit != 0) {
                if (result.length() != 0) {
                    result.append(" + ");
                }
                result.append(digit);
                for (int j = i + 1; j < numString.length(); j++) {
                    result.append("0");
                }
            }
        }

        return result.toString();
    }
}
