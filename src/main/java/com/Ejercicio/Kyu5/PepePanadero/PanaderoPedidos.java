package com.Ejercicio.Kyu5.PepePanadero;

import java.util.*;

public class PanaderoPedidos {
    public static int cakes(Map<String, Integer> recipe, Map<String, Integer> available) {
        int maxCakes = Integer.MAX_VALUE;
        for (Map.Entry<String, Integer> entry : recipe.entrySet()) {
            String ingredient = entry.getKey();
            int requiredAmount = entry.getValue();

            if (!available.containsKey(ingredient) || available.get(ingredient) < requiredAmount) {
                return 0;
            }
            maxCakes = Math.min(maxCakes, available.get(ingredient) / requiredAmount);
        }

        return maxCakes;
    }
}
