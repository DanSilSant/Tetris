/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package tetris.GUI;

import java.awt.Dimension;
import java.awt.event.KeyEvent;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import tetris.lib.board.TetrisBoard;
import tetris.lib.board.TetrisGame;




/**
 *
 * @author danie
 */
public class GraphicTetris extends javax.swing.JFrame {
    
    

    public GraphicTetris() {
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

        LblLinhas = new javax.swing.JLabel();
        LblColunas = new javax.swing.JLabel();
        btnCreateGame = new javax.swing.JButton();
        btnLeft = new javax.swing.JButton();
        btnRight = new javax.swing.JButton();
        BtnRotate = new javax.swing.JButton();
        BtnDown = new javax.swing.JButton();
        btnFallDown = new javax.swing.JButton();
        SpnLinha = new javax.swing.JSpinner();
        SpnColuna = new javax.swing.JSpinner();
        BtnMenu = new javax.swing.JButton();
        tetrisGame1 = new tetris.lib.board.TetrisGame(GraphicTetris.this);
        jLabel1 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Text Tetris");
        addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                formKeyPressed(evt);
            }
        });

        LblLinhas.setFont(new java.awt.Font("Consolas", 0, 18)); // NOI18N
        LblLinhas.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        LblLinhas.setText("Linhas");
        LblLinhas.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        LblColunas.setFont(new java.awt.Font("Consolas", 0, 18)); // NOI18N
        LblColunas.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        LblColunas.setText("Colunas");

        btnCreateGame.setFont(new java.awt.Font("Tw Cen MT", 0, 18)); // NOI18N
        btnCreateGame.setText("Criar tabuleiro");
        btnCreateGame.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCreateGameActionPerformed(evt);
            }
        });
        btnCreateGame.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                btnCreateGameKeyPressed(evt);
            }
        });

        btnLeft.setIcon(new javax.swing.ImageIcon(getClass().getResource("/tetris/images/esquerda.jpg"))); // NOI18N
        btnLeft.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnLeft.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLeftActionPerformed(evt);
            }
        });
        btnLeft.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                btnLeftKeyPressed(evt);
            }
        });

        btnRight.setIcon(new javax.swing.ImageIcon(getClass().getResource("/tetris/images/direita.jpg"))); // NOI18N
        btnRight.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnRight.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRightActionPerformed(evt);
            }
        });
        btnRight.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                btnRightKeyPressed(evt);
            }
        });

        BtnRotate.setIcon(new javax.swing.ImageIcon(getClass().getResource("/tetris/images/rotate.jpg"))); // NOI18N
        BtnRotate.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        BtnRotate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnRotateActionPerformed(evt);
            }
        });
        BtnRotate.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                BtnRotateKeyPressed(evt);
            }
        });

        BtnDown.setIcon(new javax.swing.ImageIcon(getClass().getResource("/tetris/images/baixo.jpg"))); // NOI18N
        BtnDown.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        BtnDown.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnDownActionPerformed(evt);
            }
        });
        BtnDown.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                BtnDownKeyPressed(evt);
            }
        });

        btnFallDown.setFont(new java.awt.Font("Tw Cen MT", 0, 18)); // NOI18N
        btnFallDown.setText("S P A C E");
        btnFallDown.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnFallDown.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnFallDownActionPerformed(evt);
            }
        });
        btnFallDown.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                btnFallDownKeyPressed(evt);
            }
        });

        SpnLinha.setFont(new java.awt.Font("Consolas", 0, 18)); // NOI18N
        SpnLinha.setModel(new javax.swing.SpinnerNumberModel(10, 6, null, 1));
        SpnLinha.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        SpnColuna.setFont(new java.awt.Font("Consolas", 0, 18)); // NOI18N
        SpnColuna.setModel(new javax.swing.SpinnerNumberModel(10, 6, null, 1));
        SpnColuna.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        BtnMenu.setFont(new java.awt.Font("Tw Cen MT", 0, 18)); // NOI18N
        BtnMenu.setText("Sair para o Menu");
        BtnMenu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnMenuActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout tetrisGame1Layout = new javax.swing.GroupLayout(tetrisGame1);
        tetrisGame1.setLayout(tetrisGame1Layout);
        tetrisGame1Layout.setHorizontalGroup(
            tetrisGame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 447, Short.MAX_VALUE)
        );
        tetrisGame1Layout.setVerticalGroup(
            tetrisGame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
        );

        jLabel1.setForeground(new java.awt.Color(255, 51, 51));

        jButton1.setText("Guardar Jogo");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                            .addGap(20, 20, 20)
                            .addComponent(btnLeft, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(BtnDown, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(btnRight, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addComponent(BtnRotate, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(btnCreateGame, javax.swing.GroupLayout.PREFERRED_SIZE, 196, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(SpnLinha, javax.swing.GroupLayout.DEFAULT_SIZE, 88, Short.MAX_VALUE)
                                    .addComponent(LblLinhas, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(LblColunas, javax.swing.GroupLayout.DEFAULT_SIZE, 90, Short.MAX_VALUE)
                                    .addComponent(SpnColuna))))
                        .addComponent(btnFallDown, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 196, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(BtnMenu, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 196, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(35, 35, 35)
                        .addComponent(tetrisGame1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(179, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButton1)
                        .addGap(290, 290, 290))))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(128, 128, 128))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(31, 31, 31)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(LblColunas, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(LblLinhas, javax.swing.GroupLayout.DEFAULT_SIZE, 37, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(SpnLinha, javax.swing.GroupLayout.DEFAULT_SIZE, 34, Short.MAX_VALUE)
                            .addComponent(SpnColuna))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnCreateGame, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(69, 69, 69)
                        .addComponent(BtnRotate, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(btnLeft, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(btnRight, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(BtnDown, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(23, 23, 23)
                        .addComponent(tetrisGame1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addComponent(btnFallDown, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(8, 8, 8)
                .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(14, 14, 14)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(BtnMenu, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton1))
                .addGap(22, 22, 22))
        );

        btnCreateGame.setFocusable(false);
        SpnLinha.setValue(10);
        //SpnLinha.setStepSize(8);
        SpnColuna.setValue(10);
        //SpnColuna.setStepSize(4);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnCreateGameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCreateGameActionPerformed
        // TODO add your handling code here:
        int lines = (Integer) SpnLinha.getValue();
        int columns = (Integer) SpnColuna.getValue();
        try {
            //construir o jogo
            tetrisGame1= new TetrisGame(this,TetrisBoard.load(filename)) ;
        } catch (Exception e){
            System.out.println(e);
        
        } 
        
        
        
        
        
        
       
        
        
        
        


    }//GEN-LAST:event_btnCreateGameActionPerformed

    public void gameOver(){
        JOptionPane.showMessageDialog(null, "Jogo acabou!");
    }
    
    public void text(){
        jLabel1.setText("10 pontos para griffyndor!");
    }
    
    
    private void btnRightActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRightActionPerformed
        // TODO add your handling code here:
        tetrisGame1.moveRight();
        this.revalidate();
        this.repaint();
        this.requestFocus();
    }//GEN-LAST:event_btnRightActionPerformed

    private void btnLeftActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLeftActionPerformed
        // TODO add your handling code here:
        tetrisGame1.moveLeft();
        this.revalidate();
        this.repaint();
        this.requestFocus();
    }//GEN-LAST:event_btnLeftActionPerformed

    private void BtnRotateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnRotateActionPerformed
        // TODO add your handling code here:
        tetrisGame1.rotate();
        this.revalidate();
        this.repaint();
        this.requestFocus();
    }//GEN-LAST:event_BtnRotateActionPerformed

    private void BtnDownActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnDownActionPerformed
        // TODO add your handling code here:
        tetrisGame1.moveDown();
        this.revalidate();
        this.repaint();
        this.requestFocus();
    }//GEN-LAST:event_BtnDownActionPerformed

    private void btnFallDownActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnFallDownActionPerformed
        // TODO add your handling code here:
        tetrisGame1.fallDown();
        this.revalidate();
        this.repaint();
        this.requestFocus();
    }//GEN-LAST:event_btnFallDownActionPerformed

    private void BtnMenuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnMenuActionPerformed
        this.dispose();
        new Menu().setVisible(true);
    }//GEN-LAST:event_BtnMenuActionPerformed

    private void BtnRotateKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_BtnRotateKeyPressed
        
    }//GEN-LAST:event_BtnRotateKeyPressed

    private void btnLeftKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_btnLeftKeyPressed
        
    }//GEN-LAST:event_btnLeftKeyPressed

    private void BtnDownKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_BtnDownKeyPressed
        
    }//GEN-LAST:event_BtnDownKeyPressed

    private void btnRightKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_btnRightKeyPressed
       
    }//GEN-LAST:event_btnRightKeyPressed

    private void btnFallDownKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_btnFallDownKeyPressed
        
    }//GEN-LAST:event_btnFallDownKeyPressed

    private void btnCreateGameKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_btnCreateGameKeyPressed
        // TODO add your handling code here:
        
        
        //jogar com o teclado (não está a funcionar
        
        /*int key = evt.getKeyCode();  // Keyboard code for the pressed key.

        if (key == KeyEvent.VK_W || key == KeyEvent.VK_UP) {
            tetris.rotate();

        }if (key == KeyEvent.VK_A || key == KeyEvent.VK_LEFT) {
            tetris.moveLeft();

        }if (key == KeyEvent.VK_S || key == KeyEvent.VK_DOWN) {
            tetris.moveDown();

        }if (key == KeyEvent.VK_D || key == KeyEvent.VK_RIGHT) {
            tetris.moveRight();

        }if (key == KeyEvent.VK_SPACE) {
            tetris.fallDown();

        }if (key == KeyEvent.VK_ENTER) {
            int lines = (Integer) SpnLinha.getValue();
            int columns = (Integer) SpnColuna.getValue();
            //construir o jogo
            this.tetris = new TetrisBoard(lines, columns);

        }*/
    }//GEN-LAST:event_btnCreateGameKeyPressed

    private void formKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_formKeyPressed
             
            if(evt.getKeyCode()==87 || evt.getKeyCode()==38 ){
                
                tetrisGame1.rotate();
                this.revalidate();
        this.repaint();
            }
            if(evt.getKeyCode()==68 || evt.getKeyCode()==39 ){
                tetrisGame1.moveRight();
                this.revalidate();
        this.repaint();
            }
            if(evt.getKeyCode()==65 || evt.getKeyCode()==37 ){
                tetrisGame1.moveLeft();
                this.revalidate();
        this.repaint();
            }
            if(evt.getKeyCode()==83 || evt.getKeyCode()==40 ){
                tetrisGame1.moveDown();
                this.revalidate();
        this.repaint();
            }
            if(evt.getKeyCode()==32){
                tetrisGame1.fallDown();
                this.revalidate();
        this.repaint();
            }
    }//GEN-LAST:event_formKeyPressed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        try {
            // TODO add your handling code here:
            tetrisGame1.save(filename);
        } catch (Exception ex) {
            System.out.println(ex);        }
    }//GEN-LAST:event_jButton1ActionPerformed
    
    /**
     * @param args the command line arguments
     */public static void main(String args[]) {
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
            java.util.logging.Logger.getLogger(GraphicTetris.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(GraphicTetris.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(GraphicTetris.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(GraphicTetris.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                GraphicTetris dialog = new GraphicTetris();
                dialog.addWindowListener(new java.awt.event.WindowAdapter() {
                    @Override
                    public void windowClosing(java.awt.event.WindowEvent e) {
                        System.exit(0);
                    }
                });
                dialog.setVisible(true);
            }
        });
    }
     
    private String filename = "teste.obj";
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BtnDown;
    private javax.swing.JButton BtnMenu;
    private javax.swing.JButton BtnRotate;
    private javax.swing.JLabel LblColunas;
    private javax.swing.JLabel LblLinhas;
    private javax.swing.JSpinner SpnColuna;
    private javax.swing.JSpinner SpnLinha;
    private javax.swing.JButton btnCreateGame;
    private javax.swing.JButton btnFallDown;
    private javax.swing.JButton btnLeft;
    private javax.swing.JButton btnRight;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private tetris.lib.board.TetrisGame tetrisGame1;
    // End of variables declaration//GEN-END:variables
}
