package org.academiadecodigo.bootcamp.battle.fighters;

/*
  Instances of the class Wizard have the chance to create a shield
  when casting a spell. The next attack won't cause any damage to him.
 */
public class Wizard extends Hero {

    private static final int ATTACK_DAMAGE = 6;
    private static final int SPELL_DAMAGE = 20;
    private static final int INITIAL_HEALTH = 70;

    private static final int SHIELD_PROBABILITY = 15;

    private boolean shield;

    public Wizard(String name) {
        super(name, ATTACK_DAMAGE, SPELL_DAMAGE, INITIAL_HEALTH);
    }
}
