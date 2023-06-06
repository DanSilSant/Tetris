/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tetris.lib.pieces;

import tetris.lib.blocks.Block;
import tetris.lib.blocks.BlockMatrix;

/**
 *
 * @author danie
 */
public class Piece extends BlockMatrix {

    private int linha;
    private int coluna;

    public Piece(Block[][] mat, int linha, int coluna) {
        super(mat);
        this.linha = linha;
        this.coluna = coluna;
    }

    public Piece(Piece p) {
        this(p.matrix, p.linha, p.coluna);
    }

    public void moveLeft() {
        this.coluna--;
    }

    public void moveRight() {
        this.coluna++;
    }

    public void moveDown() {
        this.linha++;
    }

    /**
     *
     * @return
     */
    @Override
    public Piece getClone() {
        return new Piece(this);
    }

    public int getLinha() {
        return linha;
    }

    public void setLinha(int linha) {
        this.linha = linha;
    }

    public int getColuna() {
        return coluna;
    }

    public void setColuna(int coluna) {
        this.coluna = coluna;
    }

    @Override
    public String toString() {
        StringBuilder str = new StringBuilder();
        str.append("piece = (");
        str.append(linha);
        str.append(", ");
        str.append(coluna);
        str.append(")\n");
        str.append(super.toString());
        return str.toString();
    }

}
