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
public class PieceZ extends Piece {

    public PieceZ() {
        super(new Block[][]{{
            new Block('Z',Color.RED),
            new Block('Z',Color.RED),
            new Empty()},
        {
            new Empty(),
            new Block('Z',Color.RED),
            new Block('Z',Color.RED)
        }
        }, 0, 0);

    }
}
