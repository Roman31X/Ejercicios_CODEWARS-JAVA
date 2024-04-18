package com.Ejercicio.Kyu7.ObstaculosEnCamino;

public class IdentificarObstaculosCamino {
    public static String bumps(final String road) {
        int bumpCount = 0; // Contador de baches

        for (int i = 0; i < road.length(); i++) {
            char c = road.charAt(i);
            if (c == 'n') {
                bumpCount++; // Incrementa el contador si encuentra un bache
            }
        }

        // Retorna el resultado basado en el contador de baches
        if (bumpCount <= 15) {
            return "Woohoo!";
        } else {
            return "Car Dead";
        }
    }
}
