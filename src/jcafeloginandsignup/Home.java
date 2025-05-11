package jcafeloginandsignup;
import javax.swing.JPanel;
import java.awt.GridLayout;
import java.awt.BorderLayout;


public class Home extends javax.swing.JFrame {
    
    private static Home instance; // ADD THIS

    public Home() {
        initComponents();
        instance = this;
    }
    
    public static Home getInstance() {
        return instance;
    }
    
    public static void setMenuPanel(JPanel panel) {
        Home instance = getInstance();
        instance.menu.removeAll();
        instance.menu.setLayout(new BorderLayout());
        instance.menu.add(panel);
        instance.menu.revalidate();
        instance.menu.repaint();
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jSeparator1 = new javax.swing.JSeparator();
        bg = new javax.swing.JPanel();
        topbar = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        user = new javax.swing.JLabel();
        LogoutBtn = new javax.swing.JButton();
        cart = new javax.swing.JButton();
        category = new javax.swing.JComboBox<>();
        menu = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(800, 500));

        bg.setBackground(new java.awt.Color(249, 246, 238));

        topbar.setBackground(new java.awt.Color(169, 120, 83));

        jLabel1.setFont(new java.awt.Font("Yu Gothic Medium", 1, 29)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(249, 246, 238));
        jLabel1.setText("WELCOME J-Cafe!");

        user.setFont(new java.awt.Font("Freestyle Script", 0, 29)); // NOI18N
        user.setForeground(new java.awt.Color(249, 246, 238));
        user.setText("User");

        LogoutBtn.setBackground(new java.awt.Color(169, 120, 83));
        LogoutBtn.setFont(new java.awt.Font("Yu Gothic UI Light", 1, 11)); // NOI18N
        LogoutBtn.setForeground(new java.awt.Color(249, 246, 238));
        LogoutBtn.setText("Logout");
        LogoutBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                LogoutBtnActionPerformed(evt);
            }
        });

        cart.setText("CART");

        javax.swing.GroupLayout topbarLayout = new javax.swing.GroupLayout(topbar);
        topbar.setLayout(topbarLayout);
        topbarLayout.setHorizontalGroup(
            topbarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(topbarLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(user, javax.swing.GroupLayout.PREFERRED_SIZE, 326, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(LogoutBtn)
                .addGap(56, 56, 56)
                .addComponent(cart)
                .addGap(26, 26, 26))
        );
        topbarLayout.setVerticalGroup(
            topbarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(topbarLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(topbarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(user, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(LogoutBtn)
                    .addComponent(cart))
                .addGap(4, 4, 4))
        );

        category.setBackground(new java.awt.Color(169, 120, 83));
        category.setFont(new java.awt.Font("Yu Gothic UI", 0, 12)); // NOI18N
        category.setForeground(new java.awt.Color(249, 246, 238));
        category.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Select", "Coffee", "Juices", "Pastry", "Pasta" }));
        category.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                categoryActionPerformed(evt);
            }
        });

        menu.setBackground(new java.awt.Color(169, 120, 83));
        menu.setPreferredSize(new java.awt.Dimension(800, 500));

        javax.swing.GroupLayout bgLayout = new javax.swing.GroupLayout(bg);
        bg.setLayout(bgLayout);
        bgLayout.setHorizontalGroup(
            bgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(topbar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(bgLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(bgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(menu, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(bgLayout.createSequentialGroup()
                        .addComponent(category, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        bgLayout.setVerticalGroup(
            bgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(bgLayout.createSequentialGroup()
                .addComponent(topbar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(category, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(menu, javax.swing.GroupLayout.DEFAULT_SIZE, 382, Short.MAX_VALUE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(bg, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(bg, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void updateMenu(String selectedCategory) {
    menu.removeAll(); // Clear the current menu first
    
    switch (selectedCategory) {
        case "Coffee":
            menu.add(new CoffeeOptionPanel());
            break;
        case "Juices":
            menu.add(new JuicesOptionPanel());
            break;
        case "Pastry":
            menu.add(new PastryOptionPanel());
            break;
        case "Pasta":
            menu.add(new PastaOptionPanel());
            break;
        default:
            break;
    }
    menu.revalidate();
    menu.repaint();
}
    private void LogoutBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LogoutBtnActionPerformed
        // TODO add your handling code here:
        Login LoginFrame = new Login();
        LoginFrame.setVisible(true);
        LoginFrame.pack();
        LoginFrame.setLocationRelativeTo(null);
        this.dispose();
    }//GEN-LAST:event_LogoutBtnActionPerformed

    private void categoryActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_categoryActionPerformed
        // TODO add your handling code here:
        String selectedCategory = (String) category.getSelectedItem();
    menu.removeAll();

    switch (selectedCategory) {
        case "Coffee":
            menu.add(new CoffeeOptionPanel());
            break;
        case "Juices":
            menu.add(new JuicesOptionPanel());
            break;
        case "Pastry":
            menu.add(new PastryOptionPanel());
            break;
        case "Pasta":
            menu.add(new PastaOptionPanel());
            break;
        default:
            // if "Select" is chosen or unknown option
            break;
    }

    menu.revalidate();
    menu.repaint();
    }//GEN-LAST:event_categoryActionPerformed

    
    public void setUser(String name) {
        user.setText(name);
    }
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
            java.util.logging.Logger.getLogger(Home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Home().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton LogoutBtn;
    private javax.swing.JPanel bg;
    private javax.swing.JButton cart;
    private javax.swing.JComboBox<String> category;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JPanel menu;
    private javax.swing.JPanel topbar;
    private javax.swing.JLabel user;
    // End of variables declaration//GEN-END:variables
}
