/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tetris.lib.blocks;

import java.awt.Color;

/**
 *
 * @author danie
 */
public class Empty extends Block {
    public Empty(){
        super('.',Color.WHITE);
    }
    
    /**
     *
     * @return
     */
    @Override
    public Block getClone(){
        return new Empty();
    }
}
