package org.academiadecodigo.bootcamp;

/**
 * Created by codecadet on 04/02/2020.
 */
public class Main {



    public static void main(String[] args) {


        Game game1 = new Game();
        game1.createObjects(10);
        game1.start();
        System.out.println(game1.getShotsFired());






    }

}
