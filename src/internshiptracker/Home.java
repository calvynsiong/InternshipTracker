/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package internshiptracker;

import javax.swing.JButton;
import javax.swing.JOptionPane;

/**
 *
 * @author calvy
 */
public class Home extends javax.swing.JFrame {
//    Initialized

    public int i = 1;

    /**
     * Creates new form Home
     */
    public Home() {
        initComponents();
        initPosition();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jButton2.setBackground(new java.awt.Color(255, 255, 255));
        jButton2.setFont(new java.awt.Font("Dialog", 0, 15)); // NOI18N
        jButton2.setForeground(new java.awt.Color(0, 0, 0));
        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Data/addinternship.png"))); // NOI18N
        jButton2.setText("New Application");
        jButton2.setToolTipText("");
        jButton2.setIconTextGap(12);
        jButton2.setMaximumSize(new java.awt.Dimension(180, 60));
        jButton2.setMinimumSize(new java.awt.Dimension(100, 60));
        jButton2.setPreferredSize(new java.awt.Dimension(180, 60));
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(12, 130, 230, 69));

        jButton3.setBackground(new java.awt.Color(255, 255, 255));
        jButton3.setFont(new java.awt.Font("Dialog", 0, 15)); // NOI18N
        jButton3.setForeground(new java.awt.Color(0, 0, 0));
        jButton3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Data/description.png"))); // NOI18N
        jButton3.setText("Add Description");
        jButton3.setToolTipText("");
        jButton3.setHorizontalAlignment(javax.swing.SwingConstants.LEADING);
        jButton3.setIconTextGap(12);
        jButton3.setMaximumSize(new java.awt.Dimension(280, 60));
        jButton3.setMinimumSize(new java.awt.Dimension(100, 60));
        jButton3.setPreferredSize(new java.awt.Dimension(230, 60));
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(12, 229, -1, -1));

        jButton4.setBackground(new java.awt.Color(255, 255, 255));
        jButton4.setFont(new java.awt.Font("Dialog", 0, 15)); // NOI18N
        jButton4.setForeground(new java.awt.Color(0, 0, 0));
        jButton4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Data/rsz_history1.png"))); // NOI18N
        jButton4.setText("Application History");
        jButton4.setToolTipText("");
        jButton4.setHorizontalAlignment(javax.swing.SwingConstants.LEADING);
        jButton4.setIconTextGap(12);
        jButton4.setMaximumSize(new java.awt.Dimension(280, 60));
        jButton4.setMinimumSize(new java.awt.Dimension(100, 60));
        jButton4.setPreferredSize(new java.awt.Dimension(230, 60));
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton4, new org.netbeans.lib.awtextra.AbsoluteConstraints(12, 319, -1, -1));

        jButton5.setBackground(new java.awt.Color(255, 255, 255));
        jButton5.setFont(new java.awt.Font("Dialog", 0, 15)); // NOI18N
        jButton5.setForeground(new java.awt.Color(0, 0, 0));
        jButton5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Data/rsz_update_details.png"))); // NOI18N
        jButton5.setText("Update Application ");
        jButton5.setToolTipText("");
        jButton5.setHorizontalAlignment(javax.swing.SwingConstants.LEADING);
        jButton5.setIconTextGap(12);
        jButton5.setMaximumSize(new java.awt.Dimension(280, 60));
        jButton5.setMinimumSize(new java.awt.Dimension(100, 60));
        jButton5.setPreferredSize(new java.awt.Dimension(230, 60));
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton5, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 409, -1, -1));

        jButton6.setBackground(new java.awt.Color(255, 255, 255));
        jButton6.setFont(new java.awt.Font("Dialog", 0, 15)); // NOI18N
        jButton6.setForeground(new java.awt.Color(0, 0, 0));
        jButton6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Data/exit.png"))); // NOI18N
        jButton6.setText("Logout");
        jButton6.setToolTipText("");
        jButton6.setHorizontalAlignment(javax.swing.SwingConstants.LEADING);
        jButton6.setIconTextGap(12);
        jButton6.setMaximumSize(new java.awt.Dimension(280, 60));
        jButton6.setMinimumSize(new java.awt.Dimension(100, 60));
        jButton6.setPreferredSize(new java.awt.Dimension(230, 60));
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton6, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 499, -1, -1));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Data/application.png"))); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(-100, 0, 1390, 770));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        new addNewApplication().setVisible(true);
        
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
        new AddDescription().setVisible(true);
    }//GEN-LAST:event_jButton3ActionPerformed

    private void initPosition() {
        JButton[] Buttons = {jButton2, jButton3, jButton4, jButton5, jButton6};
        int ActiveIndex = 0;
        for (JButton button : Buttons) {
            button.setLocation(10, 130 + ActiveIndex * 100);
            ActiveIndex++;
        }
        i = 0;

    }

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        // TODO add your handling code here:
        new SeeAllApplications().setVisible(true);
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        // TODO add your handling code here:
        new UpdateApplication().setVisible(true);
    }//GEN-LAST:event_jButton5ActionPerformed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
        // TODO add your handling code here:
        int a = JOptionPane.showConfirmDialog(null, "Are you sure you want to logout?", "Select", JOptionPane.YES_NO_OPTION);
//        A == 0 is yes
        if (a == 0) {
            setVisible(false);
            new Login().setVisible(true);
        }
    }//GEN-LAST:event_jButton6ActionPerformed

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
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JLabel jLabel1;
    // End of variables declaration//GEN-END:variables
}
