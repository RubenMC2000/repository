package Grid;

import org.academiadecodigo.simplegraphics.graphics.Rectangle;

public class Grid {

    //-----PROPERTIES-----//
    public static int PADDING = 10;
    public static int CELLSIZE = 15;
    private int cols;
    private int rows;

    //-----CONSTRUCTOR-----//
    public Grid(int cols, int rows){
        this.cols = cols;
        this.rows = rows;

        Rectangle canvas = new Rectangle(PADDING, PADDING, cols * CELLSIZE, rows * CELLSIZE);
        canvas.draw();
    }

    //-----METHODS-----//
    public static int getPADDING() {
        return PADDING;
    }

    public static int getCELLSIZE() {
        return CELLSIZE;
    }

    public int getCols() {
        return cols;
    }

    public int getRows() {
        return rows;
    }
}
