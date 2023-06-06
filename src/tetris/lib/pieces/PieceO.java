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
public class PieceO extends Piece{
    
public PieceO() {
        super(new Block[][]{{
            new Block('O',Color.YELLOW),           
            new Block('O',Color.YELLOW)},
        {
            new Block('O',Color.YELLOW),
            new Block('O',Color.YELLOW),
        }
        }, 0, 0);

    }
}
