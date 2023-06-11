package tetris.lib.board;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Objects;
import java.util.TimerTask;
import java.util.Timer;
import javax.sound.sampled.Clip;
import tetris.lib.blocks.Empty;
import tetris.GUI.GraphicTetris;
import tetris.lib.blocks.Block;
import static tetris.lib.blocks.soundBoard.loadResourceSound;
import tetris.lib.pieces.Piece;

/**
 *
 * @author danie
 */
public  class TetrisGame extends TetrisBoard implements Serializable {

    protected TetrisBoard board;

    protected GraphicTetris gt;

    transient protected Timer timer;

    protected int delay;

    protected int pontos;

    transient protected ArrayList<String> sounds;

    transient protected Clip sound;

    //construtor por defeito
    public TetrisGame() {
        this(20, 10, 1000);
    }

    //construtor cópia
    public TetrisGame(TetrisGame t) {
        this(t.matrix, t.arrayP, t.hold, t.pontos, t.delay);
        this.gt = t.gt;

    }

    //construtor com parâmetros
    public TetrisGame(int lines, int columns, int delay) {
        this.board = new TetrisBoard(lines, columns);
        this.timer = new Timer();
        this.delay = delay;
        startGame(this.delay);
        play(2);

    }

    //construtor de load sem peça em espera
    public TetrisGame(Block[][] bm, ArrayList<Piece> arrayP, int pontos, int SavedDelay) {
        super(bm, arrayP.get(0));
        current = arrayP.get(0);
        this.pontos = pontos;
        this.arrayP = arrayP;
        this.delay = SavedDelay;
        timer = new Timer();
        startGame(this.delay);
        play(2);
    }

    //construtor de load com peça em espera
    public TetrisGame(Block[][] bm, ArrayList<Piece> arrayP, Piece hold, int pontos, int SavedDelay) {
        super(bm, arrayP.get(0));
        current = arrayP.get(0);
        this.arrayP = arrayP;
        this.pontos = pontos;
        this.hold = hold;
        this.delay = SavedDelay;

        timer = new Timer();
        startGame(this.delay);
        play(2);
    }

    //cria um clone
    public TetrisGame getClone() {
        matrix = this.matrix;
        ArrayList<Piece> p = new ArrayList();
        for (Piece a : this.arrayP) {
            p.add(a.getClone());
        }
        if (!Objects.isNull(hold)) {
            Piece e = hold.getClone();
            return new TetrisGame(matrix, p, e, this.pontos, this.delay);
        } else {
            return new TetrisGame(matrix, p, this.pontos, this.delay);
        }

    }

    //guarda o jogo em ficheiro
    public void save(String fileName) throws Exception {
        ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream(fileName));
        out.writeObject(this.getClone());
        out.close();
    }

    //carrega o jogo de um ficheiro
    public static TetrisGame load(String matrix) throws IOException, ClassNotFoundException {
        try ( ObjectInputStream in = new ObjectInputStream(
                new FileInputStream(matrix))) {
            return (TetrisGame) in.readObject();
        }
    }

    //começa o jogo
    public void startGame(int delay) {
        timer.schedule(new MoveGame(), 1000, delay);
    }
    
    //get do delay
    public int getDelay() {
        return this.delay;
    }

    //para o jogo cancelando o timer
    public void stopGame() {
        timer.cancel();
        //.........
    }

    //retoma o jogo
    public void unpauseGame(int delay) {
        timer = new Timer();
        timer.schedule(new MoveGame(), 200, delay);
        //.........
    }

    //verifica se o jogo acabou
    public boolean isGameOver() {
        return current.getLinha() == 0 //esta no top
                && !canMovePiece(1, 0); //não pode descer

    }

    //set do GraphicTetris
    public void setGt(GraphicTetris gt) {
        this.gt = gt;
    }

    //class MoveGame responsável por automatizar o jogo
    private class MoveGame extends TimerTask {

        @Override
        public void run() {
            try {
                gt.showP();

            } catch (Exception e) {
            }
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
                removePiece();
                gt.revalidate();
                gt.repaint();

            }
        }

    }
    
    //verifica se a linha está completa
    public boolean isLineFull(int line) {
        for (int x = 0; x < matrix[line].length; x++) {
            if (matrix[line][x] instanceof Empty) {
                return false;
            }
        }
        pontos++;
        if (pontos % 10 == 0) {
            play(3);
        } else {
            play(0);
        }
        gt.text("Pontuação: " + pontos);
        return true;

    }

    //get dos pontos
    public int getPontos() {
        return this.pontos;
    }

    //apaga a linha completa e faz fall down nas linhas acima
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

    //apaga as linhas completas
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
    //congela a peça, apaga a linha e altera a flag trocar
    public void freezePiece() {

        setTrocar(0);
        //call freeze of board
        super.freezePiece();

        //delete lines
        deleteFullLines();
    }

    //get do hold
    public Piece getHold() {
        return this.hold;
    }

    //set do piece
    public void setPiece(Piece piece) {
        this.hold = piece;
    }

    //get do trocar
    public int getTrocar() {
        return trocar;
    }
    
    //set do trocar
    public void setTrocar(int troca) {
        this.trocar = troca;
        System.out.println(this.trocar);
    }

    //cria o array de strings com o path e reproduz sons
    public void play(int i) {
        sounds = new ArrayList<String>();
        try {
            sounds.add("tetris/sounds/clear.wav");
            sounds.add("tetris/sounds/stetris.wav");
            sounds.add("tetris/sounds/tetris-beatbox.wav");
            sounds.add("tetris/sounds/tetris-success.wav");
            sounds.add("tetris/sounds/tfs-krillin-and-tetris.wav");

            sound = loadResourceSound(sounds.get(i));
            if (!sound.isRunning()) {
                sound.start();
            }
        } catch (Exception e) {
        }
    }
    //para os sons
    public void stopSound() {
        sound.stop();
    }
}
