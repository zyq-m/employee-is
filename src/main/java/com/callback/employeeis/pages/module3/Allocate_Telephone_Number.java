/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.callback.employeeis.pages.module3;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author Admin
 */
public class Allocate_Telephone_Number extends javax.swing.JFrame {

    /**
     * Creates new form TelephoneNumber
     */
    public Allocate_Telephone_Number() {
        initComponents();
        
    }

    public void bagiNum(){
        
        try {
            Connection conn = DriverManager.getConnection("jdbc:mysql://localhost/employee_is", "root", "");
            Statement p = conn.createStatement();
            ResultSet rr = p.executeQuery("select Max(EmployeeTelNum) from employee");
            rr.next();
            rr.getString("Max(EmployeeTelNum)");

            if(rr.getString("Max(EmployeeTelNum)") == null){
            xnum.setText("1234001");
            }else{
                    
                int no = Integer.parseInt(rr.getString("Max(EmployeeTelNum)"));
                no++;
                String noo = Integer.toString(no);
                xnum.setText(noo);
            
            
            }
            
            
            
            
            
            
        } catch (SQLException ex) {
            Logger.getLogger(Allocate_Telephone_Number.class.getName()).log(Level.SEVERE, null, ex);
        }
    
    
    }
    
    
    public void muaz(){
        
        //Update num phone
        try {
            String Tel = xnum.getText();
            int mz = Integer.parseInt(xid.getText());
            Connection conn = DriverManager.getConnection("jdbc:mysql://localhost/employee_is", "root", "");
            PreparedStatement ps = conn.prepareStatement("update employee set EmployeeTelNum=? where EmployeeID=?");
            ps.setString(1, Tel);
            ps.setInt(2, mz);
            int p = ps.executeUpdate();
            if(p==1){
                JOptionPane.showMessageDialog(null, "Update Successfully");
            } else {
                JOptionPane.showMessageDialog(null, "Update Not Successfully");
            }
                  
        
        
        
        
        } catch (SQLException ex) {
            Logger.getLogger(Allocate_Telephone_Number.class.getName()).log(Level.SEVERE, null, ex);
        }
            
           
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
        xid = new javax.swing.JTextField();
        xloc = new javax.swing.JTextField();
        xnam = new javax.swing.JTextField();
        xnum = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 204, 0));
        jPanel1.setForeground(new java.awt.Color(102, 102, 102));

        xid.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        xid.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                xidActionPerformed(evt);
            }
        });

        xloc.setEditable(false);
        xloc.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        xloc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                xlocActionPerformed(evt);
            }
        });

        xnam.setEditable(false);
        xnam.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        xnam.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                xnamActionPerformed(evt);
            }
        });

        xnum.setEditable(false);
        xnum.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        xnum.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                xnumActionPerformed(evt);
            }
        });

        jButton1.setBackground(new java.awt.Color(0, 0, 0));
        jButton1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jButton1.setForeground(new java.awt.Color(255, 204, 0));
        jButton1.setText("Back");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        jLabel1.setText("Employee Information System");
        jLabel1.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        jButton2.setBackground(new java.awt.Color(0, 0, 0));
        jButton2.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jButton2.setForeground(new java.awt.Color(255, 204, 0));
        jButton2.setText("Find");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel2.setText("Telephone Number Allocation");
        jLabel2.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel3.setText("Employee Id :");
        jLabel3.setHorizontalTextPosition(javax.swing.SwingConstants.LEADING);

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel4.setText("Location : ");

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel5.setText("Department Name : ");

        jLabel6.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel6.setText("Telephone Number : ");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(84, 84, 84)
                        .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(173, 173, 173)
                        .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(82, 82, 82))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(181, 181, 181)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jLabel5, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 176, Short.MAX_VALUE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(178, 178, 178)
                                .addComponent(jLabel6)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jButton1)
                                .addGap(48, 48, 48)))
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(xnam, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(xloc, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(xid, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(xnum, javax.swing.GroupLayout.PREFERRED_SIZE, 173, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addComponent(jButton2)
                                .addGap(0, 0, Short.MAX_VALUE)))
                        .addGap(57, 57, 57)))
                .addGap(106, 106, 106))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(53, 53, 53)
                .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 25, Short.MAX_VALUE)
                .addGap(58, 58, 58)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(xid)
                        .addGap(12, 12, 12)
                        .addComponent(xloc)
                        .addGap(12, 12, 12)
                        .addComponent(xnam)
                        .addGap(12, 12, 12)
                        .addComponent(xnum)))
                .addGap(57, 57, 57)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButton2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(55, 55, 55))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        Connection conn = null;
        try {

            String id = xid.getText();
            String location = xloc.getText();
            String dn = xnam.getText();
            String atn = xnum.getText();
            conn = DriverManager.getConnection("jdbc:mysql://localhost/employee_is", "root", "");
            PreparedStatement ps = conn.prepareStatement("select * from department as d inner join employee as e on d.DepartCode = e.EmployeeDepartCode where e.EmployeeID=?");
            ResultSet rs = null;
            ps.setInt(1,Integer.parseInt(id));
            rs = ps.executeQuery();
            if(rs.next()==true){
                xloc.setText(rs.getString("EmployeeLocation"));
                xnam.setText(rs.getString("DepartName"));
                xnum.setText(rs.getString("EmployeeTelNum"));

                if(xnum.getText().equals("") || xnum.getText().equals("0")){
                    int r = JOptionPane.showConfirmDialog(null, "Phone number not found, Do you want it?", "CONFIRM", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);
                    if(r==JOptionPane.YES_OPTION){
                        bagiNum();
                        muaz();
                        Telephone_Directory_Maintenance b=new Telephone_Directory_Maintenance();
                        b.show();
                        dispose();

                    }else if(r== JOptionPane.NO_OPTION){
                        Telephone_Directory_Maintenance b=new Telephone_Directory_Maintenance();
                        b.show();
                        dispose();
                    }
                }else {
                    int r = JOptionPane.showConfirmDialog(null, "Telephone number already put, want to change it?", "CONFIRM", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);
                    if (r==JOptionPane.YES_OPTION){
                        bagiNum();
                        muaz();
                        Telephone_Directory_Maintenance b=new Telephone_Directory_Maintenance();
                        b.show();
                        dispose();
                    } else if (r==JOptionPane.NO_OPTION){
                        Telephone_Directory_Maintenance b=new Telephone_Directory_Maintenance();
                        b.show();
                        dispose();
                    }

                }

            }else{JOptionPane.showMessageDialog(null, "Not Successful");

                Telephone_Directory_Maintenance b=new Telephone_Directory_Maintenance();
                b.show();
                dispose();
            }

        }
        catch (SQLException ex) {
            System.out.println("SQLException: " + ex.getMessage());
            System.out.println("SQLState: " + ex.getSQLState());
            System.out.println("VendorError: " + ex.getErrorCode());
        }
        //        java.awt.EventQueue.invokeLater(new Runnable() {
            //            public void run() {
                //                new Allocate_Telephone_Number().setVisible(true);
                //    }
            //        });
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        Telephone_Directory_Maintenance b=new Telephone_Directory_Maintenance();
        b.show();
        dispose();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void xnumActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_xnumActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_xnumActionPerformed

    private void xnamActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_xnamActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_xnamActionPerformed

    private void xlocActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_xlocActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_xlocActionPerformed

    private void xidActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_xidActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_xidActionPerformed

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
            java.util.logging.Logger.getLogger(Allocate_Telephone_Number.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Allocate_Telephone_Number.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Allocate_Telephone_Number.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Allocate_Telephone_Number.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Allocate_Telephone_Number().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField xid;
    private javax.swing.JTextField xloc;
    private javax.swing.JTextField xnam;
    private javax.swing.JTextField xnum;
    // End of variables declaration//GEN-END:variables
}
