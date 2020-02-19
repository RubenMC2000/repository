package org.academiadecodigo.primitivepaint.PrimitivePaint;

import org.academiadecodigo.primitivepaint.SimpleGFX.SimpleGFXColorMapper;
import org.academiadecodigo.primitivepaint.SimpleGFX.SimpleGFXGrid;
import org.academiadecodigo.primitivepaint.SimpleGFX.SimpleGFXGridPosition;
import org.academiadecodigo.simplegraphics.graphics.Color;
import org.academiadecodigo.simplegraphics.graphics.Rectangle;
import org.academiadecodigo.simplegraphics.keyboard.Keyboard;
import org.academiadecodigo.simplegraphics.keyboard.KeyboardEvent;
import org.academiadecodigo.simplegraphics.keyboard.KeyboardEventType;
import org.academiadecodigo.simplegraphics.keyboard.KeyboardHandler;

public class RectanglePainter implements KeyboardHandler {

    //PROPERTIES
    //private SimpleGFXGrid simpleGrid;
    private SimpleGFXGridPosition simpleGridPosition;
    private SimpleGFXColorMapper simpleColor;
    private Rectangle painter;
    private Keyboard keyboard = new Keyboard(this);
    Rectangle rectangle;


    //CONSTRUCTOR
    public RectanglePainter(){
        //this.simpleGrid= simpleGrid;
        //this.simpleGridPosition = simpleGridPosition;
        //this.simpleColor = simpleColor;
        painter = new Rectangle(SimpleGFXGrid.PADDING, SimpleGFXGrid.PADDING, SimpleGFXGrid.cellSize, SimpleGFXGrid.cellSize);
        painter.fill();
        painter.setColor(Color.BLACK);



        //MOVE UP
        KeyboardEvent moveUp = new KeyboardEvent();
        moveUp.setKey(KeyboardEvent.KEY_UP);
        moveUp.setKeyboardEventType(KeyboardEventType.KEY_PRESSED);
        keyboard.addEventListener(moveUp);

        //MOVE DOWN
        KeyboardEvent moveDown = new KeyboardEvent();
        moveDown.setKey(KeyboardEvent.KEY_DOWN);
        moveDown.setKeyboardEventType(KeyboardEventType.KEY_PRESSED);
        keyboard.addEventListener(moveDown);

        //MOVE LEFT
        KeyboardEvent moveBack = new KeyboardEvent();
        moveBack.setKey(KeyboardEvent.KEY_LEFT);
        moveBack.setKeyboardEventType(KeyboardEventType.KEY_PRESSED);
        keyboard.addEventListener(moveBack);

        //MOVE RIGHT
        KeyboardEvent moveFor = new KeyboardEvent();
        moveFor.setKey(KeyboardEvent.KEY_RIGHT);
        moveFor.setKeyboardEventType(KeyboardEventType.KEY_PRESSED);
        keyboard.addEventListener(moveFor);

        KeyboardEvent delete = new KeyboardEvent();
        delete.setKey(KeyboardEvent.KEY_D);
        delete.setKeyboardEventType(KeyboardEventType.KEY_PRESSED);
        keyboard.addEventListener(delete);

        KeyboardEvent paint = new KeyboardEvent();
        paint.setKey(KeyboardEvent.KEY_F);
        paint.setKeyboardEventType(KeyboardEventType.KEY_PRESSED);
        keyboard.addEventListener(paint);


    }

    //METHODS
    public void createRectangle(Color color){
        Rectangle rectangle = new Rectangle(painter.getX(), painter.getY(), SimpleGFXGrid.cellSize, SimpleGFXGrid.cellSize);
        rectangle.setColor(color);
        rectangle.fill();
    }

    public void movePainter(int col, int row){
        painter.translate(col * SimpleGFXGrid.cellSize, row * SimpleGFXGrid.cellSize);
    }


    public void paint(){
        rectangle = new Rectangle(painter.getX(), painter.getY(), SimpleGFXGrid.cellSize, SimpleGFXGrid.cellSize);
        rectangle.fill();

    }

    public void delete(){
        rectangle = new Rectangle(painter.getX(), painter.getY(), SimpleGFXGrid.cellSize, SimpleGFXGrid.cellSize);
        Rectangle rectangle1 = new Rectangle(painter.getX(), painter.getY(), SimpleGFXGrid.cellSize, SimpleGFXGrid.cellSize);

        rectangle1.setColor(Color.WHITE);
        rectangle1.fill();
        rectangle.draw();
    }

    public void changeColor(){

    }


    @Override
    public void keyPressed(KeyboardEvent keyboardEvent) {
        if (KeyboardEvent.KEY_DOWN == keyboardEvent.getKey()) {
            movePainter(0,1);
            return;
        }

        if (KeyboardEvent.KEY_UP == keyboardEvent.getKey()) {
            movePainter(0,-1);
            return;
        }

        if (KeyboardEvent.KEY_LEFT == keyboardEvent.getKey()) {
            movePainter(-1,0);
            return;
        }

        if (KeyboardEvent.KEY_RIGHT == keyboardEvent.getKey()) {
            movePainter(1,0);
            return;
        }

        if (KeyboardEvent.KEY_F == keyboardEvent.getKey()) {
            paint();
            return;
        }

        if (KeyboardEvent.KEY_D == keyboardEvent.getKey()) {
            delete();
            return;
        }


    }

    @Override
    public void keyReleased(KeyboardEvent keyboardEvent) {

    }

}
