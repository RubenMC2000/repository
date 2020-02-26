import GameObjects.Ball;
import GameObjects.Player;
import Grid.Grid;

public class Game {

    //-----PROPERTIES-----//
    private Grid grid;
    private Player player1;
    private Player player2;
    private Ball ball;

    //-----CONSTRUCTOR-----//
    public Game(int col, int row){
        grid = new Grid(col, row);
        player1 = new Player(Grid.getPADDING()*2, Grid.getPADDING());
        player2 = new Player(Grid.getPADDING()*5, Grid.getPADDING());
        ball = new Ball(grid.getCols()/2, grid.getRows()/2);
    }

    //-----METHODS-----//

}
