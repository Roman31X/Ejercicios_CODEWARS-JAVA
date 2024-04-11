package com.Ejercicio.Kyu7.Prueba123;

import java.util.*;

public class EvaluarTest123 {
    public static List<String> number(List<String> lines) {
        List<String> numberedLines = new ArrayList<>();

        for (int i = 0; i < lines.size(); i++) {
            int lineNumber = i + 1;
            String numberedLine = lineNumber + ": " + lines.get(i);
            numberedLines.add(numberedLine);
        }

        return numberedLines;
    }
}
