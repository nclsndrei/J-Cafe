package jcafe;
import jcafe.*;
import javax.swing.*;

public class CoffeeOptionPanel extends javax.swing.JPanel {
    
    private String coffeeName;
    
    public CoffeeOptionPanel() {
        initComponents();
        setupListeners();
    }
    
    private void setupListeners() {
        // When a user clicks a coffee button, it loads the CoffeeOptionsPanel
        americanoBtn.addActionListener(e -> Home.setMenuPanel(new CoffeeOption("Americano")));
        latteBtn.addActionListener(e -> Home.setMenuPanel(new CoffeeOption ("Spanish Latte")));
        cappuccinoBtn.addActionListener(e ->Home.setMenuPanel(new CoffeeOption ("Cappuccino")));
        espressoBtn.addActionListener(e ->Home.setMenuPanel(new CoffeeOption ("Espresso")));
        macchiatoBtn.addActionListener(e ->Home.setMenuPanel(new CoffeeOption (" Caramel Macchiato")));
        flatBtn.addActionListener(e ->Home.setMenuPanel(new CoffeeOption ("Flat White")));
        mochaBtn.addActionListener(e ->Home.setMenuPanel(new CoffeeOption ("White Mocha")));
    }
    
    
     private void CoffeeOption(String coffeeName) {
        Home.setMenuPanel(new CoffeeOption(coffeeName));  // Pass the coffee type
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        americanoBtn = new javax.swing.JButton();
        latteBtn = new javax.swing.JButton();
        cappuccinoBtn = new javax.swing.JButton();
        espressoBtn = new javax.swing.JButton();
        mochaBtn = new javax.swing.JButton();
        macchiatoBtn = new javax.swing.JButton();
        flatBtn = new javax.swing.JButton();

        setBackground(new java.awt.Color(169, 120, 83));
        setPreferredSize(new java.awt.Dimension(800, 500));

        americanoBtn.setBackground(new java.awt.Color(249, 246, 238));
        americanoBtn.setFont(new java.awt.Font("Yu Gothic Medium", 1, 18)); // NOI18N
        americanoBtn.setForeground(new java.awt.Color(169, 120, 83));
        americanoBtn.setText("Americano");
        americanoBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                americanoBtnActionPerformed(evt);
            }
        });

        latteBtn.setBackground(new java.awt.Color(249, 246, 238));
        latteBtn.setFont(new java.awt.Font("Yu Gothic Medium", 1, 18)); // NOI18N
        latteBtn.setForeground(new java.awt.Color(169, 120, 83));
        latteBtn.setText("Spanish Latte");

        cappuccinoBtn.setBackground(new java.awt.Color(249, 246, 238));
        cappuccinoBtn.setFont(new java.awt.Font("Yu Gothic Medium", 1, 18)); // NOI18N
        cappuccinoBtn.setForeground(new java.awt.Color(169, 120, 83));
        cappuccinoBtn.setText("Cappuccino");

        espressoBtn.setBackground(new java.awt.Color(249, 246, 238));
        espressoBtn.setFont(new java.awt.Font("Yu Gothic Medium", 1, 18)); // NOI18N
        espressoBtn.setForeground(new java.awt.Color(169, 120, 83));
        espressoBtn.setText("Espresso");

        mochaBtn.setBackground(new java.awt.Color(249, 246, 238));
        mochaBtn.setFont(new java.awt.Font("Yu Gothic Medium", 1, 18)); // NOI18N
        mochaBtn.setForeground(new java.awt.Color(169, 120, 83));
        mochaBtn.setText("White Mocha");

        macchiatoBtn.setBackground(new java.awt.Color(249, 246, 238));
        macchiatoBtn.setFont(new java.awt.Font("Yu Gothic Medium", 1, 18)); // NOI18N
        macchiatoBtn.setForeground(new java.awt.Color(169, 120, 83));
        macchiatoBtn.setText("Caramel Macchiato");

        flatBtn.setBackground(new java.awt.Color(249, 246, 238));
        flatBtn.setFont(new java.awt.Font("Yu Gothic Medium", 1, 18)); // NOI18N
        flatBtn.setForeground(new java.awt.Color(169, 120, 83));
        flatBtn.setText("Flat White");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(84, 84, 84)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(latteBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 176, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(macchiatoBtn)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(cappuccinoBtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(americanoBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 176, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(espressoBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 204, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(mochaBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 204, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(flatBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 176, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(122, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(mochaBtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(espressoBtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(americanoBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(latteBtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(macchiatoBtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(cappuccinoBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(flatBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(29, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void americanoBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_americanoBtnActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_americanoBtnActionPerformed
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton americanoBtn;
    private javax.swing.JButton cappuccinoBtn;
    private javax.swing.JButton espressoBtn;
    private javax.swing.JButton flatBtn;
    private javax.swing.JButton latteBtn;
    private javax.swing.JButton macchiatoBtn;
    private javax.swing.JButton mochaBtn;
    // End of variables declaration//GEN-END:variables
}
