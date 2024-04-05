package com.Ejercicio.Kyu6.Reunion;

import java.util.*;

public class EstrcuturarReaunion {
    public static String meeting(String s) {
        String[] guests = s.toUpperCase().split(";");

        // Clase Comparator para ordenar los invitados por apellido y luego por nombre
        Comparator<String> comparator = new Comparator<String>() {
            @Override
            public int compare(String guest1, String guest2) {
                // Divide cada invitado en nombre y apellido
                String[] parts1 = guest1.split(":");
                String[] parts2 = guest2.split(":");

                // Extrae los apellidos
                String lastName1 = parts1[1];
                String lastName2 = parts2[1];

                // Compara los apellidos
                int lastNameComparison = lastName1.compareTo(lastName2);
                if (lastNameComparison != 0) {
                    return lastNameComparison;
                } else {
                    // Si los apellidos son iguales, compara los nombres
                    String firstName1 = parts1[0];
                    String firstName2 = parts2[0];
                    return firstName1.compareTo(firstName2);
                }
            }
        };

        // Ordena los invitados usando el comparador
        Arrays.sort(guests, comparator);

        // Construye la cadena de salida
        StringBuilder result = new StringBuilder();
        for (String guest : guests) {
            String[] parts = guest.split(":");
            result.append("(")
                    .append(parts[1])
                    .append(", ")
                    .append(parts[0])
                    .append(")");
        }

        return result.toString();
    }
}
