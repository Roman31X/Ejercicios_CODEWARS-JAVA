package com.Ejercicio.Kyu6.DetectarPangrama;

import java.util.HashSet;

public class DetectardorPangrama {
    public boolean check(String sentence){
        HashSet<Character> alphabetSet = new HashSet<>();
        for (char ch = 'a'; ch <= 'z'; ch++) {
            alphabetSet.add(ch);
        }

        HashSet<Character> sentenceSet = new HashSet<>();
        for (char c : sentence.toLowerCase().toCharArray()) {
            if (Character.isLetter(c)) {
                sentenceSet.add(c);
            }
        }

        return sentenceSet.equals(alphabetSet);
    }
}
