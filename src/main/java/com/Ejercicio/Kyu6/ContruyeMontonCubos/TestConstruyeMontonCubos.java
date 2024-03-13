package com.Ejercicio.Kyu6.ContruyeMontonCubos;

import static com.Ejercicio.Kyu6.ContruyeMontonCubos.ConstruyeUnMontonCubos.findNb;
import static org.junit.Assert.*;
import org.junit.Test;

public class TestConstruyeMontonCubos {
    public static void main(String[] args) {
        System.out.println("Test Construye un montón de cubos");
    }

    @Test
    public void test1() {
        assertEquals(2022, findNb(4183059834009L));
    }
    @Test
    public void test2() {
        assertEquals(-1, findNb(24723578342962L));
    }
    @Test
    public void test3() {
        assertEquals(4824, findNb(135440716410000L));
    }

    @Test
    public void test4() {
        assertEquals(3568, findNb(40539911473216L));
    }
}
