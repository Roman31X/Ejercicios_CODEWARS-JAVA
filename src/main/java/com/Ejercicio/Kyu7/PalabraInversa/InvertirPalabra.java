package com.Ejercicio.Kyu7.PalabraInversa;

public class InvertirPalabra {
    public static String reversoPalabra(final String original){
        // Dividir la cadena en palabras y conservar los delimitadores
        StringBuilder resultado = new StringBuilder(original.length());

        // Variable para almacenar la palabra actual mientras se construye
        StringBuilder palabraActual = new StringBuilder();

        // Iterar sobre cada carácter en la cadena original
        for (char c : original.toCharArray()) {
            if (Character.isLetterOrDigit(c)) {
                // Si es un carácter alfanumérico, agregarlo a la palabra actual
                palabraActual.append(c);
            } else {
                // Si es un delimitador, invertir la palabra actual y agregarla al resultado
                resultado.append(palabraActual.reverse());
                palabraActual.setLength(0); // Limpiar la palabra actual para la siguiente iteración
                resultado.append(c); // Agregar el delimitador al resultado
            }
        }

        // Asegurarse de invertir y agregar la última palabra si existe
        resultado.append(palabraActual.reverse());

        return resultado.toString();
    }
}
