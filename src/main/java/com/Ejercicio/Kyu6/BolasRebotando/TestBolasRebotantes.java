package com.Ejercicio.Kyu6.BolasRebotando;

import static com.Ejercicio.Kyu6.BolasRebotando.ContadorBotesDeBolas.bouncingBall;
import static org.junit.Assert.*;
import org.junit.Test;

public class TestBolasRebotantes {
    public static void main(String[] args) {
        System.out.println("Test de Bolas rebotando");
    }

    @Test
    public void test1() {
        assertEquals(3, bouncingBall(3.0, 0.66, 1.5));
    }
    @Test
    public void test2() {
        assertEquals(15, bouncingBall(30.0, 0.66, 1.5));
    }
}
