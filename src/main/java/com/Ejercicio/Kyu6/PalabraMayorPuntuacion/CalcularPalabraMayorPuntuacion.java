package com.Ejercicio.Kyu6.PalabraMayorPuntuacion;

public class CalcularPalabraMayorPuntuacion {
    public static String high(String s) {
        String[] words = s.split("\\s+");
        int maxScore = 0;
        String highestScoringWord = "";

        for (String word : words) {
            int wordScore = calculateWordScore(word);
            if (wordScore > maxScore || (wordScore == maxScore && s.indexOf(word) < s.indexOf(highestScoringWord))) {
                maxScore = wordScore;
                highestScoringWord = word;
            }
        }

        return highestScoringWord;
    }

    private static int calculateWordScore(String word) {
        int score = 0;
        for (char c : word.toCharArray()) {
            score += (c - 'a') + 1;
        }
        return score;
    }
}
