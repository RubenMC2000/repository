package org.academiadecodigo.bootcamp.battle.fighters;

public abstract class Hero {

    private String name;
    private int attackDamage;
    private int spellDamage;
    private int health;
    private int manaCost;

    public Hero(String name, int attackDamage, int spellDamage, int health, int manaCost) {

    }

    public void attack(){

    }

    public void UseSpell(){

    }

    public int getAttackDamage() {
        return attackDamage;
    }

    public int getSpellDamage() {
        return spellDamage;
    }

    public int getHealth() {
        return health;
    }

    public int getManaCost() {
        return manaCost;
    }
}
