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
public class PieceS extends Piece {

    public PieceS() {
        super(new Block[][]{{
            new Empty(),
            new Block('S',Color.GREEN),
            new Block('S',Color.GREEN)},
        {
            new Block('S',Color.GREEN),
            new Block('S',Color.GREEN),
            new Empty()
        }
        }, 0, 0);

    }
}
