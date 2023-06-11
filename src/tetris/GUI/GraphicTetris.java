/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package tetris.GUI;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Image;
import java.awt.event.KeyEvent;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.JSpinner;
import javax.swing.UIManager;
import tetris.lib.blocks.BlockMatrix;
import tetris.lib.board.TetrisBoard;
import tetris.lib.board.TetrisGame;
import tetris.lib.pieces.Piece;

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
        jLabel1 = new javax.swing.JLabel();
        guardarJogoBtn = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        tetrisGame1 = new tetris.lib.board.TetrisGame();
        loadBtn = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();

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

        jLabel1.setForeground(new java.awt.Color(255, 51, 51));

        guardarJogoBtn.setText("Guardar Jogo");
        guardarJogoBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                guardarJogoBtnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 192, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 112, Short.MAX_VALUE)
        );

        tetrisGame1.setGt(this);

        javax.swing.GroupLayout tetrisGame1Layout = new javax.swing.GroupLayout(tetrisGame1);
        tetrisGame1.setLayout(tetrisGame1Layout);
        tetrisGame1Layout.setHorizontalGroup(
            tetrisGame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 449, Short.MAX_VALUE)
        );
        tetrisGame1Layout.setVerticalGroup(
            tetrisGame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 448, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(tetrisGame1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(tetrisGame1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(40, Short.MAX_VALUE))
        );

        loadBtn.setText("Load");
        loadBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                loadBtnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 182, Short.MAX_VALUE)
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        jLabel2.setFont(new java.awt.Font("Pixeloid Sans", 3, 14)); // NOI18N
        jLabel2.setText("Próxima peça");

        jLabel3.setFont(new java.awt.Font("Pixeloid Sans", 3, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 51, 51));
        jLabel3.setText("Peça Guardada");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE))
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
                        .addComponent(BtnMenu, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 196, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED, 27, Short.MAX_VALUE)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(loadBtn)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 12, Short.MAX_VALUE)
                        .addComponent(guardarJogoBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(128, 128, 128))
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(59, 59, 59))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(87, 87, 87))))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addGap(96, 96, 96)
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(31, 31, 31)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(LblLinhas, javax.swing.GroupLayout.DEFAULT_SIZE, 61, Short.MAX_VALUE)
                            .addComponent(LblColunas, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
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
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnFallDown, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(15, 15, 15)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(106, 106, 106)
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(34, 34, 34)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(14, 14, 14)
                                .addComponent(BtnMenu, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(guardarJogoBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(22, 22, 22))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(loadBtn)
                        .addGap(14, 14, 14))))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 59, Short.MAX_VALUE)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
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
        //construir o jogo
        tetrisGame1.stopGame();
        dispose();
        new GraphicTetris().setVisible(true);
        //tetrisGame1.stopSound();
        tetrisGame1 = new TetrisGame(lines, columns, 350);
        tetrisGame1.setGt(this);
        showH();
        setLabelHold();
        revalidate();
        repaint();
        requestFocus();


    }//GEN-LAST:event_btnCreateGameActionPerformed

    public void gameOver() {
        tetrisGame1.stopSound();
        //tetrisGame1.play(8);
        JOptionPane.showMessageDialog(null, "Jogo acabou!");
        tetrisGame1.stopSound();
        this.dispose();
        new Menu().setVisible(true);
    }

    public void text(String message) {
        jLabel1.setText(message);
    }


    private void btnRightActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRightActionPerformed
        // TODO add your handling code here:
        tetrisGame1.moveRight();
        this.revalidate();
        this.repaint();
        this.requestFocus();
    }//GEN-LAST:event_btnRightActionPerformed
    public void showP() {
        try {
            jPanel1.removeAll();
            p = tetrisGame1.nextP();
            javax.swing.GroupLayout pieceI1Layout = new javax.swing.GroupLayout(p);

            p.setLayout(pieceI1Layout);
            pieceI1Layout.setHorizontalGroup(
                    pieceI1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGap(0, 100, Short.MAX_VALUE)
            );
            pieceI1Layout.setVerticalGroup(
                    pieceI1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGap(0, 100, Short.MAX_VALUE)
            );

            javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
            jPanel1.setLayout(jPanel1Layout);
            jPanel1Layout.setHorizontalGroup(
                    jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                    .addContainerGap(53, Short.MAX_VALUE)
                                    .addComponent(p, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(39, 39, 39))
            );
            jPanel1Layout.setVerticalGroup(
                    jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addContainerGap()
                                    .addComponent(p, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            );
            revalidate();
            repaint();
        } catch (Exception ex) {
        }

    }

    public void showH() {
        jPanel3.removeAll();
        p = tetrisGame1.getHold();
        try {
            javax.swing.GroupLayout pieceL1Layout = new javax.swing.GroupLayout(p);
            p.setLayout(pieceL1Layout);
            pieceL1Layout.setHorizontalGroup(
                    pieceL1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGap(0, 100, Short.MAX_VALUE)
            );
            pieceL1Layout.setVerticalGroup(
                    pieceL1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGap(0, 100, Short.MAX_VALUE)
            );

            javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
            jPanel3.setLayout(jPanel3Layout);
            jPanel3Layout.setHorizontalGroup(
                    jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                                    .addContainerGap(47, Short.MAX_VALUE)
                                    .addComponent(p, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(35, 35, 35))
            );
            jPanel3Layout.setVerticalGroup(
                    jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                                    .addGap(0, 0, Short.MAX_VALUE)
                                    .addComponent(p, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
            );
        } catch (Exception e) {
        }
        revalidate();
        repaint();

    }

    public void setLabelHold() {
        jLabel3.setForeground(Color.black);
    }
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
        tetrisGame1.stopGame();
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

        if (evt.getKeyCode() == 87 || evt.getKeyCode() == 38) {
            tetrisGame1.rotate();
            this.revalidate();
            this.repaint();
        }
        if (evt.getKeyCode() == 68 || evt.getKeyCode() == 39) {
            tetrisGame1.moveRight();
            this.revalidate();
            this.repaint();
        }
        if (evt.getKeyCode() == 65 || evt.getKeyCode() == 37) {
            tetrisGame1.moveLeft();
            this.revalidate();
            this.repaint();
        }
        if (evt.getKeyCode() == 83 || evt.getKeyCode() == 40) {
            tetrisGame1.moveDown();
            this.revalidate();
            this.repaint();
        }
        if (evt.getKeyCode() == 32) {
            tetrisGame1.fallDown();
            this.revalidate();
            this.repaint();
        }
        if (evt.getKeyCode() == 81) {
            System.out.println(tetrisGame1.getTrocar());
            tetrisGame1.savePiece();
            this.revalidate();
            this.repaint();
            showH();
            setLabelHold();
            System.out.println("a");
        }

        if (evt.getKeyCode() == 80 || evt.getKeyCode() == 27) {
            tetrisGame1.stopGame();
            UIManager.put("OptionPane.yesButtonText", "Continuar");
            UIManager.put("OptionPane.noButtonText", "Novo Jogo");
            String[] buttons = {"Continuar", "Novo Jogo"};
            ImageIcon icon = new ImageIcon("src/tetris/images/pause");
            Image image = icon.getImage();
            Image scaledImage = image.getScaledInstance(50, 50, Image.SCALE_DEFAULT);
            Icon scaledIcon = new ImageIcon( scaledImage );
            int returnValue = JOptionPane.showOptionDialog(null, "O que fazer?", "Pause Menu",
                    JOptionPane.DEFAULT_OPTION, 0, scaledIcon, buttons, buttons[0]);
            if (returnValue == 1) {
                int lines = tetrisGame1.getLines();
                int columns = tetrisGame1.getColumns();
                tetrisGame1.stopGame();
                dispose();
                new GraphicTetris().setVisible(true);
                //tetrisGame1.stopSound();
                tetrisGame1 = new TetrisGame(lines, columns, 350);
                tetrisGame1.setGt(this);
                showH();
                setLabelHold();
                revalidate();
                repaint();
                requestFocus();
            } else {
                tetrisGame1.unpauseGame(350);   
            }
            this.revalidate();
            this.repaint();
        }
    }//GEN-LAST:event_formKeyPressed

    private void guardarJogoBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_guardarJogoBtnActionPerformed
        // TODO add your handling code here:
        try {
            tetrisGame1.stopGame();
            // TODO add your handling code here:
            JFileChooser j = new JFileChooser();
            j.showSaveDialog(null);
            tetrisGame1.save(j.getSelectedFile().getAbsolutePath() + ".tetris");
        } catch (Exception ex) {
            System.out.println(ex);
        }
    }//GEN-LAST:event_guardarJogoBtnActionPerformed

    private void loadBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_loadBtnActionPerformed
        // TODO add your handling code here: 

        tetrisGame1.stopGame();
        tetrisGame1.stopSound();
        jPanel2.removeAll();
        
        
        try{
            JFileChooser j = new JFileChooser();
            j.showSaveDialog(null);
        tetrisGame1 = new TetrisGame(tetrisGame1.load(j.getSelectedFile().getAbsolutePath()));
        tetrisGame1.setGt(this);
        
        } catch(Exception e){tetrisGame1.unpauseGame(350);System.out.println(e);}
        
        javax.swing.GroupLayout tetrisGame1Layout = new javax.swing.GroupLayout(tetrisGame1);
        tetrisGame1.setLayout(tetrisGame1Layout);
        tetrisGame1Layout.setHorizontalGroup(
                tetrisGame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGap(0, 449, Short.MAX_VALUE)
        );
        tetrisGame1Layout.setVerticalGroup(
                tetrisGame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGap(0, 448, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
                jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel2Layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(tetrisGame1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
                jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel2Layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(tetrisGame1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addContainerGap(40, Short.MAX_VALUE))
        );

        showH();
        setLabelHold();
        revalidate();
        repaint();
        requestFocus();
    }//GEN-LAST:event_loadBtnActionPerformed

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
                        //
                    }
                });
                dialog.setVisible(true);
            }
        });
    }
    private int novoJogo = 0;
    private String filename = "teste.obj";
    private String filenameP = "testeP.obj";
    private String filename2 = "teste2.obj";

    private Piece p;
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
    private javax.swing.JButton guardarJogoBtn;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JButton loadBtn;
    private tetris.lib.board.TetrisGame tetrisGame1;
    // End of variables declaration//GEN-END:variables
}
