package org.academiadecodigo.bootcamp.battle.Player;

import org.academiadecodigo.bootcamp.battle.fighters.Hero;

public class Player {

    private int health = 100;
    private int mana = 100;
    private boolean defeated = false;
    private Hero hero;
    private String name;

    public Player(String name) {
        this.name = name;
    }

    public void sufferDamage(int damage){
        if(defeated){
            System.out.println(getName() + " is already defeated");

        }
        if(hero.getHealth() < damage){
            int remainingDamage = damage - hero.getHealth();
            health -= remainingDamage;
            System.out.println("Player " + getName() + "reaming health is: " + getHealth());

        }
        if(health < damage){
            health = 0;
            defeated = true;
            System.out.println("Player " + getName() + "was been defeated");
            return;
        }
        health = health - damage;
        System.out.println("Player " + getName() + "reaming health is: " + getHealth());

    }

    public String getName() {
        return name;
    }

    public int getHealth() {
        return health;
    }

    public int getMana() {
        return mana;
    }

    public boolean isDefeated() {
        return defeated;
    }
}
