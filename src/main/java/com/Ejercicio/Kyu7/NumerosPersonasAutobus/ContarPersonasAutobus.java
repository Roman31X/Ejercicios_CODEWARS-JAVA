package com.Ejercicio.Kyu7.NumerosPersonasAutobus;

import java.util.ArrayList;

public class ContarPersonasAutobus {
    public static int contarPersonas(ArrayList<int[]> stops){
        int personasEnBus = 0;
        for (int[] parada : stops) {
            personasEnBus += parada[0] - parada[1];
        }
        return Math.max(personasEnBus, 0);
    }
}
