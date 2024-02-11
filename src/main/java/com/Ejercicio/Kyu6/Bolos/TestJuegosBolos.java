package com.Ejercicio.Kyu6.Bolos;

import org.junit.Test;

import static com.Ejercicio.Kyu6.Bolos.JuegoBolos.bolosPinos;
import static org.junit.Assert.assertEquals;

public class TestJuegosBolos {
    public static void main(String[] args) {
        System.out.println("Test juego de bolos Arrays");
        /*int[] testArray = new int[]{1,2,3};
        System.out.println(bolosPinos(testArray));
        int[] testArray2 = new int[]{3,5,9};
        System.out.println(bolosPinos(testArray2));*/
    }
    @Test
    public void exampleTests()
    {
        int[] testArray = new int[]{1,2,3};
        assertEquals("I I I I\n I I I \n       \n       ", bolosPinos(testArray));

        testArray = new int[]{3,5,9};
        assertEquals("I I   I\n I   I \n  I    \n   I   ", bolosPinos(testArray));
    }
}
