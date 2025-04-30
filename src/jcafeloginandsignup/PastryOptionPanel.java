package jcafeloginandsignup;
import javax.swing.*;

public class PastryOptionPanel extends javax.swing.JPanel {
    public PastryOptionPanel() {
        setLayout(new BoxLayout(this, BoxLayout.Y_AXIS)); // simple vertical layout
        JLabel label = new JLabel("Pastry Menu"); // dummy label for now
        add(label);
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        setBackground(new java.awt.Color(169, 120, 83));
        setPreferredSize(new java.awt.Dimension(800, 500));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 813, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 534, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    // End of variables declaration//GEN-END:variables
}
