package com.Ejercicio.Kyu8.CantidadTotalPuntos;

public class ContadorPuntosArrays {
    public static int points(String[] games) {
        int puntos = 0;

        for (String resultado : games) {
            String[] partes = resultado.split(":");
            int x = Integer.parseInt(partes[0]);
            int y = Integer.parseInt(partes[1]);

            if (x > y) {
                puntos += 3; // Ganar
            } else if (x < y) {
                puntos += 0; // Pérdida
            } else {
                puntos += 1; // Empate
            }
        }

        return puntos;
    }
}
