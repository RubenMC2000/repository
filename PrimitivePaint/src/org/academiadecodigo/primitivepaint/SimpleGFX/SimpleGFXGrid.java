package org.academiadecodigo.primitivepaint.SimpleGFX;

import org.academiadecodigo.simplegraphics.graphics.Rectangle;

public class SimpleGFXGrid {

    //PROPERTIES
    public static final int PADDING = 15;
    public static final int cellSize = 15;
    private int cols;
    private int rows;
    private Rectangle canvas;

    //CONSTRUCTOR
    public SimpleGFXGrid(int cols, int rows){
        this.cols = cols;
        this.rows = rows;

        canvas = new Rectangle(PADDING, PADDING, this.cols * cellSize, this.rows * cellSize);
        canvas.draw();
    }

    //METHODS
    public void createCanvasRectangles() {
        int temp = -15;
        for (int j = 0; j < cols; j++) {
            temp+= cellSize;
            for (int i = 0; i < cols; i++) {
                Rectangle rectangleCols = new Rectangle(cellSize + temp, i * cellSize + PADDING, cellSize, cellSize);
                rectangleCols.draw();
            }
        }
    }

}
