package jcafeloginandsignup;
import javax.swing.*;

public class JuicesOptionPanel extends javax.swing.JPanel {

    public JuicesOptionPanel() {
        initComponents();
        setupListeners();
    }

    private void setupListeners() {
        appleJuiceBtn.addActionListener(e -> Home.setMenuPanel(new JuicesOption("Apple Juice")));
        grapeJuiceBtn.addActionListener(e -> Home.setMenuPanel(new JuicesOption("Grape Juice")));
        lemonadeBtn.addActionListener(e -> Home.setMenuPanel(new JuicesOption("Lemonade")));
        mangoJuiceBtn.addActionListener(e -> Home.setMenuPanel(new JuicesOption("Mango Juice")));
        orangeJuiceBtn.addActionListener(e -> Home.setMenuPanel(new JuicesOption("Orange Juice")));
        pineappleJuiceBtn.addActionListener(e -> Home.setMenuPanel(new JuicesOption("Pineapple Juice")));
    }

   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lemonadeBtn = new javax.swing.JButton();
        grapeJuiceBtn = new javax.swing.JButton();
        appleJuiceBtn = new javax.swing.JButton();
        mangoJuiceBtn = new javax.swing.JButton();
        pineappleJuiceBtn = new javax.swing.JButton();
        orangeJuiceBtn = new javax.swing.JButton();

        setBackground(new java.awt.Color(169, 120, 83));
        setPreferredSize(new java.awt.Dimension(800, 500));

        lemonadeBtn.setBackground(new java.awt.Color(249, 246, 238));
        lemonadeBtn.setFont(new java.awt.Font("Yu Gothic Medium", 1, 18)); // NOI18N
        lemonadeBtn.setForeground(new java.awt.Color(169, 120, 83));
        lemonadeBtn.setText("Lemonade");
        lemonadeBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                lemonadeBtnActionPerformed(evt);
            }
        });

        grapeJuiceBtn.setBackground(new java.awt.Color(249, 246, 238));
        grapeJuiceBtn.setFont(new java.awt.Font("Yu Gothic Medium", 1, 18)); // NOI18N
        grapeJuiceBtn.setForeground(new java.awt.Color(169, 120, 83));
        grapeJuiceBtn.setText("Grape Juice");
        grapeJuiceBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                grapeJuiceBtnActionPerformed(evt);
            }
        });

        appleJuiceBtn.setBackground(new java.awt.Color(249, 246, 238));
        appleJuiceBtn.setFont(new java.awt.Font("Yu Gothic Medium", 1, 18)); // NOI18N
        appleJuiceBtn.setForeground(new java.awt.Color(169, 120, 83));
        appleJuiceBtn.setText("Apple Juice");
        appleJuiceBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                appleJuiceBtnActionPerformed(evt);
            }
        });

        mangoJuiceBtn.setBackground(new java.awt.Color(249, 246, 238));
        mangoJuiceBtn.setFont(new java.awt.Font("Yu Gothic Medium", 1, 18)); // NOI18N
        mangoJuiceBtn.setForeground(new java.awt.Color(169, 120, 83));
        mangoJuiceBtn.setText("Mango Juice");
        mangoJuiceBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mangoJuiceBtnActionPerformed(evt);
            }
        });

        pineappleJuiceBtn.setBackground(new java.awt.Color(249, 246, 238));
        pineappleJuiceBtn.setFont(new java.awt.Font("Yu Gothic Medium", 1, 18)); // NOI18N
        pineappleJuiceBtn.setForeground(new java.awt.Color(169, 120, 83));
        pineappleJuiceBtn.setText("Pineapple Juice");
        pineappleJuiceBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pineappleJuiceBtnActionPerformed(evt);
            }
        });

        orangeJuiceBtn.setBackground(new java.awt.Color(249, 246, 238));
        orangeJuiceBtn.setFont(new java.awt.Font("Yu Gothic Medium", 1, 18)); // NOI18N
        orangeJuiceBtn.setForeground(new java.awt.Color(169, 120, 83));
        orangeJuiceBtn.setText("Orange Juice");
        orangeJuiceBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                orangeJuiceBtnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(103, 103, 103)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(appleJuiceBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 176, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(grapeJuiceBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 176, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(mangoJuiceBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 176, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(orangeJuiceBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 176, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(pineappleJuiceBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 176, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lemonadeBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 176, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(157, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(43, 43, 43)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(grapeJuiceBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lemonadeBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(appleJuiceBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(mangoJuiceBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(orangeJuiceBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(pineappleJuiceBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(285, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void lemonadeBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_lemonadeBtnActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_lemonadeBtnActionPerformed

    private void grapeJuiceBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_grapeJuiceBtnActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_grapeJuiceBtnActionPerformed

    private void appleJuiceBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_appleJuiceBtnActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_appleJuiceBtnActionPerformed

    private void mangoJuiceBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mangoJuiceBtnActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_mangoJuiceBtnActionPerformed

    private void pineappleJuiceBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pineappleJuiceBtnActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_pineappleJuiceBtnActionPerformed

    private void orangeJuiceBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_orangeJuiceBtnActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_orangeJuiceBtnActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton appleJuiceBtn;
    private javax.swing.JButton grapeJuiceBtn;
    private javax.swing.JButton lemonadeBtn;
    private javax.swing.JButton mangoJuiceBtn;
    private javax.swing.JButton orangeJuiceBtn;
    private javax.swing.JButton pineappleJuiceBtn;
    // End of variables declaration//GEN-END:variables
}
