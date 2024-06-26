package com.Ejercicio.Kyu7.TrollsDesvocacionales;

import org.junit.Test;
import static com.Ejercicio.Kyu7.TrollsDesvocacionales.IdentificarTrollsDesvocacionales.disemvowel;
import static org.junit.Assert.assertEquals;

public class TestTrollsDesvocacionales {
    public static void main(String[] args) {
        System.out.println("Test de Trolls desvocacionales");
    }

    @Test
    public void FixedTests() {
        assertEquals("Ths wbst s fr lsrs LL!",
                disemvowel("This website is for losers LOL!")
        );
        assertEquals("N ffns bt,\nYr wrtng s mng th wrst 'v vr rd",
                disemvowel(
                "No offense but,\nYour writing is among the worst I've ever read"));
        assertEquals( "Wht r y,  cmmnst?",
                disemvowel("What are you, a communist?"));
    }
}
