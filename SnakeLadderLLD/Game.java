package SnakeLadderLLD;

import java.util.Deque;
import java.util.LinkedList;

public class Game {
    Board board;
    Dice dice;
    Deque<Player> playersList = new LinkedList<>();
    Player winner;
    public Game(){
        System.out.println("Initializing....");
        initialize();
    }
    public void initialize(){
        System.out.println("Inside intializtion...");
        board = new Board(10, 5, 4);
        System.out.println("Board is ready");
        dice = new Dice(1);
        System.out.println("dice is ready....");
        winner=null;
        addPlayer();
    }

    public void addPlayer(){
        Player player1 = new Player("p1", 0);
        Player player2 = new Player("p2", 0);
        playersList.add(player1);
        playersList.add(player2);
    }

    public void startGame(){
        System.out.println("Starting............");
        while (winner==null) {
            Player playerTurn = findPlayerTurn();
            System.out.println("player turn is:" + playerTurn.id + " current position is: " + playerTurn.currentPosition);
            int diceCount = dice.diceRoll();
            int playerNewPosition = playerTurn.currentPosition+diceCount;
            playerNewPosition=jumpCheck(playerNewPosition);
            playerTurn.currentPosition=playerNewPosition;
             System.out.println("player turn is:" + playerTurn.id + " new Position is: " + playerNewPosition);

            if(playerNewPosition>=board.cells.length*board.cells.length-1){
                System.out.println("player "+playerTurn.id+" is winner");
                winner=playerTurn;
            }

        }
    }    

    private Player findPlayerTurn(){
        Player playerTurn = playersList.removeFirst();
        playersList.addLast(playerTurn);
        return playerTurn;
    }


    public int jumpCheck(int playerPosition){
        if(playerPosition>board.cells.length*board.cells.length-1){
            return playerPosition;
        }
        Cells cell = board.getCell(playerPosition);
        System.out.println();
        if(cell!=null && cell.jump!=null && cell.jump.start==playerPosition){
            String jumpBy = (cell.jump.start<cell.jump.end)?"Ladder":"Snake";
            System.out.println("jump done by: " + jumpBy);
            return cell.jump.end;
        }
        return playerPosition;
    }
}
