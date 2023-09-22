/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package rentcar.layerd.view;

/**
 *
 * @author TOSHIBA
 */
public class ManageRentView extends javax.swing.JFrame {

    /**
     * Creates new form ManageRentView
     */
    public ManageRentView() {
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

        jPanel3 = new javax.swing.JPanel();
        upbutton = new javax.swing.JButton();
        allrentbutton = new javax.swing.JButton();
        addbutton = new javax.swing.JButton();
        returnbutton = new javax.swing.JButton();
        deletebutton = new javax.swing.JButton();
        overbutton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel3.setBackground(new java.awt.Color(204, 255, 204));

        upbutton.setBackground(new java.awt.Color(255, 153, 0));
        upbutton.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        upbutton.setText("Update  Rent");
        upbutton.setActionCommand("Manage Car");
        upbutton.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 153, 0)));
        upbutton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        upbutton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                upbuttonActionPerformed(evt);
            }
        });

        allrentbutton.setBackground(new java.awt.Color(255, 153, 0));
        allrentbutton.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        allrentbutton.setText("All Rentals");
        allrentbutton.setActionCommand("Manage Car");
        allrentbutton.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 153, 0)));
        allrentbutton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        allrentbutton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                allrentbuttonActionPerformed(evt);
            }
        });

        addbutton.setBackground(new java.awt.Color(255, 153, 0));
        addbutton.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        addbutton.setText("New  Rent");
        addbutton.setActionCommand("Manage Car");
        addbutton.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 153, 0)));
        addbutton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        addbutton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addbuttonActionPerformed(evt);
            }
        });

        returnbutton.setBackground(new java.awt.Color(255, 153, 0));
        returnbutton.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        returnbutton.setText("Car Return");
        returnbutton.setActionCommand("Manage Car");
        returnbutton.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 153, 0)));
        returnbutton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        returnbutton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                returnbuttonActionPerformed(evt);
            }
        });

        deletebutton.setBackground(new java.awt.Color(255, 153, 0));
        deletebutton.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        deletebutton.setText("Delete  Rent");
        deletebutton.setActionCommand("Manage Car");
        deletebutton.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 153, 0)));
        deletebutton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        deletebutton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deletebuttonActionPerformed(evt);
            }
        });

        overbutton.setBackground(new java.awt.Color(255, 153, 0));
        overbutton.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        overbutton.setText("Overdue  Rentals");
        overbutton.setActionCommand("Manage Car");
        overbutton.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 153, 0)));
        overbutton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        overbutton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                overbuttonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap(61, Short.MAX_VALUE)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(deletebutton, javax.swing.GroupLayout.DEFAULT_SIZE, 250, Short.MAX_VALUE)
                    .addComponent(addbutton, javax.swing.GroupLayout.DEFAULT_SIZE, 250, Short.MAX_VALUE)
                    .addComponent(overbutton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(57, 57, 57)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(upbutton, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(allrentbutton, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(returnbutton, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(86, 86, 86))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(73, 73, 73)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(addbutton, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(upbutton, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(222, 222, 222)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(returnbutton, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(overbutton, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 85, Short.MAX_VALUE)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(deletebutton, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(allrentbutton, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(301, 301, 301))))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void upbuttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_upbuttonActionPerformed
        dispose();
        new UpdateRentView().setVisible(rootPaneCheckingEnabled);
    }//GEN-LAST:event_upbuttonActionPerformed

    private void allrentbuttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_allrentbuttonActionPerformed
dispose();
        
        new AllRentView().setVisible(true);
    }//GEN-LAST:event_allrentbuttonActionPerformed

    private void addbuttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addbuttonActionPerformed
      dispose();
        new RentView().setVisible(true);
    }//GEN-LAST:event_addbuttonActionPerformed

    private void returnbuttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_returnbuttonActionPerformed
       dispose();
       new CarReturnView().setVisible(true);
    }//GEN-LAST:event_returnbuttonActionPerformed

    private void deletebuttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deletebuttonActionPerformed
        dispose();
        new DeleteRentView().setVisible(true);
    }//GEN-LAST:event_deletebuttonActionPerformed

    private void overbuttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_overbuttonActionPerformed
       dispose();
       new OverDueRentView().setVisible(true);
    }//GEN-LAST:event_overbuttonActionPerformed

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
            java.util.logging.Logger.getLogger(ManageRentView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ManageRentView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ManageRentView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ManageRentView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ManageRentView().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton addbutton;
    private javax.swing.JButton addrentbtn;
    private javax.swing.JButton addrentbtn1;
    private javax.swing.JButton allrentbtn;
    private javax.swing.JButton allrentbtn1;
    private javax.swing.JButton allrentbutton;
    private javax.swing.JButton deletebutton;
    private javax.swing.JButton deleterentbtn;
    private javax.swing.JButton deleterentbtn1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JButton overbutton;
    private javax.swing.JButton overduerentbtn;
    private javax.swing.JButton overduerentbtn1;
    private javax.swing.JButton returnbutton;
    private javax.swing.JButton returncarbtn;
    private javax.swing.JButton returncarbtn1;
    private javax.swing.JButton upbutton;
    private javax.swing.JButton updaterentbtn;
    private javax.swing.JButton updaterentbtn1;
    // End of variables declaration//GEN-END:variables
}
