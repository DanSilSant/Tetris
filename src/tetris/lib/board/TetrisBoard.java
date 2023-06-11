/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tetris.lib.board;

import java.awt.Graphics;
import java.util.ArrayList;
import java.util.Random;
import tetris.lib.blocks.Block;
import tetris.lib.blocks.BlockMatrix;
import tetris.lib.blocks.Empty;
import tetris.lib.pieces.Piece;
import tetris.lib.pieces.PieceI;
import tetris.lib.pieces.PieceJ;
import tetris.lib.pieces.PieceL;
import tetris.lib.pieces.PieceO;
import tetris.lib.pieces.PieceS;
import tetris.lib.pieces.PieceT;
import tetris.lib.pieces.PieceZ;

/**
 *
 * @author danie
 */
public  class TetrisBoard extends BlockMatrix {

    protected Piece current;
    
    protected Piece shadow;

    protected ArrayList<Piece> arrayP;

    protected Piece hold;
    
    protected int trocar;

    @Override
    public void paintComponent(Graphics g) {
        draw(g, 0, 0, getWidth(), getHeight());
    }

    @Override
    public void draw(Graphics gr, int px, int py, int width, int height) {
        super.draw(gr, px, py, width, height);
        int sizeX = width / getColumns();
        int sizeY = height / getLines();
        current.draw(gr, px + current.getColuna() * sizeX,
                py + current.getLinha() * sizeY,
                sizeX * current.getColumns(),
                sizeY * current.getLines());
    }
//construtor por defeito
    public TetrisBoard() {
        this(20, 10);
    }
//construtor que recebe matriz de blocos 
    public TetrisBoard(Block[][] mat,Piece current) {
        super(mat);
               
    }
//construtor cópia
    public TetrisBoard(TetrisBoard board) {
        this(board.matrix,board.current);
    }
    
//gera novo tabuleiro dado linhas e colunas,e gera novas peças
    public TetrisBoard(int lines, int cols) {
        resize(lines,cols);
        generateArrayPiece();
    }
//cria nova matriz 
    @Override
    public void resize(int lines,int cols){
     //preencher a matriz com blocos vazios
        this.matrix = new Block[lines][cols];
        for (int l = 0; l < lines; l++) {
            for (int c = 0; c < cols; c++) {
                matrix[l][c] = new Empty();
            }
        }
        
        
    }
//gera nova peça aleatoriamente
    public void generateRandomPiece() {
        //gerador de numeros aleatótios
        Random rnd = new Random();
        //escolhe a peça de acordo com o rnd
        switch (rnd.nextInt(7)) {
            case 0 ->
                this.current = new PieceI();
            case 1 ->
                this.current = new PieceJ();
            case 2 ->
                this.current = new PieceL();
            case 3 ->
                this.current = new PieceO();
            case 4 ->
                this.current = new PieceS();
            case 5 ->
                this.current = new PieceT();
            case 6 ->
                this.current = new PieceZ();
        }
        repaint();

    }
    //gera array de peças
        public ArrayList<Piece> generateArrayPiece(){
        arrayP = new ArrayList<>();
        for (int i = 0; i < 4; i++) {
            generateRandomPiece();
             arrayP.add(this.current);
             current = arrayP.get(0);
        }
        return arrayP;           
    }
    //remove peça
    public void removePiece(){
        arrayP.remove(0);
        generateRandomPiece();
        arrayP.add(current);
        current = arrayP.get(0);
        revalidate();
    }
    
    
//desenha peça no tabuleiro
public void freezePiece() {
        for (int l = 0; l < current.getLines(); l++) {
            for (int c = 0; c < current.getColumns(); c++) {
                if (".".equals(matrix[current.getLinha() + l][current.getColuna() + c].toString())) {
                    this.matrix[current.getLinha() + l][current.getColuna() + c]
                            = current.getMatrix()[l][c].getClone();
                }
            }
        }
        
        repaint();
    }

