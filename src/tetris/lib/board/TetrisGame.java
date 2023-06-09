package tetris.lib.board;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.TimerTask;
import java.util.Timer;
import tetris.lib.blocks.Empty;
import tetris.lib.board.TetrisBoard;
import tetris.GUI.GraphicTetris;
import tetris.lib.blocks.Block;
import tetris.lib.pieces.Piece;

/**
 *
 * @author danie
 */
public final class TetrisGame extends TetrisBoard implements Serializable {

    /*Timer timer;
    GraphicTetris gt;
    int pontos=0;
    Piece hold;
    int trocar;*/
    protected TetrisBoard board;

    protected ArrayList<Piece> arrayP;

    protected Piece current;

    protected Piece hold;

    protected GraphicTetris gt;

    protected Timer timer;

    protected int delay;

    protected int trocar;

    protected int pontos;

    public TetrisGame() {
        this(20, 10, 1000);
    }

    public TetrisGame(int lines, int columns, int delay) {
        this.board = new TetrisBoard(lines, columns);
        this.current = board.current;
        this.timer = new Timer();
        startGame(delay);

    }
    
    public TetrisGame(GraphicTetris gt, int lines, int columns, int delay) {
        this.board = new TetrisBoard(lines, columns);
        this.gt = gt;
        this.current = board.current;
        this.timer = new Timer();
        startGame(delay);

    }

    public TetrisGame(GraphicTetris gt, Block[][] bm, Piece p, int trocar) {
        super(bm, p);
        timer = new Timer();
        this.gt = gt;
        startGame(1000);
        setTrocar(trocar);
    }

    public void save(String Matrix, String Piece, String SavedP) throws IOException {
        System.out.println("teste");
        try ( ObjectOutputStream out = new ObjectOutputStream(
                new FileOutputStream(Matrix));) {
            out.writeObject(this.matrix);
        }
        try ( ObjectOutputStream out = new ObjectOutputStream(
                new FileOutputStream(Piece));) {
            out.writeObject(this.current);
        }
        try ( ObjectOutputStream out = new ObjectOutputStream(
                new FileOutputStream(SavedP));) {
            out.writeObject(this.hold);
        }

    }

    public static Block[][] loadM(String matrix) throws IOException, ClassNotFoundException {
        try ( ObjectInputStream in = new ObjectInputStream(
                new FileInputStream(matrix))) {
            return (Block[][]) in.readObject();
        }
    }

    public static Piece loadP(String piece) throws IOException, ClassNotFoundException {
        try ( ObjectInputStream in = new ObjectInputStream(
                new FileInputStream(piece))) {
            return (Piece) in.readObject();
        }
    }

    public static Piece loadSavedP(String savedP) throws IOException, ClassNotFoundException {
        try ( ObjectInputStream in = new ObjectInputStream(
                new FileInputStream(savedP))) {
            return (Piece) in.readObject();
        }
    }

    public void startGame(int delay) {
        timer.schedule(new MoveGame(), 1000, delay);
    }

    public void newGame(int lines, int cols) {
        super.resize(lines, cols);
        pontos = 0;
        gt.text("Pontuação: " + pontos);
    }

    public void savePiece() {

        if (hold == null) {
            hold = current;
            trocar++;
            removePiece();
            gt.revalidate();
            gt.repaint();
        } else {
            if (trocar == 0) {
                trocar++;
                Piece aux = current;
                current = hold;
                hold = aux;
                current.setLinha(0);
                current.setColuna(0);
                gt.revalidate();
                gt.repaint();
            }

        }
    }

    public void stopGame() {
        timer.cancel();
        //.........
    }

    public boolean isGameOver() {
        return current.getLinha() == 0 //esta no top
                && !canMovePiece(1, 0); //não pode descer

    }

    public void setGt(GraphicTetris gt){
        this.gt=gt;
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
        pontos++;
        gt.text("Pontuação: " + pontos);
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

    public void deleteFullLines() {
        //iterate lines from bottom
        for (int y = matrix.length - 1; y > 0; y--) {
            //verify if line is full
            while (isLineFull(y)) {
                //delete line
                deleteLine(y);
            }
        }

    }

    @Override
    public void freezePiece() {
        System.out.println("freeze: " + trocar);
        setTrocar(0);
        //call freeze of board
        super.freezePiece();
        //delete lines
        deleteFullLines();
    }

    public void setPiece(Piece piece) {
        this.hold = piece;
    }

    public int getTrocar() {
        return trocar;
    }

    public void setTrocar(int troca) {
        this.trocar = troca;
        System.out.println(this.trocar);
    }

    
}
