package com.Ejercicio.Kyu8.ProblemaTuberiasLariMuigi;

import java.util.Arrays;
import org.junit.Test;
import static org.junit.Assert.assertArrayEquals;
import static com.Ejercicio.Kyu8.ProblemaTuberiasLariMuigi.ProblemaTuberiaCompletar.pipeFix;

public class TestProblemaTuberiaLariMuigi {
    public static void main(String[] args) {
        System.out.println("Test Sencillo de problema con tuberías de Lario y Mugio");
        int[] prueba = pipeFix(new int[] {6,9});
        System.out.println("Números "+ Arrays.toString(prueba));
    }

    @Test
    public void tests() {
        assertArrayEquals(new int[] {1,2,3,4,5,6,7,8,9}, pipeFix(new int[] {1,2,3,5,6,8,9}));
        assertArrayEquals(new int[] {1,2,3,4,5,6,7,8,9,10,11,12}, pipeFix(new int[] {1,2,3,12}));
        assertArrayEquals(new int[] {6,7,8,9}, pipeFix(new int[] {6,9}));
        assertArrayEquals(new int[] {-1,0,1,2,3,4}, pipeFix(new int[] {-1,4}));
        assertArrayEquals(new int[] {1,2,3}, pipeFix(new int[] {1,2,3}));
    }
}
