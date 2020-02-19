package org.academiadecodigo.simplegraphics.test;

import org.academiadecodigo.simplegraphics.graphics.Color;
import org.academiadecodigo.simplegraphics.graphics.Rectangle;
import org.academiadecodigo.simplegraphics.keyboard.KeyboardEvent;
import org.academiadecodigo.simplegraphics.keyboard.KeyboardHandler;
import org.academiadecodigo.simplegraphics.pictures.Picture;

public class BelosQueues implements KeyboardHandler {

    private Rectangle rectangle;

    public BelosQueues(){
        rectangle = new Rectangle(10,10,30,30);
        rectangle.setColor(Color.BLACK);
        rectangle.fill();
    }

    @Override
    public void keyPressed(KeyboardEvent e) {

        switch (e.getKey()){

            case KeyboardEvent.KEY_D:
                rectangle.translate(10,0);
                break;

            case KeyboardEvent.KEY_A:
                rectangle.translate(-10,0);
                break;

            case KeyboardEvent.KEY_S:
                rectangle.translate(0,10);
                break;

            case KeyboardEvent.KEY_W:
                rectangle.translate(0,-10);
        }

    }

    @Override
    public void keyReleased(KeyboardEvent e) {

    }
}
