package com.Ejercicio.Kyu6.CifradoSimple;

import org.junit.Test;
import static com.Ejercicio.Kyu6.CifradoSimple.CifradoSimpleDivisionAlterna.decrypt;
import static com.Ejercicio.Kyu6.CifradoSimple.CifradoSimpleDivisionAlterna.encrypt;
import static org.junit.Assert.*;

public class TestDivisionInternaCifradoSimple {
    public static void main(String[] args) {
        System.out.println("Test cifrado simple N° 1: división alterna");
    }

    @Test
    public void testEncrypt() {
        // assertEquals("expected", "actual");
        assertEquals("This is a test!", encrypt("This is a test!", 0));
        assertEquals("hsi  etTi sats!", encrypt("This is a test!", 1));
        assertEquals("s eT ashi tist!", encrypt("This is a test!", 2));
        assertEquals(" Tah itse sits!", encrypt("This is a test!", 3));
        assertEquals("This is a test!", encrypt("This is a test!", 4));
        assertEquals("This is a test!", encrypt("This is a test!", -1));
        assertEquals("hskt svr neetn!Ti aai eyitrsig", encrypt("This kata is very interesting!", 1));
    }

    @Test
    public void testDecrypt() {
        // assertEquals("expected", "actual");
        assertEquals("This is a test!", decrypt("This is a test!", 0));
        assertEquals("This is a test!", decrypt("hsi  etTi sats!", 1));
        assertEquals("This is a test!", decrypt("s eT ashi tist!", 2));
        assertEquals("This is a test!", decrypt(" Tah itse sits!", 3));
        assertEquals("This is a test!", decrypt("This is a test!", 4));
        assertEquals("This is a test!", decrypt("This is a test!", -1));
        assertEquals("This kata is very interesting!", decrypt("hskt svr neetn!Ti aai eyitrsig", 1));
    }

    @Test
    public void testNullOrEmpty() {
        // assertEquals("expected", "actual");
        assertEquals("", encrypt("", 0));
        assertEquals("", decrypt("", 0));
        assertEquals(null, encrypt(null, 0));
        assertEquals(null, decrypt(null, 0));
    }
}
