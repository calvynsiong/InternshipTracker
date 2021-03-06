/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package internshiptracker;

/**
 *
 * @author calvy
 */
public class UpdateApplication extends javax.swing.JFrame {

    /**
     * Creates new form UpdateApplication
     */
    ApplicationHelperMethods helper = new ApplicationHelperMethods();

    public UpdateApplication() {
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
        durationSearchField = new javax.swing.JTextField();
        statusSearchField = new javax.swing.JTextField();
        statusSearch = new javax.swing.JButton();
        durationSearch = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        statusError = new javax.swing.JLabel();
        durationError = new javax.swing.JLabel();
        companyLabel = new javax.swing.JLabel();
        companySearchField = new javax.swing.JTextField();
        companySearch = new javax.swing.JButton();
        updateButton = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        applicationTextField = new javax.swing.JTextField();
        dateAppliedTextField = new javax.swing.JTextField();
        companyTextField = new javax.swing.JTextField();
        contactInfoTextField = new javax.swing.JTextField();
        statusComboBox = new javax.swing.JComboBox<>();
        durationComboBox = new javax.swing.JComboBox<>();
        jLabel11 = new javax.swing.JLabel();
        CloseButton = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setLocation(new java.awt.Point(280, 90));
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        statusLabel.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        statusLabel.setForeground(new java.awt.Color(0, 0, 0));
        statusLabel.setText("Status");
        getContentPane().add(statusLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 60, -1, -1));

