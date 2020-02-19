public class Grid {

    //-------------------------PROPERTIES-------------------------//
    private int cols;
    private int rows;
    private Cell [][] cells;

    //-------------------------CONSTRUCTOR-------------------------//
    public Grid(int cols, int rows){
        this.cols = cols;
        this.rows = rows;
        createGrid();
    }

    //-------------------------METHODS-------------------------//
    public void createGrid(){
        cells = new Cell[cols][rows];
        for(int col = 0; col < cols; col++){
            for(int row = 0; row < rows; row++){
                cells[col][row] = new Cell(col,row);
            }
        }
    }

    public Cell getCell(int col, int row){
        Cell c = cells[col][row];
        return c;
    }
}
