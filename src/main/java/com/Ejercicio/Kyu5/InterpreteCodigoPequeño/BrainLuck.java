package com.Ejercicio.Kyu5.InterpreteCodigoPequeño;

public class BrainLuck {
    private String code;
    private byte[] tape;
    private int pointer;
    private int instructionPointer;
    private String output;

    public BrainLuck(String code) {
        this.code = code;
        this.tape = new byte[30000];
        this.pointer = 0;
        this.instructionPointer = 0;
        this.output = "";
    }

    public String process(String input) {
        int inputIndex = 0;
        while (instructionPointer < code.length()) {
            char c = code.charAt(instructionPointer);
            switch (c) {
                case '>':
                    pointer++;
                    break;
                case '<':
                    pointer--;
                    break;
                case '+':
                    tape[pointer]++;
                    break;
                case '-':
                    tape[pointer]--;
                    break;
                case '.':
                    output += (char) tape[pointer];
                    break;
                case ',':
                    if (inputIndex < input.length()) {
                        tape[pointer] = (byte) input.charAt(inputIndex++);
                    }
                    break;
                case '[':
                    if (tape[pointer] == 0) {
                        instructionPointer = findMatchingClosingBracket(instructionPointer);
                    }
                    break;
                case ']':
                    if (tape[pointer] != 0) {
                        instructionPointer = findMatchingOpeningBracket(instructionPointer);
                    }
                    break;
            }
            instructionPointer++;
        }
        return output;
    }

    private int findMatchingClosingBracket(int openingBracketIndex) {
        int depth = 1;
        for (int i = openingBracketIndex + 1; i < code.length(); i++) {
            if (code.charAt(i) == '[') {
                depth++;
            } else if (code.charAt(i) == ']') {
                depth--;
                if (depth == 0) {
                    return i;
                }
            }
        }
        return -1;
    }

    private int findMatchingOpeningBracket(int closingBracketIndex) {
        int depth = 1;
        for (int i = closingBracketIndex - 1; i >= 0; i--) {
            if (code.charAt(i) == ']') {
                depth++;
            } else if (code.charAt(i) == '[') {
                depth--;
                if (depth == 0) {
                    return i;
                }
            }
        }
        return -1;
    }
}