        companyError.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        companyError.setForeground(new java.awt.Color(255, 0, 0));
        companyError.setText("Company not found!");
        getContentPane().add(companyError, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 250, -1, 20));

        durationLabel.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        durationLabel.setForeground(new java.awt.Color(0, 0, 0));
        durationLabel.setText("Duration");
        getContentPane().add(durationLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 100, -1, -1));

        durationSearchField.setBackground(new java.awt.Color(255, 255, 255));
        durationSearchField.setForeground(new java.awt.Color(0, 0, 0));
        getContentPane().add(durationSearchField, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 100, 190, 30));

        statusSearchField.setBackground(new java.awt.Color(255, 255, 255));
        statusSearchField.setForeground(new java.awt.Color(0, 0, 0));
        getContentPane().add(statusSearchField, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 60, 190, 30));

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
        getContentPane().add(statusSearch, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 60, -1, -1));

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
        getContentPane().add(durationSearch, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 100, -1, -1));

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

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 150, 770, 90));

        statusError.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        statusError.setForeground(new java.awt.Color(255, 0, 0));
        statusError.setText("Status not found!");
        getContentPane().add(statusError, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 160, -1, 20));

        durationError.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        durationError.setForeground(new java.awt.Color(255, 0, 0));
        durationError.setText("Duration not found!");
        getContentPane().add(durationError, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 160, -1, 20));

        companyLabel.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        companyLabel.setForeground(new java.awt.Color(0, 0, 0));
        companyLabel.setText("Company");
        getContentPane().add(companyLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 20, -1, -1));

        companySearchField.setBackground(new java.awt.Color(255, 255, 255));
        companySearchField.setForeground(new java.awt.Color(0, 0, 0));
        getContentPane().add(companySearchField, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 20, 190, 30));

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
        getContentPane().add(companySearch, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 20, -1, -1));

        updateButton.setBackground(new java.awt.Color(255, 255, 255));
        updateButton.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        updateButton.setForeground(new java.awt.Color(0, 0, 0));
        updateButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Data/save-icon--1.png"))); // NOI18N
        updateButton.setText("Update");
        updateButton.setIconTextGap(12);
        updateButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                updateButtonActionPerformed(evt);
            }
        });
        getContentPane().add(updateButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 410, 190, 30));

        jLabel2.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 0, 0));
        jLabel2.setText("Status");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 310, -1, -1));

        jLabel3.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 0, 0));
        jLabel3.setText("Date Applied");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 360, -1, -1));

        jLabel4.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 0, 0));
        jLabel4.setText("Duration");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 410, 90, -1));

        jLabel5.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(0, 0, 0));
        jLabel5.setText("Company");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 460, -1, -1));

        jLabel6.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(0, 0, 0));
        jLabel6.setText("Contact Info");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 510, -1, -1));

        applicationTextField.setBackground(new java.awt.Color(255, 255, 255));
        applicationTextField.setFont(new java.awt.Font("Dialog", 1, 15)); // NOI18N
        applicationTextField.setForeground(new java.awt.Color(0, 0, 0));
        applicationTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                applicationTextFieldActionPerformed(evt);
            }
        });
        getContentPane().add(applicationTextField, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 260, 300, 30));

        dateAppliedTextField.setBackground(new java.awt.Color(255, 255, 255));
        dateAppliedTextField.setFont(new java.awt.Font("Dialog", 1, 15)); // NOI18N
        dateAppliedTextField.setForeground(new java.awt.Color(0, 0, 0));
        getContentPane().add(dateAppliedTextField, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 360, 300, 30));

        companyTextField.setBackground(new java.awt.Color(255, 255, 255));
        companyTextField.setFont(new java.awt.Font("Dialog", 1, 15)); // NOI18N
        companyTextField.setForeground(new java.awt.Color(0, 0, 0));
        companyTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                companyTextFieldActionPerformed(evt);
            }
        });
        getContentPane().add(companyTextField, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 460, 300, 30));

        contactInfoTextField.setBackground(new java.awt.Color(255, 255, 255));
        contactInfoTextField.setFont(new java.awt.Font("Dialog", 1, 15)); // NOI18N
        contactInfoTextField.setForeground(new java.awt.Color(0, 0, 0));
        contactInfoTextField.setPreferredSize(new java.awt.Dimension(87, 25));
        contactInfoTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                contactInfoTextFieldActionPerformed(evt);
            }
        });
        getContentPane().add(contactInfoTextField, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 510, 300, 30));

        statusComboBox.setBackground(new java.awt.Color(0, 0, 0));
        statusComboBox.setEditable(true);
        statusComboBox.setFont(new java.awt.Font("Dialog", 1, 15)); // NOI18N
        statusComboBox.setForeground(new java.awt.Color(255, 255, 255));
        statusComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Pending", "Rejected", "Ignored", "Interview", "Offer" }));
        statusComboBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                statusComboBoxActionPerformed(evt);
            }
        });
        getContentPane().add(statusComboBox, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 310, 300, 30));

        durationComboBox.setBackground(new java.awt.Color(0, 0, 0));
        durationComboBox.setEditable(true);
        durationComboBox.setFont(new java.awt.Font("Dialog", 1, 15)); // NOI18N
        durationComboBox.setForeground(new java.awt.Color(255, 255, 255));
        durationComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "4 months", "8 months", "12 months", "16 months", "Full time", "Indefinite", "Contract", "Seasonal" }));
        durationComboBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                durationComboBoxActionPerformed(evt);
            }
        });
        getContentPane().add(durationComboBox, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 410, 300, 30));

        jLabel11.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(0, 0, 0));
        jLabel11.setText("Application");
        getContentPane().add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 260, -1, -1));

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
        getContentPane().add(CloseButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 460, 190, 30));

        jLabel7.setForeground(new java.awt.Color(0, 0, 0));
        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Data/bluebackground.jpg"))); // NOI18N
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void statusSearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_statusSearchActionPerformed
        // TODO add your handling code here:
        helper.SearchApplications("status", statusSearchField.getText(), statusError, jTable1);
        helper.populateFields(applicationTextField, dateAppliedTextField, companyTextField, contactInfoTextField, statusComboBox, durationComboBox);
    }//GEN-LAST:event_statusSearchActionPerformed

    private void durationSearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_durationSearchActionPerformed
        // TODO add your handling code here:
        helper.SearchApplications("duration", durationSearchField.getText(), durationError, jTable1);
        helper.populateFields(applicationTextField, dateAppliedTextField, companyTextField, contactInfoTextField, statusComboBox, durationComboBox);
    }//GEN-LAST:event_durationSearchActionPerformed

    private void companySearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_companySearchActionPerformed
        // TODO add your handling code here:
        helper.SearchApplications("company", companySearchField.getText(), companyError, jTable1);
        helper.populateFields(applicationTextField, dateAppliedTextField, companyTextField, contactInfoTextField, statusComboBox, durationComboBox);
    }//GEN-LAST:event_companySearchActionPerformed

    private void updateButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_updateButtonActionPerformed
        // TODO add your handling code here:
        String application = applicationTextField.getText();
        String status = (String) statusComboBox.getSelectedItem();
        String dateApplied = dateAppliedTextField.getText();
        String company = companyTextField.getText();
        String duration = (String) durationComboBox.getSelectedItem();
        String contactInfo = contactInfoTextField.getText();

        helper.UpdateApplication(application, status, dateApplied, duration, company, contactInfo);
        setVisible(false);
        new UpdateApplication().setVisible(true);

    }//GEN-LAST:event_updateButtonActionPerformed

    private void applicationTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_applicationTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_applicationTextFieldActionPerformed

    private void contactInfoTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_contactInfoTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_contactInfoTextFieldActionPerformed

    private void statusComboBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_statusComboBoxActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_statusComboBoxActionPerformed

    private void durationComboBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_durationComboBoxActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_durationComboBoxActionPerformed

    private void companyTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_companyTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_companyTextFieldActionPerformed

    private void CloseButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CloseButtonActionPerformed
        // TODO add your handling code here:
        setVisible(false);
    }//GEN-LAST:event_CloseButtonActionPerformed

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
            java.util.logging.Logger.getLogger(UpdateApplication.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(UpdateApplication.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(UpdateApplication.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(UpdateApplication.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new UpdateApplication().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton CloseButton;
    private javax.swing.JTextField applicationTextField;
    private javax.swing.JLabel companyError;
    private javax.swing.JLabel companyLabel;
    private javax.swing.JButton companySearch;
    private javax.swing.JTextField companySearchField;
    private javax.swing.JTextField companyTextField;
    private javax.swing.JTextField contactInfoTextField;
    private javax.swing.JTextField dateAppliedTextField;
    private javax.swing.JComboBox<String> durationComboBox;
    private javax.swing.JLabel durationError;
    private javax.swing.JLabel durationLabel;
    private javax.swing.JButton durationSearch;
    private javax.swing.JTextField durationSearchField;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JComboBox<String> statusComboBox;
    private javax.swing.JLabel statusError;
    private javax.swing.JLabel statusLabel;
    private javax.swing.JButton statusSearch;
    private javax.swing.JTextField statusSearchField;
    private javax.swing.JButton updateButton;
    // End of variables declaration//GEN-END:variables
}
