package com.Ejercicio.Kyu6.RanaSaltando;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Arrays;
import java.util.Collection;

import static com.Ejercicio.Kyu6.RanaSaltando.CalcularRanaSaltante.solution;

@RunWith(Parameterized.class)
public class TestRanaSaltante {
    public static void main(String[] args) {
        System.out.println("Test de Rana Saltante");
    }

    private int[] input;
    private int expected;

    public TestRanaSaltante(int[] a, int expected) {
        this.input = a;
        this.expected = expected;
    }

    @Parameterized.Parameters
    public static Collection<Object[]> data() {
        return Arrays.asList(new Object[][]{
                {new int[]{1, 2, 2, -1}, 4},
                {new int[]{1, 2, 1, 5}, 3},
                {new int[]{1, 1, 1, 1, 5, 1, 1, 1, 1, 1, 1, 1, 1}, 9},
                {new int[]{1, 2, 3, 1, -2, 1}, 6},
                {new int[]{1, 1, 1, 1}, 4},
                {new int[]{-1, -1, -2}, 1},
                {new int[]{-3}, 1},
                {new int[]{1, -1}, -1},
                {new int[]{1, 2, 1, 2, -3, -4}, -1},
                {new int[]{1, 0, 2}, -1}
        });
    }

    @Test
    public void should_test_solution() {
        Assert.assertEquals(Arrays.toString(input), expected, solution(input));
    }
}
