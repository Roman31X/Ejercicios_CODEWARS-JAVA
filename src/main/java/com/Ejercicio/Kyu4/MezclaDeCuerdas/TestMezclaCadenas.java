package com.Ejercicio.Kyu4.MezclaDeCuerdas;

import static com.Ejercicio.Kyu4.MezclaDeCuerdas.MezclarCadenas.mix;
import static org.junit.Assert.*;
import org.junit.Test;

public class TestMezclaCadenas {
    public static void main(String[] args) {
        System.out.println("Test Mezcla de cadenas String");
    }
    @Test
    public void test() {
        System.out.println("Mix Fixed Tests");
        assertEquals("2:eeeee/2:yy/=:hh/=:rr",
                mix("Are they here", "yes, they are here"));
        assertEquals("1:ooo/1:uuu/2:sss/=:nnn/1:ii/2:aa/2:dd/2:ee/=:gg",
                mix("looping is fun but dangerous", "less dangerous than coding"));
        assertEquals("1:aaa/1:nnn/1:gg/2:ee/2:ff/2:ii/2:oo/2:rr/2:ss/2:tt",
                mix(" In many languages", " there's a pair of functions"));
        assertEquals("1:ee/1:ll/1:oo",
                mix("Lords of the Fallen", "gamekult"));
        assertEquals("",
                mix("codewars", "codewars"));
        assertEquals("1:nnnnn/1:ooooo/1:tttt/1:eee/1:gg/1:ii/1:mm/=:rr",
                mix("A generation must confront the looming ", "codewarrs"));
    }
}
