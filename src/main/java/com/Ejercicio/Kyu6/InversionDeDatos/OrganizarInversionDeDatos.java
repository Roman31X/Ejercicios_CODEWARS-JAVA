package com.Ejercicio.Kyu6.InversionDeDatos;

public class OrganizarInversionDeDatos {
    public static int[] DataReverse(int[] data) {
        int[] reversedData = new int[data.length];
        int segmentSize = 8;
        int segmentCount = data.length / segmentSize;

        // Reverse the segments
        for (int i = 0; i < segmentCount; i++) {
            for (int j = 0; j < segmentSize; j++) {
                reversedData[(segmentCount - i - 1) * segmentSize + j] = data[i * segmentSize + j];
            }
        }

        return reversedData;
    }
}
