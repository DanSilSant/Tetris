/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package testes;

import tetris.lib.board.TetrisBoard;

/**
 *
 * @author danie
 */
public class TestBoard {
    public static void main(String[] args) {
        TetrisBoard tetris = new TetrisBoard(20,20);
        System.out.println(tetris);
        tetris.moveRight();
        tetris.moveRight();
        tetris.rotate();
        System.out.println(tetris);
    }
   
}
