package org.academiadecodigo.bootcamp;

/**
 * Created by codecadet on 04/02/2020.
 */
public class ArmouredEnemy extends Enemy {

    //Properties
    private int armour = 100;



    //Method
    @Override
    public void hit( int damage){
        if( armour != 0){
            this.armour = armour - damage;
            System.out.println("Armour remaining is: " + armour + ".");
        }
        else {
            super.hit(damage);
        }

    }

}
