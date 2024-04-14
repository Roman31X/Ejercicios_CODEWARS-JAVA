package com.Ejercicio.Kyu8.DiferenciaVolumenesCuboides;

public class CalcularVolumenCuboides {
    public static int findDifference(final int[] firstCuboid, final int[] secondCuboid) {
        int volumeFirst = firstCuboid[0] * firstCuboid[1] * firstCuboid[2];
        int volumeSecond = secondCuboid[0] * secondCuboid[1] * secondCuboid[2];
        return Math.abs(volumeFirst - volumeSecond);
    }
}
