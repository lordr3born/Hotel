package GUI.System;/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import Application.LoginController;

import java.sql.SQLException;

/**
 *
 * @author LPNielsen
 */
public class LoginGUI extends javax.swing.JFrame {
    private int count = 0;
    private LoginController logincontroller;
    private SystemGUI systemgui;
    /**
     * Creates new form LoginGUI
     */

    public LoginGUI(LoginController lc, SystemGUI sg) {
        initComponents();
        this.logincontroller = lc;
        this.systemgui = sg;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        loginUsername = new javax.swing.JTextField();
        loginPassword = new javax.swing.JPasswordField();
        loginButtonLogin = new javax.swing.JButton();
        loginButtonCancel = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Login");

        jLabel1.setText("Username:");

        jLabel2.setText("Password:");

        loginUsername.setText("Username");
        loginUsername.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                loginUsernameFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                loginUsernameFocusLost(evt);
            }
        });

        loginPassword.setText("Password");
        loginPassword.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                loginPasswordFocusGained(evt);
            }
        });

        loginButtonLogin.setText("Login");
        loginButtonLogin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                try {
                    loginButtonLoginActionPerformed(evt);
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }
        });

        loginButtonCancel.setText("Cancel");
        loginButtonCancel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                loginButtonCancelActionPerformed(evt);
            }
        });

        jLabel3.setIcon(new javax.swing.ImageIcon("C:\\Users\\LPNielsen\\Google Drive\\new Netbeans\\NetBeansProjects\\Project\\login.png")); // NOI18N

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 252, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.TRAILING))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(loginButtonCancel)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(loginButtonLogin))
                    .addComponent(loginUsername, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(loginPassword, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(51, 51, 51))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(loginUsername, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(26, 26, 26)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(loginPassword, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(40, 40, 40)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(loginButtonLogin)
                    .addComponent(loginButtonCancel))
                .addGap(105, 105, 105))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, 332, Short.MAX_VALUE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void loginButtonLoginActionPerformed(java.awt.event.ActionEvent evt) throws SQLException {//GEN-FIRST:event_loginButtonLoginActionPerformed
        if (logincontroller.verifyLogin(loginUsername,loginPassword)){
            systemgui = new SystemGUI();
            switch (logincontroller.getUserLevel()){
                case "Administrator":
                    systemgui.adminView();
                    break;
                case "Staff":
                    systemgui.empView();
                    break;

            }
            systemgui.setVisible(true);
            this.dispose();
        }
    }//GEN-LAST:event_loginButtonLoginActionPerformed

    private void loginButtonCancelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_loginButtonCancelActionPerformed
        // TODO add your handling code here:
        System.exit(0);
    }//GEN-LAST:event_loginButtonCancelActionPerformed

    private void loginUsernameFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_loginUsernameFocusGained
        // TODO add your handling code here:
        if (loginUsername.getText().equals("Username")){
            loginUsername.setText("");
        }
    }//GEN-LAST:event_loginUsernameFocusGained

    private void loginUsernameFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_loginUsernameFocusLost
        // TODO add your handling code here:
        if (loginUsername.getText().isEmpty()){
            loginUsername.setText("Username");
        }
    }//GEN-LAST:event_loginUsernameFocusLost

    private void loginPasswordFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_loginPasswordFocusGained
        // TODO add your handling code here:
        if (count == 0){
            loginPassword.setText("");
            count++;
        }
    }//GEN-LAST:event_loginPasswordFocusGained

    public static boolean testPassword(char[] input){
        boolean isCorrect = true;
        char[] correctPassword = { '1', '2', '3', '4' };

        if (input.length != correctPassword.length) {
            isCorrect = false;
        } else {
            for (int i = 0; i < input.length; i++) {
                if (input[i] != correctPassword[i]) {
                    isCorrect = false;
                }
            }
        }

        //Zero out the password.
        for (int i = 0; i < correctPassword.length; i++) {
            correctPassword[i] = 0;
        }
        return isCorrect;
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JButton loginButtonCancel;
    private javax.swing.JButton loginButtonLogin;
    private javax.swing.JPasswordField loginPassword;
    private javax.swing.JTextField loginUsername;
    // End of variables declaration//GEN-END:variables
}
