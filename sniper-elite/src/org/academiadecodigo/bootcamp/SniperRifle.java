package org.academiadecodigo.bootcamp;

/**
 * Created by codecadet on 04/02/2020.
 */
public class SniperRifle {

    //Properties
    private int bulletDamage = 100;

    //Method
    public void shoot(Enemy enemy) {
        if (enemy.isDead()) {
            System.out.println("Why shoot? He is already dead.");
        }
        else if (Math.random() < 0.20) {
            enemy.hit(bulletDamage);
        }
    }

}
