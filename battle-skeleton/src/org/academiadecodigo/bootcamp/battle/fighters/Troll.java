package org.academiadecodigo.bootcamp.battle.fighters;

/*
  Instances of the class Troll have the chance to skip an attack
 */
public class Troll extends Hero {

    private static final int ATTACK_DAMAGE = 8;
    private static final int SPELL_DAMAGE = 2;
    private static final int INITIAL_HEALTH = 300;

    private static final int ATTACK_POSSIBILITY = 50;

    public Troll(String name) {
        super(name, ATTACK_DAMAGE, SPELL_DAMAGE, INITIAL_HEALTH);
    }
}
