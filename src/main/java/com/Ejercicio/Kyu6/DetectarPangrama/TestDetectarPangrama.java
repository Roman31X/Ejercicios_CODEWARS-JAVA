package com.Ejercicio.Kyu6.DetectarPangrama;

import org.junit.Test;
import static org.junit.Assert.assertEquals;
import org.junit.runners.JUnit4;

public class TestDetectarPangrama {
    DetectardorPangrama pc = new DetectardorPangrama();
    @Test
    public void test1() {
        String pangram1 = "The quick brown fox jumps over the lazy dog.";
        assertEquals(true, pc.check(pangram1));
    }
    @Test
    public void test2() {
        String pangram2 = "You shall not pass!";
        assertEquals(false, pc.check(pangram2));
    }

}
