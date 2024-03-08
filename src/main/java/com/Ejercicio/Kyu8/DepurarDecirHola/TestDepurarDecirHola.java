package com.Ejercicio.Kyu8.DepurarDecirHola;

import static com.Ejercicio.Kyu8.DepurarDecirHola.DecirHola.sayHello;
import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class TestDepurarDecirHola {
    public static void main(String[] args) {
        System.out.println("Test Grasshopper - Depurar decir Hola");
    }

    @Test
    public void test1() {
        assertEquals("Hello, Mr. Spock",
                sayHello("Mr. Spock"));
    }
    @Test
    public void test2() {
        assertEquals("Hello, Captain Kirk",
                sayHello("Captain Kirk"));
    }
    @Test
    public void test3() {
        assertEquals("Hello, Liutenant Uhura",
                sayHello("Liutenant Uhura"));
    }
    @Test
    public void test4() {
        assertEquals("Hello, Dr. McCoy",
                sayHello("Dr. McCoy"));
    }

}
