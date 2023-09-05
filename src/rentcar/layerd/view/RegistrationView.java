/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package rentcar.layerd.view;

import java.awt.Image;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import rentcar.layerd.view.LoginView;
/**
 *
 * @author TOSHIBA
 */
public class RegistrationView extends javax.swing.JFrame {

    /**
     * Creates new form RegistrationView
     */
    public RegistrationView() {
        initComponents();
        
       
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        headerPanel = new javax.swing.JPanel();
        headerlabel = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        lastnamelabel = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        firstnametxt = new javax.swing.JTextField();
        firstnamelabel1 = new javax.swing.JLabel();
        emailtxt = new javax.swing.JTextField();
        genderlabel = new javax.swing.JLabel();
        lastnametxt1 = new javax.swing.JTextField();
        emaillabel1 = new javax.swing.JLabel();
        emailtxt1 = new javax.swing.JTextField();
        passwordlabel = new javax.swing.JLabel();
        usernametxt = new javax.swing.JTextField();
        usernamelabel = new javax.swing.JLabel();
        PasswordField = new javax.swing.JPasswordField();
        mobilelabel1 = new javax.swing.JLabel();
        genderComboBox = new javax.swing.JComboBox<>();
        confirmpasswordlabel = new javax.swing.JLabel();
        conPasswordField = new javax.swing.JPasswordField();
        titlelabel = new javax.swing.JLabel();
        genderComboBox1 = new javax.swing.JComboBox<>();
        btnback = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        headerPanel.setBackground(new java.awt.Color(0, 153, 102));

        headerlabel.setFont(new java.awt.Font("Segoe UI", 3, 48)); // NOI18N
        headerlabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        headerlabel.setText("CarHire");

        javax.swing.GroupLayout headerPanelLayout = new javax.swing.GroupLayout(headerPanel);
        headerPanel.setLayout(headerPanelLayout);
        headerPanelLayout.setHorizontalGroup(
            headerPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(headerPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(headerlabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        headerPanelLayout.setVerticalGroup(
            headerPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(headerPanelLayout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addComponent(headerlabel, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(25, Short.MAX_VALUE))
        );

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setPreferredSize(new java.awt.Dimension(1068, 560));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lastnamelabel.setFont(new java.awt.Font("Segoe UI", 1, 20)); // NOI18N
        lastnamelabel.setText("Last Name");
        jPanel1.add(lastnamelabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 150, -1, -1));

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel2.setText("Registration");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 20, 200, 50));

        firstnametxt.setBackground(new java.awt.Color(204, 204, 255));
        firstnametxt.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        firstnametxt.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
        firstnametxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                firstnametxtActionPerformed(evt);
            }
        });
        jPanel1.add(firstnametxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 160, 328, -1));

        firstnamelabel1.setFont(new java.awt.Font("Segoe UI", 1, 20)); // NOI18N
        firstnamelabel1.setText("First Name");
        jPanel1.add(firstnamelabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 150, 111, -1));

        emailtxt.setBackground(new java.awt.Color(204, 204, 255));
        emailtxt.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        emailtxt.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
        emailtxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                emailtxtActionPerformed(evt);
            }
        });
        jPanel1.add(emailtxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 210, 285, -1));

        genderlabel.setFont(new java.awt.Font("Segoe UI", 1, 20)); // NOI18N
        genderlabel.setText("Gender");
        jPanel1.add(genderlabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 260, 108, -1));

        lastnametxt1.setBackground(new java.awt.Color(204, 204, 255));
        lastnametxt1.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        lastnametxt1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
        lastnametxt1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                lastnametxt1ActionPerformed(evt);
            }
        });
        jPanel1.add(lastnametxt1, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 150, 388, -1));

        emaillabel1.setFont(new java.awt.Font("Segoe UI", 1, 20)); // NOI18N
        emaillabel1.setText("Email");
        jPanel1.add(emaillabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 200, 132, -1));

        emailtxt1.setBackground(new java.awt.Color(204, 204, 255));
        emailtxt1.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        emailtxt1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
        emailtxt1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                emailtxt1ActionPerformed(evt);
            }
        });
        jPanel1.add(emailtxt1, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 210, 328, -1));

        passwordlabel.setFont(new java.awt.Font("Segoe UI", 1, 20)); // NOI18N
        passwordlabel.setText("Password");
        jPanel1.add(passwordlabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 400, 105, -1));

        usernametxt.setBackground(new java.awt.Color(204, 204, 255));
        usernametxt.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        usernametxt.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
        usernametxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                usernametxtActionPerformed(evt);
            }
        });
        jPanel1.add(usernametxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 330, 426, -1));

        usernamelabel.setFont(new java.awt.Font("Segoe UI", 1, 20)); // NOI18N
        usernamelabel.setText("User Name");
        jPanel1.add(usernamelabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 330, 132, -1));

        PasswordField.setBackground(new java.awt.Color(204, 204, 255));
        PasswordField.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
        PasswordField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PasswordFieldActionPerformed(evt);
            }
        });
        jPanel1.add(PasswordField, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 410, 294, 30));

        mobilelabel1.setFont(new java.awt.Font("Segoe UI", 1, 20)); // NOI18N
        mobilelabel1.setText("Mobile");
        jPanel1.add(mobilelabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 210, 79, -1));

        genderComboBox.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        genderComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Mr", "Mrs", "Miss" }));
        genderComboBox.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
        genderComboBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                genderComboBoxActionPerformed(evt);
            }
        });
        jPanel1.add(genderComboBox, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 100, 152, 34));

        confirmpasswordlabel.setFont(new java.awt.Font("Segoe UI", 1, 20)); // NOI18N
        confirmpasswordlabel.setText("Confirm Password");
        jPanel1.add(confirmpasswordlabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 480, -1, -1));

        conPasswordField.setBackground(new java.awt.Color(204, 204, 255));
        conPasswordField.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
        conPasswordField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                conPasswordFieldActionPerformed(evt);
            }
        });
        jPanel1.add(conPasswordField, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 480, 294, 30));

        titlelabel.setFont(new java.awt.Font("Segoe UI", 1, 20)); // NOI18N
        titlelabel.setText("Title");
        jPanel1.add(titlelabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 100, 111, -1));

        genderComboBox1.setBackground(new java.awt.Color(204, 204, 255));
        genderComboBox1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        genderComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Male", "Female" }));
        genderComboBox1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
        jPanel1.add(genderComboBox1, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 270, 152, 34));

        btnback.setBackground(new java.awt.Color(0, 153, 102));
        btnback.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        btnback.setText("<<Back");
        btnback.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(102, 102, 255)));
        btnback.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnback.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnbackActionPerformed(evt);
            }
        });
        jPanel1.add(btnback, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 480, 160, 40));
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(28, 17, 149, 22));

        jButton2.setBackground(new java.awt.Color(0, 153, 102));
        jButton2.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jButton2.setText("Register");
        jButton2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(102, 102, 255)));
        jButton2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jPanel1.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(870, 480, 160, 40));

        jLabel3.setIcon(new javax.swing.ImageIcon("D:\\Projects\\LayerdArchitecture\\rentcar-layerd\\src\\images\\log17.jpg")); // NOI18N
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1070, 560));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(headerPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(headerPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void emailtxt1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_emailtxt1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_emailtxt1ActionPerformed

    private void emailtxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_emailtxtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_emailtxtActionPerformed

    private void usernametxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_usernametxtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_usernametxtActionPerformed

    private void PasswordFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PasswordFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_PasswordFieldActionPerformed

    private void conPasswordFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_conPasswordFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_conPasswordFieldActionPerformed

    private void firstnametxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_firstnametxtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_firstnametxtActionPerformed

    private void lastnametxt1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_lastnametxt1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_lastnametxt1ActionPerformed

    private void genderComboBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_genderComboBoxActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_genderComboBoxActionPerformed

    private void btnbackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnbackActionPerformed
dispose();
new LoginView().setVisible(true);
        // TODO add your handling code here:
    }//GEN-LAST:event_btnbackActionPerformed

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
            java.util.logging.Logger.getLogger(RegistrationView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(RegistrationView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(RegistrationView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(RegistrationView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new RegistrationView().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPasswordField PasswordField;
    private javax.swing.JButton btnback;
    private javax.swing.JPasswordField conPasswordField;
    private javax.swing.JLabel confirmpasswordlabel;
    private javax.swing.JLabel emaillabel1;
    private javax.swing.JTextField emailtxt;
    private javax.swing.JTextField emailtxt1;
    private javax.swing.JLabel firstnamelabel1;
    private javax.swing.JTextField firstnametxt;
    private javax.swing.JComboBox<String> genderComboBox;
    private javax.swing.JComboBox<String> genderComboBox1;
    private javax.swing.JLabel genderlabel;
    private javax.swing.JPanel headerPanel;
    private javax.swing.JLabel headerlabel;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel lastnamelabel;
    private javax.swing.JTextField lastnametxt1;
    private javax.swing.JLabel mobilelabel1;
    private javax.swing.JLabel passwordlabel;
    private javax.swing.JLabel titlelabel;
    private javax.swing.JLabel usernamelabel;
    private javax.swing.JTextField usernametxt;
    // End of variables declaration//GEN-END:variables
}
