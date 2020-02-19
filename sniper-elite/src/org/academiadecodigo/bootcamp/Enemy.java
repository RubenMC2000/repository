package org.academiadecodigo.bootcamp;

/**
 * Created by codecadet on 04/02/2020.
 */
public abstract class Enemy extends GameObject{

    //Properties
    private int health;
    private boolean isDead;

    //Getter and Setter
    public boolean isDead(){
        return this.isDead;
    }

    public void setDead(){
        isDead = true;
    }


    //Methods
    public void hit( int damage){
        if(health <= 0){
            setDead();
            System.out.println("One more enemy dead: " + isDead() + ".");
            System.out.println("Finally!!");
        }
        health -=damage;
        System.out.println("Health remaining is: " + health + ".");
    }

    @Override
    public String getMessage(){
        return "Prepare to die Cyka Blyat";
    }




}
