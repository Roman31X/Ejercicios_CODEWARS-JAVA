package com.Ejercicio.Kyu6.EvaluarGrupoParentesis;

import java.util.*;

public class TestEvaluarElGrupoDeParentesis {
    public static int evalParentheses(String s) {
        Stack<Integer> stack = new Stack<>();
        int score = 0;

        for (char c : s.toCharArray()) {
            if (c == '(') {
                stack.push(score);
                score = 0;
            } else {
                int prevScore = stack.pop();
                score = prevScore + Math.max(score * 2, 1);
            }
        }

        return score;
    }
}
