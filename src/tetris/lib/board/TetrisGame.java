package tetris.lib.board;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */


import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.TimerTask;
import javax.swing.Timer;
import tetris.lib.blocks.Empty;
import tetris.lib.board.TetrisBoard;
/**
 *
 * @author danie
 */
public final class TetrisGame extends TetrisBoard {

 

    Timer timer;
    tetris.lib.board.TetrisBoard tetris;

 

    public TetrisGame() {
        super();
         ActionListener actionListener = new ActionListener() {
      public void actionPerformed(ActionEvent actionEvent) {
          tetris.fallDown();
      }
    };
        timer = new Timer(5,actionListener);
        startGame(200);
    }

 

    public void startGame(int delay) {
        timer.schedule(new MoveGame(), 0, delay);
    }

 

    public void stopGame() {
        timer.cancel();
        //.........

 

    }

 

    public boolean isGameOver() {
        return current.getLinha() == 0 //esta no top
                && !canMovePiece(1, 0); //não pode descer

 

    }

 

    private class MoveGame extends TimerTask {

 

        @Override
        public void run() {
            requestFocus();
            if (isGameOver()) {
                stopGame();
            } else if (canMovePiece(1, 0)) {
                moveDown();
            } else {
                freezePiece();
                generateRandomPiece();

 

            }
        }

 

    }

 

    public boolean isLineFull(int line) {
        for (int x = 0; x < matrix[line].length; x++) {
            if (matrix[line][x] instanceof Empty) {
                return false;
            }
        }
        return true;

 

    }

 

    public void deleteLine(int line) {
        //fall down all columns above line
        for (int y = line; y > 0; y--) //copy line y
        {
            for (int x = 0; x < matrix[y].length; x++) {
                matrix[y][x] = matrix[y - 1][x];
            }
        }
        //put an empty line in the first line
        for (int x = 0; x < matrix[0].length; x++) {
            matrix[0][x] = new Empty();
        }
    }
    
    public void deleteFullLines(){
        //iterate lines from bottom
        for(int y = matrix.length-1 ; y > 0; y--){
            //verify if line is full
            while( isLineFull(y)){
                //delete line
                deleteLine(y);
            } 
        }
        
    }
    
    @Override
    public void freezePiece() {
        //call freeze of board
        super.freezePiece();
        //delete lines
        deleteFullLines();
    }
    
    

 

}