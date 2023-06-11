/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tetris.lib.blocks;

import java.awt.Color;
import java.awt.Graphics;
import java.io.Serializable;
import javax.swing.JComponent;

/**
 *
 * @author danie
 */
public class Block extends JComponent implements Drawable,Serializable {

     private char txt;
     private Color myColor;

    @Override
    public void paintComponent(Graphics gr){
        super.paintComponent(gr); //build component
        draw(gr, 0, 0, getWidth()-1, getHeight()-1);
    }
     @Override
    public void draw(Graphics gr, int px, int py, int width, int height) {
    //color of fill
        gr.setColor(myColor);
        //fill block
        gr.fill3DRect(px, py, width, height,true);
     
        //color of line
        gr.setColor(Color.BLACK);
        //draw line
        gr.draw3DRect(px, py, width, height,true);
    }

    public Block(char ch, Color color) {
        this.txt = ch;
        this.myColor = color;
    }

    public Block(Block b) {
        this(b.txt, b.myColor);
    }
    
    public Block(){
         this(' ', Color.BLUE);
     }
    
    public Block(char ch) {
        this(ch, Color.GREEN);
    }

    public char getTxt() {
        return txt;
    }

    public void setTxt(char txt) {
        this.txt = txt;
    }

    @Override
    public String toString() {
        return String.valueOf(txt);
    }

    public Block getClone() {
        return new Block(this);
    }

    public Color getMyColor() {
        return myColor;
    }

    public void setMyColor(Color myColor) {
        this.myColor = myColor;
    }

}
