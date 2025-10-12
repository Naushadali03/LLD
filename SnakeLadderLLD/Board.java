package SnakeLadderLLD;

import java.util.concurrent.ThreadLocalRandom;

public class Board {
    Cells[][] cells;
    public Board(int boardSize,int numberOfSnake,int numberOfLadder){
        initialize(boardSize);
        addSnakeLadder(cells, numberOfSnake, numberOfLadder);
    }
    public void initialize(int boardSize){
        cells = new Cells[boardSize][boardSize];
        for(int i=0;i<boardSize;i++){
            for(int j=0;j<boardSize;j++){
                Cells cell = new Cells();
                cells[i][j]=cell;
            }
        }
    }
    public void addSnakeLadder(Cells[][] cells,int numberOfSnake,int numberOfLadder){
        while(numberOfLadder>0){
            int snakeHead = ThreadLocalRandom.current().nextInt(1,cells.length*cells.length-1);
            int snakeTail = ThreadLocalRandom.current().nextInt(1,cells.length*cells.length-1);
            if(snakeTail>=snakeHead) continue;
            Jump snakeObj = new Jump();
            snakeObj.start=snakeTail;
            snakeObj.end=snakeHead;
            Cells cells2 = getCell(snakeHead);
            cells2.jump=snakeObj;
            numberOfSnake--;
        }
        while (numberOfLadder>0) {
            int ladderStart = ThreadLocalRandom.current().nextInt(1,cells.length*cells.length-1);
            int ladderEnd = ThreadLocalRandom.current().nextInt(1,cells.length*cells.length-1);
            if(ladderStart>=ladderEnd) continue;
            Jump ladderObj = new Jump();
            ladderObj.start=ladderStart;
            ladderObj.end=ladderEnd;
            Cells cells2 = getCell(ladderStart);
            cells2.jump=ladderObj;
            numberOfLadder--;
        }
    }
    public Cells getCell(int playerPosition){
        int boardRow = playerPosition/cells.length;
        int boardColumn = (playerPosition%cells.length);

        return cells[boardRow][boardColumn];
    }
}
