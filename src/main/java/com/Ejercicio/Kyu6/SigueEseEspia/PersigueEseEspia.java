package com.Ejercicio.Kyu6.SigueEseEspia;

import java.util.*;

public class PersigueEseEspia {
    public static String findRoutes(String[][] routes) {
        Map<String, String> routeMap = new HashMap<>();

        // Construir el mapa de rutas
        for (String[] route : routes) {
            routeMap.put(route[0], route[1]);
        }

        // Encontrar el punto de inicio
        String start = null;
        for (String key : routeMap.keySet()) {
            if (!routeMap.containsValue(key)) {
                start = key;
                break;
            }
        }

        // Construir la secuencia de destinos
        StringBuilder sequence = new StringBuilder(start);
        String next = routeMap.get(start);
        while (next != null) {
            sequence.append(", ").append(next);
            next = routeMap.get(next);
        }

        return sequence.toString();
    }
}
