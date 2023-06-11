package tetris.lib.board;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */


import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.TimerTask;
import java.util.Timer;
import tetris.lib.blocks.Empty;
import tetris.lib.board.TetrisBoard;
import tetris.GUI.GraphicTetris;
/**
 *
 * @author danie
 */
public final class TetrisGame extends TetrisBoard {

 

    Timer timer;
    GraphicTetris gt;
    int count=0;
    
    

 

<<<<<<< Updated upstream
    public TetrisGame(GraphicTetris gt) {
        super();
        timer = new Timer();
        this.gt=gt;
=======
    public TetrisGame(Block[][] bm, ArrayList<Piece> arrayP, Piece hold) {
        super(bm, arrayP.get(0));
        current=arrayP.get(0);
        this.arrayP=arrayP;
        this.hold=hold;
        timer = new Timer();
>>>>>>> Stashed changes
        startGame(1000);
        
    }

<<<<<<< Updated upstream
 
=======
    public void save(String Matrix, String Piece, String SavedP) throws IOException {
        System.out.println("teste");
        try ( ObjectOutputStream out = new ObjectOutputStream(
                new FileOutputStream(Matrix));) {
            out.writeObject(this.matrix);
        }
        ArrayList<Piece> p = new ArrayList();
        for(Piece a : this.arrayP){
            p.add(a.getClone());
        }
        try ( ObjectOutputStream out = new ObjectOutputStream(
                new FileOutputStream(Piece));) {
            out.writeObject(p);
        }
        try ( ObjectOutputStream out = new ObjectOutputStream(
                new FileOutputStream(SavedP));) {
            out.writeObject(board.hold);
        }

    }

    public static Block[][] loadM(String matrix) throws IOException, ClassNotFoundException {
        try ( ObjectInputStream in = new ObjectInputStream(
                new FileInputStream(matrix))) {
            return (Block[][]) in.readObject();
        }
    }

    public static ArrayList<Piece> loadP(String piece) throws IOException, ClassNotFoundException {
        try ( ObjectInputStream in = new ObjectInputStream(
                new FileInputStream(piece))) {
            return (ArrayList<Piece>) in.readObject();
        }
    }

    public static Piece loadSavedP(String savedP) throws IOException, ClassNotFoundException {
        try ( ObjectInputStream in = new ObjectInputStream(
                new FileInputStream(savedP))) {
            return (Piece) in.readObject();
        }
    }
    
    
>>>>>>> Stashed changes

    public void startGame(int delay) {
        timer.schedule(new MoveGame(), 0 , delay);
    }

 
    public void newGame(int lines, int cols){
        super.resize(lines,cols);
        count=0;
        gt.text("Pontuação: "+count);
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
            
            
            if (isGameOver()) {
                gt.gameOver();
                stopGame();
                
                
            } else if (canMovePiece(1, 0)) {
                
                System.out.println("dwadwadw");
                moveDown();
                gt.revalidate();
                gt.repaint();
                gt.requestFocus();
                
                
                
               
                
                
            } else {
                freezePiece();
                generateRandomPiece();
                gt.revalidate();
                gt.repaint();
                

 

            }
        }

 

    }

 

    public boolean isLineFull(int line) {
        for (int x = 0; x < matrix[line].length; x++) {
            if (matrix[line][x] instanceof Empty) {
                return false;
            }
        }
        count++;
        gt.text("Pontuação: "+count);
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