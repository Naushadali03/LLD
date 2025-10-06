package TicTacToeLLD.model;

import java.util.ArrayList;
import java.util.List;

public class Board {
    int size;
    public int getSize() {
        return size;
    }
    public void setSize(int size) {
        this.size = size;
    }
    public PlayingPiece[][] getPlayingPieceArr() {
        return playingPieceArr;
    }
    public void setPlayingPieceArr(PlayingPiece[][] playingPieceArr) {
        this.playingPieceArr = playingPieceArr;
    }
    PlayingPiece[][] playingPieceArr;
    public Board(int size){
        this.size=size;
        playingPieceArr = new PlayingPiece[size][size];
    }
    public boolean addPiece(int row,int col,PlayingPiece playingPiece){
            if(playingPieceArr[row][col]!=null) return false;
            playingPieceArr[row][col]=playingPiece;
            return true;
    }
    public List<Pair> getFreeSpace(){
            List<Pair> freeSpace = new ArrayList<>();
            for(int i=0;i<size;i++){
                for(int j=0;j<size;j++){
                    if(playingPieceArr[i][j]==null){
                        Pair pair = new Pair(i, j);
                        freeSpace.add(pair);
                    }
                }
            }
            return freeSpace;
    }
    public void printBoard(){
        for(int i=0;i<size;i++){
            for(int j=0;j<size;j++){
                if(playingPieceArr[i][j]!=null){
                    System.out.print(playingPieceArr[i][j].pieceType.name()+" ");
                }
                else{
                    System.out.print("     ");
                }
                System.out.print(" | ");
            }
            System.out.println();
        }
    }
}
