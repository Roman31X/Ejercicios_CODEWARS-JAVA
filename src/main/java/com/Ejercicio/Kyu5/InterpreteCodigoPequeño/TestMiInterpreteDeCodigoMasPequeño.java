package com.Ejercicio.Kyu5.InterpreteCodigoPequeño;

import org.junit.Test;
import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

public class TestMiInterpreteDeCodigoMasPequeño {
    public static void main(String[] args) {
        System.out.println("Test de Mi intérprete de código m´´as pequeño (tambien conocido como Brainf**k)");
    }

    @Test
    public void testEchoUntilByte255Encountered() {
        assertThat(new BrainLuck(",+[-.,+]").process("Codewars" + ((char) 255)), is("Codewars"));
    }

    @Test
    public void testEchoUntilByte0Encountered() {
        assertThat(new BrainLuck(",[.[-],]").process("Codewars" + ((char) 0)), is("Codewars"));
    }

    @Test
    public void testTwoNumbersMultiplier() {
        final char[] input = {8, 9};
        assertThat(new BrainLuck(",>,<[>[->+>+<<]>>[-<<+>>]<<<-]>>.").process(String.valueOf(input[0]) + String.valueOf(input[1])), is(String.valueOf((char) (input[0] * input[1]))));
    }
}
