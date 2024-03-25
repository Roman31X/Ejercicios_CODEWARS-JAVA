package com.Ejercicio.Kyu7.RedondearMultiploDe5;

import static com.Ejercicio.Kyu7.RedondearMultiploDe5.RedondearSuigienteMultiplo.roundToNext5;
import static org.junit.Assert.*;
import java.util.Arrays;
import org.junit.Test;

public class TestRedondearMultiploDe5 {
    public static void main(String[] args) {
        System.out.println("Test Redondear al siguiente múltiplo de 5");
    }
    @Test
    public void basicTests() {
        int[][] arr = {
                {0, 0},
                {1, 5},
                {3, 5},
                {5, 5},
                {7, 10},
                {39, 40}
        };
        Arrays.stream(arr)
                .forEach(
                        (testCase) -> {
                            assertEquals(
                                    "Input: " + testCase[0],
                                    testCase[1],
                                    roundToNext5(testCase[0]));
                        });
    }
}
