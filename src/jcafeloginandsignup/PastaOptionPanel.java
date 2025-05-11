package jcafeloginandsignup;
import javax.swing.*;

public class PastaOptionPanel extends javax.swing.JPanel {

    public PastaOptionPanel() {
        initComponents();
        setupListeners();
    }

    private void setupListeners() {
        alfredoBtn.addActionListener(e -> Home.setMenuPanel(new PastaOption("Alfredo")));
        bologneseBtn.addActionListener(e -> Home.setMenuPanel(new PastaOption("Bolognese")));
        carbonaraBtn.addActionListener(e -> Home.setMenuPanel(new PastaOption("Carbonara")));
        pestoBtn.addActionListener(e -> Home.setMenuPanel(new PastaOption("Pesto")));
        spaghettiBtn.addActionListener(e -> Home.setMenuPanel(new PastaOption("Spaghetti")));
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        carbonaraBtn = new javax.swing.JButton();
        bologneseBtn = new javax.swing.JButton();
        alfredoBtn = new javax.swing.JButton();
        pestoBtn = new javax.swing.JButton();
        spaghettiBtn = new javax.swing.JButton();

        setBackground(new java.awt.Color(169, 120, 83));
        setPreferredSize(new java.awt.Dimension(800, 500));

        carbonaraBtn.setBackground(new java.awt.Color(249, 246, 238));
        carbonaraBtn.setFont(new java.awt.Font("Yu Gothic Medium", 1, 18)); // NOI18N
        carbonaraBtn.setForeground(new java.awt.Color(169, 120, 83));
        carbonaraBtn.setText("Carbonara");
        carbonaraBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                carbonaraBtnActionPerformed(evt);
            }
        });

        bologneseBtn.setBackground(new java.awt.Color(249, 246, 238));
        bologneseBtn.setFont(new java.awt.Font("Yu Gothic Medium", 1, 18)); // NOI18N
        bologneseBtn.setForeground(new java.awt.Color(169, 120, 83));
        bologneseBtn.setText("Bolognese");
        bologneseBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bologneseBtnActionPerformed(evt);
            }
        });

        alfredoBtn.setBackground(new java.awt.Color(249, 246, 238));
        alfredoBtn.setFont(new java.awt.Font("Yu Gothic Medium", 1, 18)); // NOI18N
        alfredoBtn.setForeground(new java.awt.Color(169, 120, 83));
        alfredoBtn.setText("Alfredo");
        alfredoBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                alfredoBtnActionPerformed(evt);
            }
        });

        pestoBtn.setBackground(new java.awt.Color(249, 246, 238));
        pestoBtn.setFont(new java.awt.Font("Yu Gothic Medium", 1, 18)); // NOI18N
        pestoBtn.setForeground(new java.awt.Color(169, 120, 83));
        pestoBtn.setText("Pesto");
        pestoBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pestoBtnActionPerformed(evt);
            }
        });

        spaghettiBtn.setBackground(new java.awt.Color(249, 246, 238));
        spaghettiBtn.setFont(new java.awt.Font("Yu Gothic Medium", 1, 18)); // NOI18N
        spaghettiBtn.setForeground(new java.awt.Color(169, 120, 83));
        spaghettiBtn.setText("Spaghetti");
        spaghettiBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                spaghettiBtnActionPerformed(evt);
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
                        .addComponent(alfredoBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 176, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(bologneseBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 176, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(carbonaraBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 176, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(pestoBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 176, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(spaghettiBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 176, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(157, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(43, 43, 43)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(bologneseBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(carbonaraBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(alfredoBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(pestoBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(spaghettiBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(291, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void carbonaraBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_carbonaraBtnActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_carbonaraBtnActionPerformed

    private void bologneseBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bologneseBtnActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_bologneseBtnActionPerformed

    private void alfredoBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_alfredoBtnActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_alfredoBtnActionPerformed

    private void pestoBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pestoBtnActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_pestoBtnActionPerformed

    private void spaghettiBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_spaghettiBtnActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_spaghettiBtnActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton alfredoBtn;
    private javax.swing.JButton bologneseBtn;
    private javax.swing.JButton carbonaraBtn;
    private javax.swing.JButton pestoBtn;
    private javax.swing.JButton spaghettiBtn;
    // End of variables declaration//GEN-END:variables
}
