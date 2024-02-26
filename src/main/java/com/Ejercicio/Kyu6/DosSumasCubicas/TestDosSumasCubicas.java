package com.Ejercicio.Kyu6.DosSumasCubicas;
import org.junit.Test;

import static com.Ejercicio.Kyu6.DosSumasCubicas.DossumasCubicas.hasTwoCubeSums;
import static org.junit.Assert.assertEquals;
public class TestDosSumasCubicas {
    public static void main(String[] args) {
        System.out.println("Test de dos sumas Cúbicas");
    }
    @Test
    public void test1(){
        assertEquals(false, hasTwoCubeSums(1));
    }

    @Test
    public void test2(){
        assertEquals(true, hasTwoCubeSums(1729));
    }

    @Test
    public void test3(){
        assertEquals(false, hasTwoCubeSums(42));
    }

    @Test
    public void test4(){
        assertEquals(true, hasTwoCubeSums(4104));
    }

    @Test
    public void test5(){
        assertEquals(false, hasTwoCubeSums(4105));
    }
}
