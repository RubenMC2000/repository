package org.academiadecodigo.bootcamp.car;

import org.academiadecodigo.bootcamp.grid.position.GridPosition;
import org.academiadecodigo.simplegraphics.graphics.Color;
import org.academiadecodigo.simplegraphics.keyboard.Keyboard;
import org.academiadecodigo.simplegraphics.keyboard.KeyboardEvent;
import org.academiadecodigo.simplegraphics.keyboard.KeyboardEventType;
import org.academiadecodigo.simplegraphics.keyboard.KeyboardHandler;

public class PlayerCar extends Car implements KeyboardHandler {

    public final static int SPEED = 1;

    /**
     * Constructs a new car
     *
     * @param pos     the initial car position
     * @param carType the car type
     */
    public PlayerCar(GridPosition pos) {
        super(pos, CarType.PLAYER);
    }

    KeyboardHandler main = this;
    Keyboard user = new Keyboard(this);


    @Override
    public void move() {
        KeyboardEvent up = new KeyboardEvent();
        KeyboardEvent down = new KeyboardEvent();
        KeyboardEvent left = new KeyboardEvent();
        KeyboardEvent right = new KeyboardEvent();

        up.setKey(KeyboardEvent.KEY_UP);
        down.setKey(KeyboardEvent.KEY_DOWN);

        user.addEventListener(up);
        user.addEventListener(down);

        accelerate();

    }

    @Override
    public void keyPressed(KeyboardEvent e) {
        if (e.getKey() == KeyboardEvent.KEY_UP) {
            this.move();
        }

        if (e.getKey() == KeyboardEvent.KEY_DOWN) {
            this.move();
        }

        if (e.getKey() == KeyboardEvent.KEY_SPACE) {


        }

    }

    @Override
    public void keyReleased(KeyboardEvent e) {

    }



    /*
            Paparascii paparascii = new Paparascii();

        KeyboardHandler papaKey = paparascii;
        MouseHandler papaMouse = paparascii;

        Keyboard x = new Keyboard(paparascii);
        Mouse y = new Mouse(paparascii);

        //OPTIONS
        KeyboardEvent event = new KeyboardEvent();
        KeyboardEvent reverse = new KeyboardEvent();


        //CONFIGURATION
        event.setKey(KeyboardEvent.KEY_D);


     */
}

