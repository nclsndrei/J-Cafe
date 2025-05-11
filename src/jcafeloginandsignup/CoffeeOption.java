package jcafeloginandsignup;

import javax.swing.*;
import java.awt.*;
import javax.swing.JOptionPane;


public class CoffeeOption extends javax.swing.JPanel {
     private String coffeeName;

        public CoffeeOption(String coffeeName) {
        initComponents();
        this.coffeeName = coffeeName;
        
        coffeeNameLabel.setText("Selected: " + coffeeName);
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        clearButton = new javax.swing.JButton();
        backButton = new javax.swing.JButton();
        orderButton = new javax.swing.JButton();
        coffeeNameLabel = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        dineInButton = new javax.swing.JRadioButton();
        takeOutButton = new javax.swing.JRadioButton();
        coffeeQuantitySpinner = new javax.swing.JSpinner(new javax.swing.SpinnerNumberModel(1, 1, Integer.MAX_VALUE, 1));
        hotRadioBtn = new javax.swing.JRadioButton();
        coldRadioBtn = new javax.swing.JRadioButton();
        sizecombobox = new javax.swing.JComboBox<>();

        setBackground(new java.awt.Color(249, 246, 238));

        clearButton.setBackground(new java.awt.Color(204, 0, 0));
        clearButton.setText("Clear");
        clearButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                clearButtonActionPerformed(evt);
            }
        });

        backButton.setText("Back");
        backButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backButtonActionPerformed(evt);
            }
        });

        orderButton.setBackground(new java.awt.Color(51, 153, 0));
        orderButton.setText("Order");
        orderButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                orderButtonActionPerformed(evt);
            }
        });

        coffeeNameLabel.setFont(new java.awt.Font("Yu Gothic Medium", 1, 27)); // NOI18N
        coffeeNameLabel.setForeground(new java.awt.Color(169, 120, 83));
        coffeeNameLabel.setText("Coffee Name");

        jPanel1.setBackground(new java.awt.Color(169, 120, 83));

        jLabel1.setFont(new java.awt.Font("Yu Gothic Medium", 1, 24)); // NOI18N
        jLabel1.setText("Coffee Option Menu");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 358, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(256, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel2.setBackground(new java.awt.Color(169, 120, 83));

        jLabel2.setFont(new java.awt.Font("Yu Gothic Medium", 1, 14)); // NOI18N
        jLabel2.setText("Quantity:");

        jLabel3.setFont(new java.awt.Font("Yu Gothic Medium", 1, 14)); // NOI18N
        jLabel3.setText("Type:");

        jLabel4.setFont(new java.awt.Font("Yu Gothic Medium", 1, 14)); // NOI18N
        jLabel4.setText("Size:");

        jLabel5.setFont(new java.awt.Font("Yu Gothic Medium", 1, 14)); // NOI18N
        jLabel5.setText("Dining Option:");

        dineInButton.setBackground(new java.awt.Color(249, 246, 238));
        dineInButton.setFont(new java.awt.Font("Yu Gothic Medium", 0, 11)); // NOI18N
        dineInButton.setForeground(new java.awt.Color(169, 120, 83));
        dineInButton.setText("Dine In");
        dineInButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                dineInButtonActionPerformed(evt);
            }
        });

        takeOutButton.setBackground(new java.awt.Color(249, 246, 238));
        takeOutButton.setFont(new java.awt.Font("Yu Gothic Medium", 0, 11)); // NOI18N
        takeOutButton.setForeground(new java.awt.Color(169, 120, 83));
        takeOutButton.setText("Take Out");
        takeOutButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                takeOutButtonActionPerformed(evt);
            }
        });

        hotRadioBtn.setText("Hot");
        hotRadioBtn.setFocusCycleRoot(true);
        hotRadioBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                hotRadioBtnActionPerformed(evt);
            }
        });

        coldRadioBtn.setText("Cold");
        coldRadioBtn.setFocusCycleRoot(true);
        coldRadioBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                coldRadioBtnActionPerformed(evt);
            }
        });

        sizecombobox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Small", "Medium", "LArge" }));
        sizecombobox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sizecomboboxActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2)
                    .addComponent(coffeeQuantitySpinner, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(36, 36, 36)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel3)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(coldRadioBtn)
                        .addComponent(hotRadioBtn)))
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(39, 39, 39)
                        .addComponent(jLabel4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel5)
                        .addGap(20, 20, 20))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(31, 31, 31)
                        .addComponent(sizecombobox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(29, 29, 29)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(takeOutButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(dineInButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(51, 51, 51))))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jLabel3)
                    .addComponent(jLabel4)
                    .addComponent(jLabel5))
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(dineInButton, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(coffeeQuantitySpinner, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(20, 20, 20)
                        .addComponent(takeOutButton, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(7, 7, 7)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(hotRadioBtn)
                            .addComponent(sizecombobox, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(6, 6, 6)
                        .addComponent(coldRadioBtn)))
                .addContainerGap(81, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(coffeeNameLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(clearButton, javax.swing.GroupLayout.DEFAULT_SIZE, 179, Short.MAX_VALUE)
                    .addComponent(backButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(orderButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(coffeeNameLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(clearButton, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(backButton, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(orderButton, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void orderButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_orderButtonActionPerformed
        // TODO add your handling code here:
        
        int quantity = (int) coffeeQuantitySpinner.getValue();
        String type= "";
        String dining = "";
        
        if (hotRadioBtn.isSelected()) {
            type = "Hot";
        } else if (coldRadioBtn.isSelected()) {
            type = "Cold";
        }else {
            JOptionPane.showMessageDialog(this, "Please select Hot or Cold.");
            return;
        }
        
        if (dineInButton.isSelected()) {
            type = "Dine In";
        } else if (takeOutButton.isSelected()) {
            type = "Take Out";
        }else {
            JOptionPane.showMessageDialog(this, "Please select Dining Option");
            return;
        }
        
        String size = sizecombobox.getSelectedItem().toString();
        String coffeename = coffeeNameLabel.getText().replace("Selected: ", "").trim();
        
        int unitPrice = ProductPrices.getCoffeePrice(coffeename, size, type);
        int totalPrice = unitPrice *quantity;
        
        String orderLine = coffeeName + " (" + type + ",  " + size + ") x " + quantity  + " - " + dining + " = Php " + totalPrice;
        
        CartSystem.addToCart(orderLine);
        JOptionPane.showMessageDialog(this, "Added to cart!");
        
        
    }//GEN-LAST:event_orderButtonActionPerformed

    private void backButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backButtonActionPerformed
        // TODO add your handling code here:
         Home.setMenuPanel(new CoffeeOptionPanel()); // go back to menu
    }//GEN-LAST:event_backButtonActionPerformed

    private void clearButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_clearButtonActionPerformed
        // TODO add your handling code here:
        
        
        
    }//GEN-LAST:event_clearButtonActionPerformed

    private void dineInButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_dineInButtonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_dineInButtonActionPerformed

    private void takeOutButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_takeOutButtonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_takeOutButtonActionPerformed

    private void hotRadioBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_hotRadioBtnActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_hotRadioBtnActionPerformed

    private void coldRadioBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_coldRadioBtnActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_coldRadioBtnActionPerformed

    private void sizecomboboxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sizecomboboxActionPerformed
        // TODO add your handling code here:

    }//GEN-LAST:event_sizecomboboxActionPerformed

    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton backButton;
    private javax.swing.JButton clearButton;
    private javax.swing.JLabel coffeeNameLabel;
    private javax.swing.JSpinner coffeeQuantitySpinner;
    private javax.swing.JRadioButton coldRadioBtn;
    private javax.swing.JRadioButton dineInButton;
    private javax.swing.JRadioButton hotRadioBtn;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JButton orderButton;
    private javax.swing.JComboBox<String> sizecombobox;
    private javax.swing.JRadioButton takeOutButton;
    // End of variables declaration//GEN-END:variables
}
