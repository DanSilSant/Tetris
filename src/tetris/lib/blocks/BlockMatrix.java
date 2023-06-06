/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tetris.lib.blocks;

import java.awt.Graphics;
import javax.swing.JPanel;

/**
 *
 * @author danie
 */
public class BlockMatrix extends JPanel implements Drawable {

    protected Block[][] matrix;

    @Override
    public void paintComponent(Graphics g) {
        super.paintComponent(g);
        draw(g, 0, 0, getWidth(), getHeight());
    }

    @Override
    public void draw(Graphics gr, int px, int py, int width, int height) {
        int sizeX = width / getColumns();
        int sizeY = height / getLines();
        for (int y = 0; y < getLines(); y++) {
            for (int x = 0; x < getColumns(); x++) {
                matrix[y][x].draw(gr, px + x * sizeX, py + y * sizeY, sizeX, sizeY);
            }
        }
    }

    public BlockMatrix(Block[][] matrix) {
        int l = matrix.length;
        int c = matrix[0].length;
        this.matrix = new Block[l][c];
        for (int i = 0; i < l; i++) {
            for (int j = 0; j < c; j++) {
                this.matrix[i][j] = matrix[i][j].getClone();
            }

        }
    }

    public BlockMatrix() {
        this.matrix = new Block[1][1];
        this.matrix[0][0] = new Empty();
    }

    public BlockMatrix(BlockMatrix blockMat) {
        this(blockMat.matrix);
    }

    public Block[][] getMatrix() {
        return matrix;
    }

    public int getLines() {
        return matrix.length;
    }

    public int getColumns() {
        return matrix[0].length;
    }

    public void rotate() {
        Block[][] aux = new Block[getColumns()][getLines()];
        //transporta
        for (int l = 0; l < getLines(); l++) {
            for (int c = 0; c < getColumns(); c++) {
                aux[c][l] = matrix[l][c];
            }
        }
        int laux = aux.length;
        int caux = aux[0].length;
        for (int l = 0; l < laux; l++) {
            for (int c = 0; c < caux / 2; c++) {
                Block temp = aux[l][c];
                aux[l][c] = aux[l][caux - c - 1];
                aux[l][caux - c - 1] = temp;
            }
        }
        matrix = aux;
    }

    @Override
    public String toString() {
        StringBuilder str = new StringBuilder();
        for (int i = 0; i < getLines(); i++) {
            for (int j = 0; j < getColumns(); j++) {
                str.append(matrix[i][j]);
            }
            str.append("\n");
        }
        return str.toString();
    }

    public BlockMatrix getClone() {
        return new BlockMatrix(this);
    }

}
