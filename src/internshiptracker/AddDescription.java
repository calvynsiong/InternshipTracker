package internshiptracker;

import Database.*;
import java.sql.*;
import javax.swing.*;


/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author calvy
 */
public class AddDescription extends javax.swing.JFrame {

    ApplicationHelperMethods helper = new ApplicationHelperMethods();

    /**
     * Creates new form AddDescription
     */
    public AddDescription() {
        initComponents();
        helper.closeAllErrors(companyError, statusError, durationError);

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        statusLabel = new javax.swing.JLabel();
        companyError = new javax.swing.JLabel();
        durationLabel = new javax.swing.JLabel();
        durationTextField = new javax.swing.JTextField();
        skillsTextField = new javax.swing.JTextField();
        statusTextField = new javax.swing.JTextField();
        statusSearch = new javax.swing.JButton();
        durationSearch = new javax.swing.JButton();
        SaveButton = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        statusError = new javax.swing.JLabel();
        durationError = new javax.swing.JLabel();
        skillsLabel = new javax.swing.JLabel();
        companyLabel1 = new javax.swing.JLabel();
        descriptionLabel1 = new javax.swing.JLabel();
        companyTextField = new javax.swing.JTextField();
        descriptionTextField = new javax.swing.JTextField();
        skillsLabel1 = new javax.swing.JLabel();
        skillsLabel2 = new javax.swing.JLabel();
        followUpCheck = new javax.swing.JCheckBox();
        cvCheck = new javax.swing.JCheckBox();
        CloseButton = new javax.swing.JButton();
        companySearch = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setLocation(new java.awt.Point(280, 80));
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        statusLabel.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        statusLabel.setForeground(new java.awt.Color(0, 0, 0));
        statusLabel.setText("Status");
        getContentPane().add(statusLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 60, -1, -1));

