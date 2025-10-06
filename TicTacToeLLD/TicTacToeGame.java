package TicTacToeLLD;

import java.security.cert.PKIXReason;
import java.util.Deque;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

import TicTacToeLLD.model.Board;
import TicTacToeLLD.model.Pair;
import TicTacToeLLD.model.PieceType;
import TicTacToeLLD.model.Player;
import TicTacToeLLD.model.PlayingPieceO;
import TicTacToeLLD.model.PlayingPieceX;

public class TicTacToeGame {
    Deque<Player> players;
    Board gameBoard;
    public void initialize(){
        players = new LinkedList<>();
        PlayingPieceO playingPieceO = new PlayingPieceO(PieceType.O);
        Player player1 = new Player("player1", playingPieceO);
        PlayingPieceX playingPieceX = new PlayingPieceX(PieceType.X);
        Player player2 = new Player("player2", playingPieceX);
        players.add(player1);
        players.add(player2);
        gameBoard = new Board(3);
    }

     public String startGame(){

        boolean noWinner = true;
        while(noWinner){

           
            Player playerTurn = players.removeFirst();

           
            gameBoard.printBoard();
            List<Pair> freeSpaces =  gameBoard.getFreeSpace();
            if(freeSpaces.isEmpty()) {
                noWinner = false;
                continue;
            }

            System.out.print("Player:" + playerTurn.getName() + " Enter row,column: ");
            Scanner inputScanner = new Scanner(System.in);
            String s = inputScanner.nextLine();
            String[] values = s.split(",");
            int inputRow = Integer.valueOf(values[0]);
            int inputColumn = Integer.valueOf(values[1]);


            
            boolean pieceAddedSuccessfully = gameBoard.addPiece(inputRow,inputColumn, playerTurn.getPlayingPiece());
            if(!pieceAddedSuccessfully) {
                
                System.out.println("Incorredt possition chosen, try again");
                players.addFirst(playerTurn);
                continue;
            }
            players.addLast(playerTurn);

            boolean winner = isThereWinner(inputRow, inputColumn, playerTurn.getPlayingPiece().getPieceType());
            if(winner) {
                return playerTurn.getName();
            }
        }

        return "tie";
    }

    public boolean isThereWinner(int row, int column, PieceType pieceType) {

        boolean rowMatch = true;
        boolean columnMatch = true;
        boolean diagonalMatch = true;
        boolean antiDiagonalMatch = true;

   
        for(int i=0;i<gameBoard.getSize();i++) {

            if(gameBoard.getPlayingPieceArr()[row][i] == null || gameBoard.getPlayingPieceArr()[row][i].getPieceType() != pieceType) {
                rowMatch = false;
            }
        }


        for(int i=0;i<gameBoard.getSize();i++) {

            if(gameBoard.getPlayingPieceArr()[i][column] == null || gameBoard.getPlayingPieceArr()[i][column].getPieceType() != pieceType) {
                columnMatch = false;
            }
        }

    
        for(int i=0, j=0; i<gameBoard.getSize();i++,j++) {
            if (gameBoard.getPlayingPieceArr()[i][j] == null || gameBoard.getPlayingPieceArr()[i][j].getPieceType() != pieceType) {
                diagonalMatch = false;
            }
        }

      
        for(int i=0, j=gameBoard.getSize()-1; i<gameBoard.getSize();i++,j--) {
            if (gameBoard.getPlayingPieceArr()[i][j] == null || gameBoard.getPlayingPieceArr()[i][j].getPieceType() != pieceType) {
                antiDiagonalMatch = false;
            }
        }

        return rowMatch || columnMatch || diagonalMatch || antiDiagonalMatch;
    }


}
