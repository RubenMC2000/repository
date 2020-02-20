package org.academiadecodigo.bootcamp.battle.fighters;

public class FightersFactory {

    public Hero createHeroes(Fighters fighters){
        switch (fighters){

            case ARCHER:
                return new Archer("archer");

            case WIZARD:
                return new Wizard("wizard");

            case WARRIOR:
                return new Warrior("warrior");
        }
        return null;
    }

}