    @Override
    public String toString() {
        TetrisBoard clone = new TetrisBoard(this);
        clone.freezePiece();
        String txt = "";
        for (int l = 0; l < clone.matrix.length; l++) {
            for (int c = 0; c < clone.matrix[l].length; c++) {
                txt += clone.matrix[l][c];
            }
            txt += "\n";
        }
        return txt;
    }
//Verifica se o movimento é legal
    public boolean canMovePiece(int dy, int dx) {
        int newX = current.getColuna() + dx;
        int newY = current.getLinha() + dy;
        //indices negativos
        if (newX < 0) {
            return false;
        }

        //verificar a direita
        if (newX + current.getColumns() > getColumns()) {
            return false;
        }

        //verificar o fundo
        if (newY + current.getLines() > getLines()) {
            return false;
        }

        //verificar se cada bloco do current tem peças vazias
        for (int l = 0; l < current.getLines(); l++) {
            for (int c = 0; c < current.getColumns(); c++) {
                //se o bloco da peça não for vazio
                if (!".".equals(current.getMatrix()[l][c].toString())) {
                    //se o bloco da matriz para onde o bloco se vai deslocar não for vazio, retorna falso
                    if (!(".").equals(this.matrix[newY + l][newX + c].toString())) {
                        return false;
                    }
                }
            }

        }

        //no tabuleiro
        return true;
    }
//Verifica se a peça pode ser rodada
    public boolean canRotatePiece() {
        Piece clone = current.getClone();
        //rotate clone
        clone.rotate();
        //piece is outside board
        if (clone.getColuna() + clone.getColumns() > getColumns()) {
            return false;
        }
        for (int l = 0; l < clone.getLines(); l++) {
            for (int c = 0; c < clone.getColumns(); c++) {
                if (!".".equals(clone.getMatrix()[l][c].toString())) {
                    if (!(".").equals(this.matrix[clone.getLinha() + l][clone.getColuna() + c].toString())) {
                        return false;
                    }

                }

            }
        }
        // Can Rotate
        return true;

    }
//Move peça para esquerda
    public void moveLeft() {
        if (canMovePiece(0, -1)) {
            current.moveLeft();
            revalidate();
            repaint();
            
        }
    }
//Move peça para direita
    public void moveRight() {
        if (canMovePiece(0, 1)) {
            current.moveRight();
            revalidate();
            repaint();
            
        }
    }
//Move peça para baixo
    public void moveDown() {
        if (canMovePiece(1, 0)) {
            current.moveDown();
            this.revalidate();
            this.repaint();
            
       
            
        } else {
            //caso não seja possível deslocar para baixo
            //congela a peça na matriz e gera a próxima peça
            freezePiece();
            removePiece();
            revalidate();
            repaint();
        }
    }
//Faz cair peça
    public void fallDown() {
        while (canMovePiece(1, 0)) {
            current.moveDown();
            revalidate();
            repaint();
            
        }
        //quando a peça não se pode deslocar mais para baixo
        //congela a peça na matriz e gera a próxima peça
        freezePiece();
        removePiece();
        repaint();
    }
//roda peça
    @Override
    public void rotate() {
        if (canRotatePiece()) {
            current.rotate();
            repaint();
        }

    }
//Guarda peça(mete em hold)
    public void savePiece() {

        if (hold == null) {
            hold = current;
            trocar++;
            removePiece();
            revalidate();
            repaint();
        } else {
            if (trocar == 0) {
                trocar++;
                Piece aux = current;
                current = hold;
                hold = aux;
                current.setLinha(0);
                current.setColuna(0);
                revalidate();
                repaint();
            }

        }
    }

    public Piece getCurrent() {
        return current;
    }

    public void setCurrent(Piece current) {
        this.current = current;
    }
    //devolve próxima peça
    public Piece nextP(){
        return arrayP.get(1);
    }
    

}
