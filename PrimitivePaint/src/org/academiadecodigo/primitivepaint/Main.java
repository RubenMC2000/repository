package org.academiadecodigo.primitivepaint;

import org.academiadecodigo.primitivepaint.PrimitivePaint.RectanglePainter;
import org.academiadecodigo.primitivepaint.SimpleGFX.SimpleGFXGrid;
import org.academiadecodigo.primitivepaint.SimpleGFX.SimpleGFXGridPosition;

public class Main {

    public static void main(String[] args) {

        SimpleGFXGrid simpleGFXGrid = new SimpleGFXGrid(1000,1000);
        simpleGFXGrid.createCanvasRectangles();
        RectanglePainter rectanglePainter = new RectanglePainter();


    }

}