        companyError.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        companyError.setForeground(new java.awt.Color(255, 0, 0));
        companyError.setText("Company not found!");
        getContentPane().add(companyError, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 160, -1, 20));

        durationLabel.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        durationLabel.setForeground(new java.awt.Color(0, 0, 0));
        durationLabel.setText("Duration");
        getContentPane().add(durationLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 100, -1, -1));

        durationTextField.setBackground(new java.awt.Color(255, 255, 255));
        durationTextField.setForeground(new java.awt.Color(0, 0, 0));
        getContentPane().add(durationTextField, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 100, 190, 30));

        skillsTextField.setBackground(new java.awt.Color(255, 255, 255));
        skillsTextField.setForeground(new java.awt.Color(0, 0, 0));
        getContentPane().add(skillsTextField, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 400, 620, 30));

        statusTextField.setBackground(new java.awt.Color(255, 255, 255));
        statusTextField.setForeground(new java.awt.Color(0, 0, 0));
        getContentPane().add(statusTextField, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 60, 190, 30));

        statusSearch.setBackground(new java.awt.Color(255, 255, 255));
        statusSearch.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        statusSearch.setForeground(new java.awt.Color(0, 0, 0));
        statusSearch.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Data/search.png"))); // NOI18N
        statusSearch.setText("Search");
        statusSearch.setIconTextGap(12);
        statusSearch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                statusSearchActionPerformed(evt);
            }
        });
        getContentPane().add(statusSearch, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 60, -1, -1));

        durationSearch.setBackground(new java.awt.Color(255, 255, 255));
        durationSearch.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        durationSearch.setForeground(new java.awt.Color(0, 0, 0));
        durationSearch.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Data/search.png"))); // NOI18N
        durationSearch.setText("Search");
        durationSearch.setIconTextGap(12);
        durationSearch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                durationSearchActionPerformed(evt);
            }
        });
        getContentPane().add(durationSearch, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 100, -1, -1));

        SaveButton.setBackground(new java.awt.Color(255, 255, 255));
        SaveButton.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        SaveButton.setForeground(new java.awt.Color(0, 0, 0));
        SaveButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Data/save-icon--1.png"))); // NOI18N
        SaveButton.setText("Save");
        SaveButton.setIconTextGap(12);
        SaveButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SaveButtonActionPerformed(evt);
            }
        });
        getContentPane().add(SaveButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 460, 140, 30));

        jTable1.setBackground(new java.awt.Color(255, 255, 255));
        jTable1.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
        jTable1.setForeground(new java.awt.Color(0, 0, 0));
        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null}
            },
            new String [] {
                "ID", "Application", "Status ", "Date Applied", "Duration", "Company", "Contact Info"
            }
        ));
        jTable1.setGridColor(new java.awt.Color(0, 0, 0));
        jScrollPane1.setViewportView(jTable1);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 190, 760, 70));

        statusError.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        statusError.setForeground(new java.awt.Color(255, 0, 0));
        statusError.setText("Status not found!");
        getContentPane().add(statusError, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 160, -1, 20));

        durationError.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        durationError.setForeground(new java.awt.Color(255, 0, 0));
        durationError.setText("Duration not found!");
        getContentPane().add(durationError, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 160, -1, 20));

        skillsLabel.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        skillsLabel.setForeground(new java.awt.Color(0, 0, 0));
        skillsLabel.setText("Cover Letter ?");
        getContentPane().add(skillsLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 480, 140, -1));

        companyLabel1.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        companyLabel1.setForeground(new java.awt.Color(0, 0, 0));
        companyLabel1.setText("Company");
        getContentPane().add(companyLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 20, -1, -1));

        descriptionLabel1.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        descriptionLabel1.setForeground(new java.awt.Color(0, 0, 0));
        descriptionLabel1.setText("Description");
        getContentPane().add(descriptionLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 280, -1, -1));

        companyTextField.setBackground(new java.awt.Color(255, 255, 255));
        companyTextField.setForeground(new java.awt.Color(0, 0, 0));
        getContentPane().add(companyTextField, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 20, 190, 30));

        descriptionTextField.setBackground(new java.awt.Color(255, 255, 255));
        descriptionTextField.setForeground(new java.awt.Color(0, 0, 0));
        getContentPane().add(descriptionTextField, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 280, 620, 110));

        skillsLabel1.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        skillsLabel1.setForeground(new java.awt.Color(0, 0, 0));
        skillsLabel1.setText("Follow up letter sent?");
        getContentPane().add(skillsLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 480, 200, -1));

        skillsLabel2.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        skillsLabel2.setForeground(new java.awt.Color(0, 0, 0));
        skillsLabel2.setText("Skills Needed");
        getContentPane().add(skillsLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 400, 120, -1));

        followUpCheck.setBackground(new java.awt.Color(255, 255, 255));
        followUpCheck.setForeground(new java.awt.Color(255, 255, 255));
        followUpCheck.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                followUpCheckActionPerformed(evt);
            }
        });
        getContentPane().add(followUpCheck, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 480, 30, 30));

        cvCheck.setBackground(new java.awt.Color(255, 255, 255));
        cvCheck.setForeground(new java.awt.Color(255, 255, 255));
        cvCheck.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cvCheckActionPerformed(evt);
            }
        });
        getContentPane().add(cvCheck, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 480, 30, 30));

        CloseButton.setBackground(new java.awt.Color(255, 255, 255));
        CloseButton.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        CloseButton.setForeground(new java.awt.Color(0, 0, 0));
        CloseButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Data/Close.png"))); // NOI18N
        CloseButton.setText("Close");
        CloseButton.setIconTextGap(12);
        CloseButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CloseButtonActionPerformed(evt);
            }
        });
        getContentPane().add(CloseButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 510, 140, 30));

        companySearch.setBackground(new java.awt.Color(255, 255, 255));
        companySearch.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        companySearch.setForeground(new java.awt.Color(0, 0, 0));
        companySearch.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Data/search.png"))); // NOI18N
        companySearch.setText("Search");
        companySearch.setIconTextGap(12);
        companySearch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                companySearchActionPerformed(evt);
            }
        });
        getContentPane().add(companySearch, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 20, -1, -1));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Data/bluebackground.jpg"))); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void followUpCheckActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_followUpCheckActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_followUpCheckActionPerformed

    private void cvCheckActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cvCheckActionPerformed
        // TODO add your handling code here:
        if (cvCheck.isSelected()) {

        };
    }//GEN-LAST:event_cvCheckActionPerformed

    private void CloseButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CloseButtonActionPerformed
        // TODO add your handling code here:
        setVisible(false);

    }//GEN-LAST:event_CloseButtonActionPerformed

    private void companySearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_companySearchActionPerformed
        // TODO add your handling code here:
        helper.SearchApplications("company", companyTextField.getText(), companyError, jTable1);

    }//GEN-LAST:event_companySearchActionPerformed

    private void statusSearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_statusSearchActionPerformed
        // TODO add your handling code here:
        helper.SearchApplications("status", statusTextField.getText(), statusError, jTable1);
    }//GEN-LAST:event_statusSearchActionPerformed

    private void durationSearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_durationSearchActionPerformed
        // TODO add your handling code here:
        helper.SearchApplications("duration", durationTextField.getText(), durationError, jTable1);
    }//GEN-LAST:event_durationSearchActionPerformed

    private void SaveButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SaveButtonActionPerformed
        // TODO add your handling code here:
        if (helper.retrievedApplication) {
            String description = descriptionTextField.getText();
            String skills = skillsTextField.getText();
            String coverLetter;
            String followUp;
            coverLetter = (cvCheck.isSelected() ? "True" : "False");
            followUp = (followUpCheck.isSelected() ? "True" : "False");

            try {
                Connection con = ConnectionProvider.loadConnection();
                PreparedStatement PS = con.prepareStatement("INSERT INTO applicationinfo (appId,description,skills,coverLetter,followUp) VALUES(?,?,?,?,?) AS AppI ON duplicate key update description=AppI.description,skills=AppI.skills,coverLetter=AppI.coverLetter, followUp=AppI.followUp", ResultSet.TYPE_SCROLL_SENSITIVE, ResultSet.CONCUR_UPDATABLE);
                PS.setString(1, helper.appId);
                PS.setString(2, description);
                PS.setString(3, skills);
                PS.setString(4, coverLetter);
                PS.setString(5, followUp);

                PS.executeUpdate();
                JOptionPane.showMessageDialog(null, "Additional information added for application " + helper.appId);
                setVisible(false);
                new AddDescription().setVisible(true);
            } catch (Exception e) {
                e.printStackTrace();
                JOptionPane.showMessageDialog(this, "Additional was not successfully added!");
            };
        } else {
            System.out.println("You need to find 1 application entry to add the application info!");
            JOptionPane.showMessageDialog(null, "Please search for an existing application first!");
        };

    }//GEN-LAST:event_SaveButtonActionPerformed

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
            for (javax.swing.UIManager.LookAndFeelInfo info
                    : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(AddDescription.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AddDescription.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AddDescription.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AddDescription.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AddDescription().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton CloseButton;
    private javax.swing.JButton SaveButton;
    private javax.swing.JLabel companyError;
    private javax.swing.JLabel companyLabel1;
    private javax.swing.JButton companySearch;
    private javax.swing.JTextField companyTextField;
    private javax.swing.JCheckBox cvCheck;
    private javax.swing.JLabel descriptionLabel1;
    private javax.swing.JTextField descriptionTextField;
    private javax.swing.JLabel durationError;
    private javax.swing.JLabel durationLabel;
    private javax.swing.JButton durationSearch;
    private javax.swing.JTextField durationTextField;
    private javax.swing.JCheckBox followUpCheck;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JLabel skillsLabel;
    private javax.swing.JLabel skillsLabel1;
    private javax.swing.JLabel skillsLabel2;
    private javax.swing.JTextField skillsTextField;
    private javax.swing.JLabel statusError;
    private javax.swing.JLabel statusLabel;
    private javax.swing.JButton statusSearch;
    private javax.swing.JTextField statusTextField;
    // End of variables declaration//GEN-END:variables
}
