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
public class PieceJ extends Piece{
    public PieceJ() {
        super(new Block[][]{{
            new Block('J',Color.BLUE),
            new Block('J',Color.BLUE),
            new Block('J',Color.BLUE)},
        {
            new Empty(),
            new Empty(),
            new Block('J',Color.BLUE)
        }
        }, 0, 0);

    }
}
