package GameObjects;

import Grid.Grid;
import org.academiadecodigo.simplegraphics.graphics.Rectangle;

public class Ball {

    //-----PROPERTIES-----//
    private int col;
    private int row;

    //-----CONSTRUCTOR-----//
    public Ball(int col, int row) {
        this.col = col;
        this.row = row;


        Rectangle ball = new Rectangle(col, row, Grid.CELLSIZE, Grid.CELLSIZE);
        ball.draw();
    }


    //-----METHODS-----//
    public int getCol() {
        return col;
    }

    public int getRow() {
        return row;
    }
}
