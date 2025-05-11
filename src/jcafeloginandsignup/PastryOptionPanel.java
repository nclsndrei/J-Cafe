package jcafeloginandsignup;
import javax.swing.*;

public class PastryOptionPanel extends javax.swing.JPanel {

    public PastryOptionPanel() {
        initComponents();
        setupListeners();
    }

    private void setupListeners() {
        bagelBtn.addActionListener(e -> Home.setMenuPanel(new PastryOption("Bagel")));
        cinnamonRollBtn.addActionListener(e -> Home.setMenuPanel(new PastryOption("Cinnamon Roll")));
        croissantBtn.addActionListener(e -> Home.setMenuPanel(new PastryOption("Croissant")));
        danishBtn.addActionListener(e -> Home.setMenuPanel(new PastryOption("Danish")));
        muffinBtn.addActionListener(e -> Home.setMenuPanel(new PastryOption("Muffin")));
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        croissantBtn = new javax.swing.JButton();
        cinnamonRollBtn = new javax.swing.JButton();
        bagelBtn = new javax.swing.JButton();
        danishBtn = new javax.swing.JButton();
        muffinBtn = new javax.swing.JButton();

        setBackground(new java.awt.Color(169, 120, 83));
        setPreferredSize(new java.awt.Dimension(800, 500));

        croissantBtn.setBackground(new java.awt.Color(249, 246, 238));
        croissantBtn.setFont(new java.awt.Font("Yu Gothic Medium", 1, 18)); // NOI18N
        croissantBtn.setForeground(new java.awt.Color(169, 120, 83));
        croissantBtn.setText("Croissant");
        croissantBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                croissantBtnActionPerformed(evt);
            }
        });

        cinnamonRollBtn.setBackground(new java.awt.Color(249, 246, 238));
        cinnamonRollBtn.setFont(new java.awt.Font("Yu Gothic Medium", 1, 18)); // NOI18N
        cinnamonRollBtn.setForeground(new java.awt.Color(169, 120, 83));
        cinnamonRollBtn.setText("Cinnamon Roll");
        cinnamonRollBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cinnamonRollBtnActionPerformed(evt);
            }
        });

        bagelBtn.setBackground(new java.awt.Color(249, 246, 238));
        bagelBtn.setFont(new java.awt.Font("Yu Gothic Medium", 1, 18)); // NOI18N
        bagelBtn.setForeground(new java.awt.Color(169, 120, 83));
        bagelBtn.setText("Bagel");
        bagelBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bagelBtnActionPerformed(evt);
            }
        });

        danishBtn.setBackground(new java.awt.Color(249, 246, 238));
        danishBtn.setFont(new java.awt.Font("Yu Gothic Medium", 1, 18)); // NOI18N
        danishBtn.setForeground(new java.awt.Color(169, 120, 83));
        danishBtn.setText("Danish");
        danishBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                danishBtnActionPerformed(evt);
            }
        });

        muffinBtn.setBackground(new java.awt.Color(249, 246, 238));
        muffinBtn.setFont(new java.awt.Font("Yu Gothic Medium", 1, 18)); // NOI18N
        muffinBtn.setForeground(new java.awt.Color(169, 120, 83));
        muffinBtn.setText("Muffin");
        muffinBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                muffinBtnActionPerformed(evt);
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
                        .addComponent(bagelBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 176, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cinnamonRollBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 176, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(croissantBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 176, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(danishBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 176, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(muffinBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 176, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(157, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(43, 43, 43)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cinnamonRollBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(croissantBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(bagelBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(danishBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(muffinBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(291, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void croissantBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_croissantBtnActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_croissantBtnActionPerformed

    private void cinnamonRollBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cinnamonRollBtnActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cinnamonRollBtnActionPerformed

    private void bagelBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bagelBtnActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_bagelBtnActionPerformed

    private void danishBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_danishBtnActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_danishBtnActionPerformed

    private void muffinBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_muffinBtnActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_muffinBtnActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bagelBtn;
    private javax.swing.JButton cinnamonRollBtn;
    private javax.swing.JButton croissantBtn;
    private javax.swing.JButton danishBtn;
    private javax.swing.JButton muffinBtn;
    // End of variables declaration//GEN-END:variables
}
