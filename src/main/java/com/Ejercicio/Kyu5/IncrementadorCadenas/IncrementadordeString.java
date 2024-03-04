package com.Ejercicio.Kyu5.IncrementadorCadenas;
import java.math.BigInteger;
public class IncrementadordeString {
    public static String incrementString(String str) {
        String nonNumericPart = str.replaceAll("\\d+$", "");
        String numericPart = str.substring(nonNumericPart.length());

        // Incrementa el número (o agrega 1 si no hay número o si no es un número válido)
        String incrementedNumericPart = incrementNumericPart(numericPart);

        // Une las partes y devuelve la cadena incrementada
        return nonNumericPart + incrementedNumericPart;
    }

    private static String incrementNumericPart(String numericPart) {
        if (numericPart.isEmpty()) {
            return "1";
        }

        // Elimina los ceros iniciales y agrega 1 al número
        BigInteger number = new BigInteger(numericPart);
        number = number.add(BigInteger.ONE);

        // Agrega los ceros iniciales nuevamente
        String formattedNumber = String.format("%0" + numericPart.length() + "d", number);

        return formattedNumber;
    }
}
