package GameObjects;

import Grid.Grid;
import org.academiadecodigo.simplegraphics.graphics.Rectangle;

public class Player {

    //-----PROPERTIES-----//
    private int col;
    private int row;
    private int row2 = row +1;
    private int row3 = row +2;

    //-----CONSTRUCTOR-----//
    public Player(int col, int row){
        this.col = col;
        this.row = row;

        Rectangle pong = new Rectangle(col, row, Grid.CELLSIZE, Grid.CELLSIZE * 3);
        pong.draw();
    }

    //-----METHODS-----//
    public int getCol() {
        return col;
    }

    public int getRow() {
        return row;
    }

    public int getRow2() {
        return row2;
    }

    public int getRow3() {
        return row3;
    }
}
