/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package rentcar.layerd.view;

import java.awt.Image;
import java.security.MessageDigest;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import rentcar.layerd.controller.UserController;
import rentcar.layerd.view.LoginView;
import rentcar.layerd.dto.UserDto;
/**
 *
 * @author TOSHIBA
 */
public class RegistrationView extends javax.swing.JFrame {
private UserController userController;
    /**
     * Creates new form RegistrationView
     */
    public RegistrationView() {
        userController=new UserController();
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
        useridtext = new javax.swing.JTextField();
        firstnamelabel1 = new javax.swing.JLabel();
        mobiletxt = new javax.swing.JTextField();
        genderlabel = new javax.swing.JLabel();
        lastnametxt = new javax.swing.JTextField();
        emaillabel1 = new javax.swing.JLabel();
        emailtxt = new javax.swing.JTextField();
        passwordlabel = new javax.swing.JLabel();
        usernametxt = new javax.swing.JTextField();
        usernamelabel = new javax.swing.JLabel();
        PasswordField = new javax.swing.JPasswordField();
        mobilelabel1 = new javax.swing.JLabel();
        titleComboBox = new javax.swing.JComboBox<>();
        confirmpasswordlabel = new javax.swing.JLabel();
        conPasswordField = new javax.swing.JPasswordField();
        titlelabel = new javax.swing.JLabel();
        genderComboBox = new javax.swing.JComboBox<>();
        btnback = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        titlelabel1 = new javax.swing.JLabel();
        firstnametxt = new javax.swing.JTextField();
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
                .addComponent(headerlabel, javax.swing.GroupLayout.DEFAULT_SIZE, 1078, Short.MAX_VALUE)
                .addContainerGap())
        );
        headerPanelLayout.setVerticalGroup(
            headerPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(headerPanelLayout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addComponent(headerlabel, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 9, Short.MAX_VALUE))
        );

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setPreferredSize(new java.awt.Dimension(1068, 560));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lastnamelabel.setFont(new java.awt.Font("Segoe UI", 1, 20)); // NOI18N
        lastnamelabel.setText("Last Name");
        jPanel1.add(lastnamelabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 160, -1, -1));

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 30)); // NOI18N
        jLabel2.setText("Registration");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 20, 200, 50));

        useridtext.setBackground(new java.awt.Color(255, 204, 102));
        useridtext.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        useridtext.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 204, 102)));
        useridtext.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                useridtextActionPerformed(evt);
            }
        });
        jPanel1.add(useridtext, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 100, 328, 40));

        firstnamelabel1.setFont(new java.awt.Font("Segoe UI", 1, 20)); // NOI18N
        firstnamelabel1.setText("First Name");
        jPanel1.add(firstnamelabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 160, 111, -1));

        mobiletxt.setBackground(new java.awt.Color(255, 204, 102));
        mobiletxt.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        mobiletxt.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 204, 102)));
        mobiletxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mobiletxtActionPerformed(evt);
            }
        });
        jPanel1.add(mobiletxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 220, 285, 40));

        genderlabel.setFont(new java.awt.Font("Segoe UI", 1, 20)); // NOI18N
        genderlabel.setText("Gender");
        jPanel1.add(genderlabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 290, 108, -1));

        lastnametxt.setBackground(new java.awt.Color(255, 204, 102));
        lastnametxt.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        lastnametxt.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 204, 102)));
        lastnametxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                lastnametxtActionPerformed(evt);
            }
        });
        jPanel1.add(lastnametxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 160, 380, 40));

        emaillabel1.setFont(new java.awt.Font("Segoe UI", 1, 20)); // NOI18N
        emaillabel1.setText("Email");
        jPanel1.add(emaillabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 220, 132, -1));

        emailtxt.setBackground(new java.awt.Color(255, 204, 102));
        emailtxt.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        emailtxt.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 204, 102)));
        emailtxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                emailtxtActionPerformed(evt);
            }
        });
        jPanel1.add(emailtxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 220, 328, 40));

        passwordlabel.setFont(new java.awt.Font("Segoe UI", 1, 20)); // NOI18N
        passwordlabel.setText("Password");
        jPanel1.add(passwordlabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 420, 105, -1));

        usernametxt.setBackground(new java.awt.Color(255, 204, 102));
        usernametxt.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        usernametxt.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 204, 102)));
        usernametxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                usernametxtActionPerformed(evt);
            }
        });
        jPanel1.add(usernametxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 350, 426, 40));

        usernamelabel.setFont(new java.awt.Font("Segoe UI", 1, 20)); // NOI18N
        usernamelabel.setText("User Name");
        jPanel1.add(usernamelabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 360, 132, -1));

        PasswordField.setBackground(new java.awt.Color(255, 204, 102));
        PasswordField.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        PasswordField.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 204, 102)));
        PasswordField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PasswordFieldActionPerformed(evt);
            }
        });
        jPanel1.add(PasswordField, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 410, 294, 40));

        mobilelabel1.setFont(new java.awt.Font("Segoe UI", 1, 20)); // NOI18N
        mobilelabel1.setText("Mobile");
        jPanel1.add(mobilelabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 230, 79, -1));

        titleComboBox.setBackground(new java.awt.Color(255, 204, 102));
        titleComboBox.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        titleComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Mr", "Mrs", "Miss" }));
        titleComboBox.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 204, 102)));
        titleComboBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                titleComboBoxActionPerformed(evt);
            }
        });
        jPanel1.add(titleComboBox, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 100, 152, 40));

        confirmpasswordlabel.setFont(new java.awt.Font("Segoe UI", 1, 20)); // NOI18N
        confirmpasswordlabel.setText("Confirm Password");
        jPanel1.add(confirmpasswordlabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 420, -1, -1));

        conPasswordField.setBackground(new java.awt.Color(255, 204, 102));
        conPasswordField.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        conPasswordField.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 204, 102)));
        conPasswordField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                conPasswordFieldActionPerformed(evt);
            }
        });
        jPanel1.add(conPasswordField, new org.netbeans.lib.awtextra.AbsoluteConstraints(760, 410, 294, 40));

        titlelabel.setFont(new java.awt.Font("Segoe UI", 1, 20)); // NOI18N
        titlelabel.setText("User ID");
        jPanel1.add(titlelabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 100, 111, -1));

        genderComboBox.setBackground(new java.awt.Color(255, 204, 102));
        genderComboBox.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        genderComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Male", "Female" }));
        genderComboBox.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 204, 102)));
        jPanel1.add(genderComboBox, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 290, 152, 40));

        btnback.setBackground(new java.awt.Color(255, 153, 0));
        btnback.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        btnback.setIcon(new javax.swing.ImageIcon("D:\\Projects\\LayerdArchitecture\\rentcar-layerd\\src\\images\\iconback.png")); // NOI18N
        btnback.setText("Back");
        btnback.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 153, 0)));
        btnback.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnback.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnbackActionPerformed(evt);
            }
        });
        jPanel1.add(btnback, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 480, 170, 50));
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(28, 17, 149, 22));

        jButton2.setBackground(new java.awt.Color(255, 153, 0));
        jButton2.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jButton2.setIcon(new javax.swing.ImageIcon("D:\\Projects\\LayerdArchitecture\\rentcar-layerd\\src\\images\\iconsave.png")); // NOI18N
        jButton2.setText("Save");
        jButton2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 153, 0)));
        jButton2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(830, 480, 200, 50));

        titlelabel1.setFont(new java.awt.Font("Segoe UI", 1, 20)); // NOI18N
        titlelabel1.setText("Title");
        jPanel1.add(titlelabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 110, 111, -1));

        firstnametxt.setBackground(new java.awt.Color(255, 204, 102));
        firstnametxt.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        firstnametxt.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 204, 102)));
        firstnametxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                firstnametxtActionPerformed(evt);
            }
        });
        jPanel1.add(firstnametxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 160, 328, 40));

        jLabel3.setIcon(new javax.swing.ImageIcon("D:\\Projects\\LayerdArchitecture\\rentcar-layerd\\src\\images\\log9.jpg")); // NOI18N
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1090, 580));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(headerPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(headerPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 579, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void emailtxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_emailtxtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_emailtxtActionPerformed

    private void mobiletxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mobiletxtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_mobiletxtActionPerformed

    private void usernametxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_usernametxtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_usernametxtActionPerformed

    private void PasswordFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PasswordFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_PasswordFieldActionPerformed

    private void conPasswordFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_conPasswordFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_conPasswordFieldActionPerformed

    private void useridtextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_useridtextActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_useridtextActionPerformed

    private void lastnametxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_lastnametxtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_lastnametxtActionPerformed

    private void titleComboBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_titleComboBoxActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_titleComboBoxActionPerformed

    private void btnbackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnbackActionPerformed
dispose();
new LoginView().setVisible(true);
        // TODO add your handling code here:
    }//GEN-LAST:event_btnbackActionPerformed

    private void firstnametxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_firstnametxtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_firstnametxtActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
    try {
        adduser();
    } catch (Exception ex) {
        Logger.getLogger(RegistrationView.class.getName()).log(Level.SEVERE, null, ex);
    }
    }//GEN-LAST:event_jButton2ActionPerformed

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
    private javax.swing.JLabel firstnamelabel1;
    private javax.swing.JTextField firstnametxt;
    private javax.swing.JComboBox<String> genderComboBox;
    private javax.swing.JLabel genderlabel;
    private javax.swing.JPanel headerPanel;
    private javax.swing.JLabel headerlabel;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel lastnamelabel;
    private javax.swing.JTextField lastnametxt;
    private javax.swing.JLabel mobilelabel1;
    private javax.swing.JTextField mobiletxt;
    private javax.swing.JLabel passwordlabel;
    private javax.swing.JComboBox<String> titleComboBox;
    private javax.swing.JLabel titlelabel;
    private javax.swing.JLabel titlelabel1;
    private javax.swing.JTextField useridtext;
    private javax.swing.JLabel usernamelabel;
    private javax.swing.JTextField usernametxt;
    // End of variables declaration//GEN-END:variables

    private void clear(){
    useridtext.setText("");
    titleComboBox.setSelectedItem("Mr");
     firstnametxt.setText("");
     lastnametxt.setText("");
     emailtxt.setText("");      
       mobiletxt.setText("");     
    genderComboBox.setSelectedItem("Male");
usernametxt.setText("");
            conPasswordField.setText("");
            PasswordField.setText("");
            
            }
    
    
    
    
    
    private void adduser() throws Exception {
         UserDto userDto=new UserDto(useridtext.getText(), titleComboBox.getSelectedItem().toString(), firstnametxt.getText(), lastnametxt.getText(), emailtxt.getText(), mobiletxt.getText(), genderComboBox.getSelectedItem().toString(), usernametxt.getText(), md5(conPasswordField.getPassword()));
    
    String result=userController.addUser(userDto);
    JOptionPane.showMessageDialog(this, result);
    clear();
    }
    
    private String md5(char [] c){
        try{
            
        
        MessageDigest digs=MessageDigest.getInstance("MD5");
        digs.update(new String (c).getBytes("UTF8"));
       String str= new String(digs.digest());
        
        return str;
        }catch(Exception ex){
           return ""; 
        }   
        
    }
}
