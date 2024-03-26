package com.Ejercicio.Kyu6.EvaluarGrupoParentesis;

import org.junit.jupiter.api.Test;
import static com.Ejercicio.Kyu6.EvaluarGrupoParentesis.EvaluarGrupoDeParentesis.evalParentheses;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class TestEvaluarElGrupoDeParentesis {
    public static void main(String[] args) {
        System.out.println("Test Evaluar el grupo de paréntesis");
    }

    @Test
    void sampleTest() {
        assertEquals(0, evalParentheses(""));
        assertEquals(1, evalParentheses("()"));
        assertEquals(2, evalParentheses("(())"));
        assertEquals(2, evalParentheses("()()"));
        assertEquals(6, evalParentheses("((())())"));
        assertEquals(6, evalParentheses("(()(()))"));
        assertEquals(3, evalParentheses("()(())"));
        assertEquals(5, evalParentheses("()((()))"));
    }

}
