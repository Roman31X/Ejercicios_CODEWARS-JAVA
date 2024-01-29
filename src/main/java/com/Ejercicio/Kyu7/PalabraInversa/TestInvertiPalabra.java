package com.Ejercicio.Kyu7.PalabraInversa;

import static com.Ejercicio.Kyu7.PalabraInversa.InvertirPalabra.reversoPalabra;

public class TestInvertiPalabra {
    public static void main(String[] args) {
        System.out.println("Test de inversion de palabra");
        System.out.println("\"!Los perros ladran¡\" : "+reversoPalabra("!Los perros ladran¡"));
        System.out.println("\"...jumps over the lazy [dios.]\" : "+reversoPalabra("...jumps over the lazy [dios.]"));

        String resultado = invertirPalabras("...jumps over the lazy [dios.]");
        System.out.println(resultado);  // Salida: ...spmuj revo eht yzal [.god]

    }
    public static String invertirPalabras(final String s) {
        // Dividir la cadena en palabras y conservar los delimitadores
        String[] palabras = s.split("(?<=\\b)");

        // Invertir cada palabra en el arreglo
        for (int i = 0; i < palabras.length; i++) {
            // Verificar si la palabra tiene corchetes y tratarlos de manera especial
            if (palabras[i].startsWith("[") && palabras[i].endsWith("]")) {
                String contenidoCorchetes = palabras[i].substring(1, palabras[i].length() - 1);
                palabras[i] = "[" + invertirPalabra(contenidoCorchetes) + "]";
            } else {
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
        }

        // Unir las palabras invertidas en una cadena
        return String.join("", palabras);
    }

    private static String invertirPalabra(String palabra) {
        // Convertir la palabra a un arreglo de caracteres para invertirla más fácilmente
        char[] caracteres = palabra.toCharArray();

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
        return new String(caracteres);
    }
}
