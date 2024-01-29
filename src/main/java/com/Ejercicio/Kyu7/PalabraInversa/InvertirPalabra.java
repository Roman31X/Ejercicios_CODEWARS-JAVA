package com.Ejercicio.Kyu7.PalabraInversa;

public class InvertirPalabra {
    public static String reversoPalabra(final String original){
        // Dividir la cadena en palabras y conservar los delimitadores
        String[] palabras = original.split("(?<=\\b)");

        // Invertir cada palabra en el arreglo
        for (int i = 0; i < palabras.length; i++) {
            // Convertir la palabra a un arreglo de caracteres para invertirla más fácilmente
            char[] caracteres = palabras[i].toCharArray();

            // Invertir el arreglo de caracteres en su lugar
            int izquierda = 0, derecha = caracteres.length - 1;
            while (izquierda < derecha) {
                char temp = caracteres[izquierda];
                caracteres[izquierda] = caracteres[derecha];
                caracteres[derecha] = temp;
                izquierda++;
                derecha--;
            }

            // Convertir el arreglo de caracteres invertido de vuelta a una cadena
            palabras[i] = new String(caracteres);
        }

        // Unir las palabras invertidas en una cadena
        return String.join("", palabras);
    }
}
