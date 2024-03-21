package com.Ejercicio.Kyu5.ProductoNumeroConsecutivo;

import static com.Ejercicio.Kyu5.ProductoNumeroConsecutivo.CalcularFibConsecutivo.productFib;
import static org.junit.Assert.*;
import org.junit.Test;

public class TestProductoNumeroFibConsecutivo {
    public static void main(String[] args) {
        System.out.println("Test Producto de números Fib consecutivos");
    }

    @Test
    public void test1() {
        long[] r = new long[] {55, 89, 1};
        assertArrayEquals(r, productFib(4895));
    }
    @Test
    public void test2() {
        long[] r = new long[] {89, 144, 0};
        assertArrayEquals(r, productFib(5895));
    }
}
