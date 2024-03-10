package com.Ejercicio.Kyu5.DiversionConArboles;

import org.junit.Test;
import static com.Ejercicio.Kyu5.DiversionConArboles.TreeNode.arrayToTree;
import static org.hamcrest.CoreMatchers.*;
import static org.junit.Assert.assertThat;

public class TestConnjuntoaArboles {
    public static void main(String[] args) {
        System.out.println("Test Diversion con árboles: conjunto a árboles");
    }
    @Test
    public void emptyArray() {
        TreeNode expected = null;
        assertThat(arrayToTree(arrayFrom()), is(expected));
    }
    private int[] arrayFrom(int... values) {
        return values;
    }
}
