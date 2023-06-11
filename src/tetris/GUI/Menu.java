/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package tetris.GUI;

import java.awt.Frame;
import java.awt.Image;
import java.io.IOException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.sound.sampled.Clip;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.UIManager;

/**
 *
 * @author danie
 */
public class Menu extends javax.swing.JFrame {
   ArrayList<String> sounds = new ArrayList<String>();
    /**
     * Creates new form Menu
     */
    public Menu() {
        initComponents();
    }
    

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        LblTetrisVer = new javax.swing.JLabel();
        BtnRules = new javax.swing.JButton();
        BtnAbout = new javax.swing.JButton();
        BtnPlay = new javax.swing.JButton();
        IconTetris = new javax.swing.JLabel();
        BtnAbout1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Text Tetris");

        LblTetrisVer.setFont(new java.awt.Font("Futura", 0, 18)); // NOI18N
        LblTetrisVer.setText("Tetris ver 500.10");

        BtnRules.setFont(new java.awt.Font("Futura", 0, 18)); // NOI18N
        BtnRules.setText("Regras do jogo");
        BtnRules.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnRulesActionPerformed(evt);
            }
        });

        BtnAbout.setFont(new java.awt.Font("Futura", 0, 18)); // NOI18N
        BtnAbout.setText("Acerca de ...");
        BtnAbout.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnAboutActionPerformed(evt);
            }
        });

        BtnPlay.setFont(new java.awt.Font("Futura", 0, 18)); // NOI18N
        BtnPlay.setText("Jogar");
        BtnPlay.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnPlayActionPerformed(evt);
            }
        });

        IconTetris.setIcon(new javax.swing.ImageIcon(getClass().getResource("/tetris/images/tetris.jpg"))); // NOI18N
        IconTetris.setText("jLabel1");

        BtnAbout1.setFont(new java.awt.Font("Futura", 0, 18)); // NOI18N
        BtnAbout1.setText("Sair");
        BtnAbout1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnAbout1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addComponent(IconTetris, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(LblTetrisVer)
                .addContainerGap(36, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(BtnPlay, javax.swing.GroupLayout.PREFERRED_SIZE, 203, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(BtnRules, javax.swing.GroupLayout.PREFERRED_SIZE, 203, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(BtnAbout1, javax.swing.GroupLayout.PREFERRED_SIZE, 203, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(BtnAbout, javax.swing.GroupLayout.PREFERRED_SIZE, 203, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(49, 49, 49))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(34, 34, 34)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(IconTetris)
                    .addComponent(LblTetrisVer, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(BtnPlay, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(5, 5, 5)
                .addComponent(BtnRules, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(BtnAbout, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(BtnAbout1, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(24, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void BtnRulesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnRulesActionPerformed
        // TODO add your handling code here:
        this.dispose();
        new Rules().setVisible(true);
    }//GEN-LAST:event_BtnRulesActionPerformed

    private void BtnAboutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnAboutActionPerformed
        // TODO add your handling code here:
        this.dispose();
        new About().setVisible(true);
    }//GEN-LAST:event_BtnAboutActionPerformed

    private void BtnPlayActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnPlayActionPerformed
        // TODO add your handling code here:
        
       this.dispose();
        new GraphicTetris().setVisible(true);
       
        
    }//GEN-LAST:event_BtnPlayActionPerformed

    private void BtnAbout1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnAbout1ActionPerformed
        // TODO add your handling code here:
        this.dispose();
    }//GEN-LAST:event_BtnAbout1ActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Menu().setVisible(true);
            }
        });
    }
    
    
    public void play(){
        try{
        sounds.add("tetris/sounds/stfo.wav");
        sounds.add("tetris/sounds/stetris.wav");
        for (int i = 0; i < sounds.size(); i++) {
            Clip sound = soundBoard.loadResourceSound(sounds.get(i));
            sound.start();
            while(sound.getMicrosecondLength() != sound.getMicrosecondPosition())
{
}
            
        }
        }catch(Exception e){}
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BtnAbout;
    private javax.swing.JButton BtnAbout1;
    private javax.swing.JButton BtnPlay;
    private javax.swing.JButton BtnRules;
    private javax.swing.JLabel IconTetris;
    private javax.swing.JLabel LblTetrisVer;
    // End of variables declaration//GEN-END:variables
}
