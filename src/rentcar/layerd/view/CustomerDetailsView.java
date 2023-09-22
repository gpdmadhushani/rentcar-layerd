/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package rentcar.layerd.view;

import java.awt.Color;
import java.awt.event.FocusAdapter;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import rentcar.layerd.controller.CustomerController;
import rentcar.layerd.dto.CustomerDto;
import rentcar.layerd.dto.RentDto;



public class CustomerDetailsView extends javax.swing.JFrame {

    private CustomerController customerController;
  
    
    
    public CustomerDetailsView() {
       customerController=new CustomerController();
       
        initComponents();
        
                
          }
        
        
                

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        headerPanel = new javax.swing.JPanel();
        headerlabel = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        customerIdLabel = new javax.swing.JLabel();
        custIdtext = new javax.swing.JTextField();
        searchCustButton = new javax.swing.JButton();
        custpanel = new javax.swing.JPanel();
        customerTitleLabel = new javax.swing.JLabel();
        customercontactLabel = new javax.swing.JLabel();
        custnictext = new javax.swing.JTextField();
        customerNameLabel = new javax.swing.JLabel();
        custNametext = new javax.swing.JTextField();
        custgendertext = new javax.swing.JTextField();
        custAddresstext = new javax.swing.JTextField();
        custcontacttext = new javax.swing.JTextField();
        custgenderlabel = new javax.swing.JLabel();
        addCustButton = new javax.swing.JButton();
        deleteCustButton = new javax.swing.JButton();
        custtitletext = new javax.swing.JTextField();
        customerIdLabel1 = new javax.swing.JLabel();
        customerIdLabel2 = new javax.swing.JLabel();

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
                .addComponent(headerlabel, javax.swing.GroupLayout.DEFAULT_SIZE, 1499, Short.MAX_VALUE))
        );
        headerPanelLayout.setVerticalGroup(
            headerPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(headerPanelLayout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addComponent(headerlabel, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(45, Short.MAX_VALUE))
        );

        customerIdLabel.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        customerIdLabel.setText("Enter Customer ID");

        custIdtext.setBackground(new java.awt.Color(255, 204, 102));
        custIdtext.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        custIdtext.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 204, 102)));

        searchCustButton.setBackground(new java.awt.Color(255, 153, 0));
        searchCustButton.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        searchCustButton.setText("Search");
        searchCustButton.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 153, 0)));
        searchCustButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        searchCustButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                searchCustButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addComponent(customerIdLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 177, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(custIdtext, javax.swing.GroupLayout.PREFERRED_SIZE, 399, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(59, 59, 59)
                .addComponent(searchCustButton, javax.swing.GroupLayout.PREFERRED_SIZE, 183, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(customerIdLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(custIdtext, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(searchCustButton, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(15, Short.MAX_VALUE))
        );

        custpanel.setPreferredSize(new java.awt.Dimension(800, 400));
        custpanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        customerTitleLabel.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        customerTitleLabel.setText("Title");
        custpanel.add(customerTitleLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 180, 87, 30));

        customercontactLabel.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        customercontactLabel.setText("Contact");
        custpanel.add(customercontactLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 390, 110, 34));

        custnictext.setBackground(new java.awt.Color(255, 204, 102));
        custnictext.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        custnictext.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 204, 102)));
        custpanel.add(custnictext, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 30, 350, 40));

        customerNameLabel.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        customerNameLabel.setText(" Name");
        custpanel.add(customerNameLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 110, 81, 34));

        custNametext.setBackground(new java.awt.Color(255, 204, 102));
        custNametext.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        custNametext.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 204, 102)));
        custNametext.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                custNametextActionPerformed(evt);
            }
        });
        custpanel.add(custNametext, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 100, 736, 40));

        custgendertext.setBackground(new java.awt.Color(255, 204, 102));
        custgendertext.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        custgendertext.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 204, 102)));
        custpanel.add(custgendertext, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 240, 200, 40));

        custAddresstext.setBackground(new java.awt.Color(255, 204, 102));
        custAddresstext.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        custAddresstext.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 204, 102)));
        custpanel.add(custAddresstext, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 310, 640, 40));

        custcontacttext.setBackground(new java.awt.Color(255, 204, 102));
        custcontacttext.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        custcontacttext.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 204, 102)));
        custpanel.add(custcontacttext, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 390, 362, 40));

        custgenderlabel.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        custgenderlabel.setText("Gender");
        custpanel.add(custgenderlabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 240, 99, 35));

        addCustButton.setBackground(new java.awt.Color(255, 153, 0));
        addCustButton.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        addCustButton.setIcon(new javax.swing.ImageIcon("D:\\Projects\\LayerdArchitecture\\rentcar-layerd\\src\\images\\iconsave.png")); // NOI18N
        addCustButton.setText("ADD");
        addCustButton.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 153, 0)));
        addCustButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        addCustButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addCustButtonActionPerformed(evt);
            }
        });
        custpanel.add(addCustButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(730, 380, 150, -1));

        deleteCustButton.setBackground(new java.awt.Color(255, 153, 0));
        deleteCustButton.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        deleteCustButton.setIcon(new javax.swing.ImageIcon("D:\\Projects\\LayerdArchitecture\\rentcar-layerd\\src\\images\\iconback.png")); // NOI18N
        deleteCustButton.setText("Back");
        deleteCustButton.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 153, 0)));
        deleteCustButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        custpanel.add(deleteCustButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(910, 380, 160, 50));

        custtitletext.setBackground(new java.awt.Color(255, 204, 102));
        custtitletext.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        custtitletext.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 204, 102)));
        custpanel.add(custtitletext, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 170, 160, 40));

        customerIdLabel1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        customerIdLabel1.setText("NIC");
        custpanel.add(customerIdLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 40, 40, 34));

        customerIdLabel2.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        customerIdLabel2.setText("Address");
        custpanel.add(customerIdLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 320, 110, 34));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(headerPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(custpanel, javax.swing.GroupLayout.DEFAULT_SIZE, 1493, Short.MAX_VALUE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(headerPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(custpanel, javax.swing.GroupLayout.PREFERRED_SIZE, 492, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(153, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void searchCustButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_searchCustButtonActionPerformed
        try {
            
            loaddetails();
        } catch (Exception ex) {
            Logger.getLogger(CustomerDetailsView.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_searchCustButtonActionPerformed

    private void custNametextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_custNametextActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_custNametextActionPerformed

    private void addCustButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addCustButtonActionPerformed
       
        try {
            addtnic();
        } catch (Exception ex) {
            Logger.getLogger(CustomerDetailsView.class.getName()).log(Level.SEVERE, null, ex);
        }
       
    }//GEN-LAST:event_addCustButtonActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
      
       
            
           
       
       
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CustomerDetailsView().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton addCustButton;
    private javax.swing.JTextField custAddresstext;
    private javax.swing.JTextField custIdtext;
    private javax.swing.JTextField custNametext;
    private javax.swing.JTextField custcontacttext;
    private javax.swing.JLabel custgenderlabel;
    private javax.swing.JTextField custgendertext;
    private javax.swing.JTextField custnictext;
    private javax.swing.JLabel customerIdLabel;
    private javax.swing.JLabel customerIdLabel1;
    private javax.swing.JLabel customerIdLabel2;
    private javax.swing.JLabel customerNameLabel;
    private javax.swing.JLabel customerTitleLabel;
    private javax.swing.JLabel customercontactLabel;
    private javax.swing.JPanel custpanel;
    private javax.swing.JTextField custtitletext;
    private javax.swing.JButton deleteCustButton;
    private javax.swing.JPanel headerPanel;
    private javax.swing.JLabel headerlabel;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JButton searchCustButton;
    // End of variables declaration//GEN-END:variables

    public void loaddetails() throws Exception {
        
      
searchcustomer();
      setnic();
       
    }
    
    

    public String getcustid(){
        return custIdtext.getText();
    }
    
    
            
     public void searchcustomer() {
       
         try {
             
             
            String custId=custIdtext.getText();
            
            CustomerDto customerDto=customerController.getCustomer(custId);
    
            if(customerDto!=null){
                custnictext.setText(customerDto.getNic());
custNametext.setText(customerDto.getName());
custtitletext.setText(customerDto.getTitle());
        custgendertext.setText(customerDto.getGender());
        custAddresstext.setText(customerDto.getAddress());
        
       custcontacttext.setText(customerDto.getContact());
       
    

         }else{
                
                JOptionPane.showMessageDialog(this,"Customer Not Found");
                
                 }
        } catch (Exception ex) {
            Logger.getLogger(RentView.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(this, ex.getMessage());
        }
    }

    public void addtnic() throws Exception {
       
            String custId=custIdtext.getText();;
            
            CustomerDto customerDto=customerController.getCustomer(custId);
    
            if(customerDto!=null){
                
                
                 RentView.instance.txtid.setText(custId);
                 RentView.instance.txtnic.setText(customerDto.getNic());
         dispose();
                
               
    }else{
               
            }
        
    }            
             
 

    private void setnic() {
   
    }
    
   
}
