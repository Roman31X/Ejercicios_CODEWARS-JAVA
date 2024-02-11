package com.Ejercicio.Kyu6.PedidoPorFavor;

import static com.Ejercicio.Kyu6.PedidoPorFavor.OrdenarLetrasPorNumero.order;
import static org.junit.Assert.*;
import org.junit.Test;
import static org.hamcrest.CoreMatchers.*;

public class TestOrdenarPedidoPalabras {
    public static void main(String[] args) {
        System.out.println("Test para ordenar las palabras por el numero dentro de ellas");
    }
    @Test
    public void test1() {
        assertThat(order("is2 Thi1s T4est 3a"), equalTo("Thi1s is2 3a T4est"));
    }

    @Test
    public void test2() {
        assertThat(order("4of Fo1r pe6ople g3ood th5e the2"), equalTo("Fo1r the2 g3ood 4of th5e pe6ople"));
    }

    @Test
    public void test3() {
        assertThat("Empty input should return empty string",order(""), equalTo(""));
    }

}
