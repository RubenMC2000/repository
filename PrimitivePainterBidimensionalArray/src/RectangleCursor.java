import org.academiadecodigo.simplegraphics.graphics.Rectangle;

public class RectangleCursor {

    //-------------------------PROPERTIES-------------------------//
    private int col;
    private int row;
    private Rectangle cursor;

    //-------------------------CONSTRUCTOR-------------------------//
    public RectangleCursor() {
        this.col = 0;
        this.row = 0;
        cursor = new Rectangle(10, 10, 15, 15);
    }


    //-------------------------METHODS-------------------------//
    public void moveUp() {
        row--;
        cursor.translate(0, -15);
    }

    public void moveDown() {
        row++;
        cursor.translate(0, 15);
    }

    public void moveLeft() {
        col--;
        cursor.translate(-15, 0);
    }

    public void moveRight() {
        col++;
        cursor.translate(15, 0);
    }

}
