package com.Ejercicio.Kyu6.ClaseHexagonal;

public class Hex {
    private int value;
    public Hex(int value){
        this.value = value;
    }

    public int valueOf(){
        return value;
    }

    public String toJSON(){
        return "0x" + Integer.toHexString(value).toUpperCase();
    }

    public String toString(){
        return toJSON();
    }

    public Hex plus(Hex other){
        return new Hex(this.value + other.valueOf());
    }

    public Hex minus(Hex other){
        return new Hex(this.value - other.valueOf());
    }

    public Hex plus(int number){
        return new Hex(this.value + number);
    }

    public Hex minus(int number ){
        return new Hex(this.value - number);
    }

    public static int parse(String string){
        if (string.startsWith("0x") || string.startsWith("0X")) {
            return Integer.parseInt(string.substring(2), 16);
        } else {
            return Integer.parseInt(string, 16);
        }
    }

    public boolean equals(Object other){
        if (this == other) return true;
        if (other == null || getClass() != other.getClass()) return false;
        Hex hex = (Hex) other;
        return value == hex.value;
    }
}
