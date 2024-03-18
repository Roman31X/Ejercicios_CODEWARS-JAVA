package com.Ejercicio.Kyu7.DosLuchadoresUnGanador;

public class Fighter {
    public String name;
    public int health, damagePerAttack;

    public Fighter(String name, int health, int damagePerAttack) {
        this.name = name;
        this.health = health;
        this.damagePerAttack = damagePerAttack;
    }

    public static String declareWinner(Fighter fighter1, Fighter fighter2, String firstAttacker){

        Fighter attacker = fighter1.name.equals(firstAttacker) ? fighter1 : fighter2;
        Fighter defender = fighter1.name.equals(firstAttacker) ? fighter2 : fighter1;

        while (fighter1.health > 0 && fighter2.health > 0) {
            defender.health -= attacker.damagePerAttack;

            Fighter temp = attacker;
            attacker = defender;
            defender = temp;
        }
        if (fighter1.health <= 0)
            return fighter2.name;
        else
            return fighter1.name;
    }
}
