/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package testes;

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
public class PiecesTest {
    public static void main(String[] args) {
        Piece l = new PieceL();
        System.out.println(l);
        Piece i = new PieceI();
        System.out.println(i);
        i.rotate();
        i.moveDown();
        System.out.println(i);
        Piece j = new PieceJ();
        System.out.println(j);
        j.rotate();
        j.moveDown();
        System.out.println(j);
        Piece o = new PieceO();
        System.out.println(o);
        o.rotate();
        o.moveDown();
        System.out.println(o);
        Piece s = new PieceS();
        System.out.println(s);
        s.rotate();
        s.moveDown();
        System.out.println(s);
        Piece t = new PieceT();
        System.out.println(t);
        t.rotate();
        t.moveDown();
        System.out.println(t);
        Piece z = new PieceZ();
        System.out.println(z);
        z.rotate();
        z.moveDown();
        System.out.println(z);
    l.moveRight();
    }
    
}
