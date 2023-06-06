/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tetris.lib.pieces;

import java.awt.Color;
import tetris.lib.blocks.Block;
import tetris.lib.blocks.Empty;

/**
 *
 * @author danie
 */
public class PieceT extends Piece{
    public PieceT() {
        super(new Block[][]{{
            new Block('T',Color.MAGENTA),
            new Block('T',Color.MAGENTA),
            new Block('T',Color.MAGENTA)},
        {
            new Empty(),
            new Block('T',Color.MAGENTA),   
            new Empty()
        }
        }, 0, 0);

    }
}
