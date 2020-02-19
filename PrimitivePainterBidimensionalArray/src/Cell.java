import org.academiadecodigo.simplegraphics.graphics.Rectangle;

public class Cell {

    //-------------------------PROPERTIES-------------------------//
    private int col;
    private int row;
    private Rectangle rectangle;
    private int cellsize = 15;
    private int PADDING = 10;

    //-------------------------CONSTRUCTOR-------------------------//
    public Cell(int col, int row){
        this.col = col;
        this.row = row;
        rectangle = new Rectangle(col * cellsize + PADDING, row * cellsize + PADDING, cellsize, cellsize);
        rectangle.draw();
    }

    //-------------------------METHODS-------------------------//
    public void paint(){
        rectangle.fill();
    }

    public void delete(){
      rectangle.draw();
    }

}
