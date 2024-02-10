package com.Ejercicio.Kyu6.LadosIgualesMatrizArray;

import org.testng.annotations.Test;

import static com.Ejercicio.Kyu6.LadosIgualesMatrizArray.LadosIgualesMatriz.findEvenIndex;
import static junit.framework.TestCase.assertEquals;

public class TestLadosIgualesMatriz {
    public static void main(String[] args) {
        System.out.println("Test para saber si los lados son iguales en una mtriz");
    }

    @Test
    public void test() {
        assertEquals(3,findEvenIndex(new int[] {1,2,3,4,3,2,1}));
        assertEquals(1,findEvenIndex(new int[] {1,100,50,-51,1,1}));
        assertEquals(-1,findEvenIndex(new int[] {1,2,3,4,5,6}));
        assertEquals(3,findEvenIndex(new int[] {20,10,30,10,10,15,35}));
        assertEquals(-1,findEvenIndex(new int[] {-8505, -5130, 1926, -9026}));
        assertEquals(1,findEvenIndex(new int[] {2824, 1774, -1490, -9084, -9696, 23094}));
        assertEquals(6,findEvenIndex(new int[] {4, 5, 6, 7, 8, 9, 10, 9, 8, 7, 6, 5, 4}));
    }
}
