/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package tetris.GUI;

/**
 *
 * @author danie
 */
public class Rules extends javax.swing.JFrame {

    /**
     * Creates new form Rules
     */
    public Rules() {
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

        LblRules = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        TxtRules = new javax.swing.JTextArea();
        BtnVoltar = new javax.swing.JButton();
        IconTetris = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Tetris Text");

        LblRules.setFont(new java.awt.Font("Goudy Old Style", 1, 36)); // NOI18N
        LblRules.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        LblRules.setText("Tetris Rules");

        TxtRules.setEditable(false);
        TxtRules.setColumns(20);
        TxtRules.setFont(new java.awt.Font("Goudy Old Style", 0, 14)); // NOI18N
        TxtRules.setLineWrap(true);
        TxtRules.setRows(5);
        TxtRules.setText("Lorem ipsum dolor sit amet, consectetur adipiscing elit. Donec vitae ante augue. \nAliquam erat volutpat. Nulla eu sodales metus. Nullam vitae lectus gravida mi vestibulum sollicitudin in ut purus. Aliquam tincidunt, lorem sed tincidunt vestibulum, est purus feugiat tortor, rhoncus hendrerit lectus diam faucibus leo. Phasellus ornare turpis et velit elementum sollicitudin id ut erat.\n Donec et tellus est. Nulla ut ullamcorper justo. Etiam in dapibus dui. Quisque ut efficitur nulla. Duis in ante non nisi volutpat finibus vitae a augue. Nullam ut odio lorem.");
        TxtRules.setWrapStyleWord(true);
        jScrollPane1.setViewportView(TxtRules);

        BtnVoltar.setFont(new java.awt.Font("Goudy Old Style", 0, 18)); // NOI18N
        BtnVoltar.setText("Voltar");
        BtnVoltar.setBorder(javax.swing.BorderFactory.createTitledBorder(""));
        BtnVoltar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnVoltarActionPerformed(evt);
            }
        });

        IconTetris.setIcon(new javax.swing.ImageIcon(getClass().getResource("/tetris/images/tetris.jpg"))); // NOI18N

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(BtnVoltar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(IconTetris)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(LblRules, javax.swing.GroupLayout.PREFERRED_SIZE, 247, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 343, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(16, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addComponent(LblRules, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(IconTetris, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 212, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 20, Short.MAX_VALUE)
                .addComponent(BtnVoltar, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void BtnVoltarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnVoltarActionPerformed
        // TODO add your handling code here:
        this.dispose();
        new Menu().setVisible(true);

    }//GEN-LAST:event_BtnVoltarActionPerformed

    /**
     * @param args the command line arguments
     */
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BtnVoltar;
    private javax.swing.JLabel IconTetris;
    private javax.swing.JLabel LblRules;
    private javax.swing.JTextArea TxtRules;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}
