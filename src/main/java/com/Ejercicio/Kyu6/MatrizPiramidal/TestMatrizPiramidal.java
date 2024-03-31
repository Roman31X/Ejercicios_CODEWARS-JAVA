package com.Ejercicio.Kyu6.MatrizPiramidal;

import java.util.Arrays;
import java.util.stream.Collectors;
import org.junit.Assert;
import org.junit.Test;
import java.util.Random;

import static com.Ejercicio.Kyu6.MatrizPiramidal.OrganizarMatrizPiramidal.pyramid;

public class TestMatrizPiramidal {
    public static void main(String[] args) {
        System.out.println("Test de Matriz piramidal");
    }

    @Test
    public void fixedTests() {
        test(0, new int[][]{});
        test(1, new int[][]{{1}});
        test(2, new int[][]{{1}, {1, 1}});
        test(3, new int[][]{{1}, {1, 1}, {1,1,1}});
    }

    private static String pyramidToString(int[][] p) {
        return "{" + Arrays.stream(p)
                .map(row -> "{" + Arrays.stream(row).mapToObj(Integer::toString).collect(Collectors.joining(",")) + "}")
                .collect(Collectors.joining(",")) + "}";
    }

    private void test(int n, int[][] correct) {
        int[][] userSolution = pyramid(n);
        String scorrect = pyramidToString(correct);
        String suser = pyramidToString(userSolution);
        String text = suser + "\nshould equal:\n" + scorrect + "\n";
        Assert.assertArrayEquals(text,correct, userSolution);
    }
}
