package Player;

public class Snake {

    //--------------------PROPERTIES--------------------//
    private int col;
    private int row;
    private boolean moveUp = true;
    private boolean moveDown = true;
    private boolean moveLeft = true;
    private boolean moveRight = true;

    //--------------------CONSTRUCTOR--------------------//
    public Snake(int col, int row){
        this.col = (int) (Math.random() * col);
        this.row = (int) (Math.random() * row);
    }

    //--------------------METHODS--------------------//

    public int getCol() {
        return col;
    }

    public int getRow() {
        return row;
    }

    //--------------------SOME MOVEMENT SHIT--------------------//
    public void moveSnake(){
        if(moveUp == true){
            moveUp();
        }
        if(moveDown == true){
            moveDown();
        }
        if(moveLeft == true){
            moveLeft();
        }
        if(moveRight == true){
            moveRight();
        }
    }

    public void moveUp(){
        row--;
        moveUp = false;
        moveDown = false;
    }

    public void moveDown(){
        row++;
        moveUp = false;
        moveDown = false;
    }

    public void moveLeft(){
        col--;
        moveLeft = false;
        moveRight = false;
    }

    public void moveRight(){
        col++;
        moveLeft = false;
        moveRight = false;
    }
}
