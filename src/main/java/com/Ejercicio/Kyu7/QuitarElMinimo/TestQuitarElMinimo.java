package com.Ejercicio.Kyu7.QuitarElMinimo;

import org.junit.jupiter.api.Test;
import static com.Ejercicio.Kyu7.QuitarElMinimo.EliminarElMinimoArrays.removeSmallest;
import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import java.util.Arrays;

public class TestQuitarElMinimo {
    public static void main(String[] args) {
        System.out.println("Test Quitar el mínimo de arrays");
    }

    @Test
    void test1() {
        int[] actual = removeSmallest(new int[] {1, 2, 3, 4, 5});
        assertArrayEquals(new int[] {2, 3, 4, 5}, actual,
                "For numbers = [1, 2, 3, 4, 5]:\nexpected: [2, 3, 4, 5]\nactual:   " + Arrays.toString(actual) + "\n");
    }
    @Test
    void test2() {
        int[] actual = removeSmallest(new int[] {5, 3, 2, 1, 4});
        assertArrayEquals(new int[] {5, 3, 2, 4}, actual,
                "For numbers = [5, 3, 2, 1, 4]:\nexpected: [5, 3, 2, 4]\nactual:   " + Arrays.toString(actual) + "\n");
    }
    @Test
    void test3() {
        int[] actual = removeSmallest(new int[] {2, 2, 1, 2, 1});
        assertArrayEquals(new int[] {2, 2, 2, 1}, actual,
                "For numbers = [2, 2, 1, 2, 1]:\nexpected: [2, 2, 2, 1]\nactual:   " + Arrays.toString(actual) + "\n");
    }
    @Test
    void test4() {
        int[] actual = removeSmallest(new int[] {5, 3, 2, 1, 4});
        assertArrayEquals(new int[] {5, 3, 2, 4}, actual,
                "For numbers = [5, 3, 2, 1, 4]:\nexpected: [5, 3, 2, 4]\nactual:   " + Arrays.toString(actual) + "\n");
    }
    @Test
    void test5() {
        int[] actual = removeSmallest(new int[] {5, 4, 3, 2, 1});
        assertArrayEquals(new int[] {5, 4, 3, 2}, actual,
                "For numbers = [5, 4, 3, 2, 1]:\nexpected: [5, 4, 3, 2]\nactual:   " + Arrays.toString(actual) + "\n");
    }
}
