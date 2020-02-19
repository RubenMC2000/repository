package org.academiadecodigo.bootcamp;

/**
 * Created by codecadet on 04/02/2020.
 */
public class Game {

    //Properties
    public GameObject[] gameObjects;
    private SniperRifle sniperRifle = new SniperRifle();
    private int shotsFired;




    //Methods
    public void start(){
        for( int i = 0; i < gameObjects.length; i++){

            //Check if is Tree type
            if( gameObjects[i] instanceof Tree){
                Tree tree = (Tree)gameObjects[i];
                System.out.println(tree.getMessage());
            }
            //Check if is Enemy type
            else if(gameObjects[i] instanceof Enemy){
                Enemy enemy = (Enemy)gameObjects[i];
                System.out.println(enemy.getMessage());

                //Shoots until enemy is dead
                while (!enemy.isDead()){
                    sniperRifle.shoot(enemy);
                    shotsFired++;
                }
            }
        }
    }

    public GameObject[] createObjects(int objects){
        gameObjects = new GameObject[objects];

        for(int i = 0; i < gameObjects.length; i++){

            //30% chance to create a tree from all GameObjects
            if( Math.random() > 0.70){
                gameObjects[i] = new Tree();
                continue;
            }

            //If a enemy is create, it has a 40% chance to create a ArmourEnemy
            if( Math.random() > 0.60){
                gameObjects[i] = new ArmouredEnemy();
                continue;
            }
            gameObjects[i] = new SoldierEnemy();
            continue;
        }
        return gameObjects;
    }

    public int getShotsFired(){
        return shotsFired;
    }


}
