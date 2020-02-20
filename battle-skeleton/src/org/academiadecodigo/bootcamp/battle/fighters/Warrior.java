package org.academiadecodigo.bootcamp.battle.fighters;

/*
  Instances of the class Warrior have a chance to cause double damage when attacking (critical)
 */
public class Warrior extends Hero {

    private static final int ATTACK_DAMAGE = 30;
    private static final int SPELL_DAMAGE = 5;
    private static final int INITIAL_HEALTH = 50;

    private static final int CRITICAL_CHANCE = 10;
    private static final int CRITICAL_MULTIPLIER = 2;

    public Warrior(String name) {
        super(name, ATTACK_DAMAGE, SPELL_DAMAGE, INITIAL_HEALTH);
    }

}
