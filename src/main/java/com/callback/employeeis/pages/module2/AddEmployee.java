/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.callback.employeeis.pages.module2;

import java.awt.Color;
import java.awt.event.KeyEvent;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.sql.*;
import java.sql.PreparedStatement;
import java.sql.DriverManager;
import java.sql.Statement;
import java.sql.ResultSet;
import javax.swing.JOptionPane;

/**
 *
 * @author Admin
 */
public class AddEmployee extends javax.swing.JFrame {
    Connection con = null;
    PreparedStatement pst = null;
    
    /**
     * Creates new form AddEmployee
     */
    public AddEmployee() {
        initComponents();
        Connect();
        
        //drop down menu items
        String query = "select departcode from department";
        try {
            Statement statement = con.createStatement();
            ResultSet rs = statement.executeQuery(query);
            while(rs.next()){
                String code = rs.getString("departCode");
                departcodelist.addItem(code);
            }

        } catch (SQLException ex) {
            Logger.getLogger(AddEmployee.class.getName()).log(Level.SEVERE, null, ex);
        }
        
       
    }

    
        private void Connect(){
            try {
//                Class.forName("com.mysql.jdbc.Driver");
                con = DriverManager.getConnection("jdbc:mysql://localhost/employee_is","root","");
            } catch (SQLException ex) {
                Logger.getLogger(AddEmployee.class.getName()).log(Level.SEVERE, null, ex);
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
    jLabel12 = new javax.swing.JLabel();
    jLabel4 = new javax.swing.JLabel();
    departcodelist = new javax.swing.JComboBox<>();
    jLabel10 = new javax.swing.JLabel();
    empdesignation = new javax.swing.JComboBox<>();
    departname = new javax.swing.JLabel();
    designationname = new javax.swing.JLabel();
    jTextField6 = new javax.swing.JTextField();
    jLabel2 = new javax.swing.JLabel();
    jLabel6 = new javax.swing.JLabel();
    empname = new javax.swing.JTextField();
    jLabel1 = new javax.swing.JLabel();
    jLabel7 = new javax.swing.JLabel();
    jButton1 = new javax.swing.JButton();
    jButton2 = new javax.swing.JButton();
    departcodemsg = new javax.swing.JLabel();
    namemsg = new javax.swing.JLabel();
    designationmsg = new javax.swing.JLabel();

    setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

    jPanel1.setBackground(new java.awt.Color(255, 204, 0));

    jLabel4.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
    jLabel4.setText("Department Code :");

    departcodelist.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Select" }));
    departcodelist.addActionListener(new java.awt.event.ActionListener() {
      public void actionPerformed(java.awt.event.ActionEvent evt) {
        departcodelistActionPerformed(evt);
      }
    });

    jLabel10.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
    jLabel10.setText("Designation :");

    empdesignation.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Select", "O", "C", "E" }));
    empdesignation.addActionListener(new java.awt.event.ActionListener() {
      public void actionPerformed(java.awt.event.ActionEvent evt) {
        empdesignationActionPerformed(evt);
      }
    });

    departname.setText("   ");

    jLabel2.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
    jLabel2.setText("Employee Name :");

    jLabel6.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
    jLabel6.setText("Location :");

    empname.addActionListener(new java.awt.event.ActionListener() {
      public void actionPerformed(java.awt.event.ActionEvent evt) {
        empnameActionPerformed(evt);
      }
    });
    empname.addKeyListener(new java.awt.event.KeyAdapter() {
      public void keyPressed(java.awt.event.KeyEvent evt) {
        empnameKeyPressed(evt);
      }
    });

    jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
    jLabel1.setText("Add Employee");

    jLabel7.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
    jLabel7.setText("Employee Management System");

    jButton1.setBackground(new java.awt.Color(0, 153, 0));
    jButton1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
    jButton1.setForeground(new java.awt.Color(255, 255, 255));
    jButton1.setText("Save");
    jButton1.addActionListener(new java.awt.event.ActionListener() {
      public void actionPerformed(java.awt.event.ActionEvent evt) {
        jButton1ActionPerformed(evt);
      }
    });

    jButton2.setBackground(new java.awt.Color(255, 51, 0));
    jButton2.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
    jButton2.setForeground(new java.awt.Color(255, 255, 255));
    jButton2.setText("Cancel");
    jButton2.addActionListener(new java.awt.event.ActionListener() {
      public void actionPerformed(java.awt.event.ActionEvent evt) {
        jButton2ActionPerformed(evt);
      }
    });

    javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
    jPanel1.setLayout(jPanel1Layout);
    jPanel1Layout.setHorizontalGroup(
      jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
      .addGroup(jPanel1Layout.createSequentialGroup()
        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
          .addGroup(jPanel1Layout.createSequentialGroup()
            .addGap(226, 226, 226)
            .addComponent(jLabel1))
          .addGroup(jPanel1Layout.createSequentialGroup()
            .addGap(103, 103, 103)
            .addComponent(jLabel7))
          .addGroup(jPanel1Layout.createSequentialGroup()
            .addGap(202, 202, 202)
            .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
            .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE))
          .addGroup(jPanel1Layout.createSequentialGroup()
            .addGap(81, 81, 81)
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
              .addComponent(jLabel2)
              .addComponent(jLabel6)
              .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)
              .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGap(74, 74, 74)
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
              .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(empdesignation, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(designationname, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE))
              .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(departcodelist, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(departname, javax.swing.GroupLayout.PREFERRED_SIZE, 182, javax.swing.GroupLayout.PREFERRED_SIZE))
              .addComponent(jTextField6, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
              .addComponent(empname, javax.swing.GroupLayout.PREFERRED_SIZE, 173, javax.swing.GroupLayout.PREFERRED_SIZE)
              .addComponent(departcodemsg, javax.swing.GroupLayout.PREFERRED_SIZE, 195, javax.swing.GroupLayout.PREFERRED_SIZE)
              .addComponent(designationmsg, javax.swing.GroupLayout.PREFERRED_SIZE, 195, javax.swing.GroupLayout.PREFERRED_SIZE)
              .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 256, javax.swing.GroupLayout.PREFERRED_SIZE)
              .addComponent(namemsg, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        .addContainerGap(20, Short.MAX_VALUE))
    );
    jPanel1Layout.setVerticalGroup(
      jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
      .addGroup(jPanel1Layout.createSequentialGroup()
        .addGap(24, 24, 24)
        .addComponent(jLabel7)
        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
        .addComponent(jLabel1)
        .addGap(45, 45, 45)
        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
          .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
              .addComponent(empname, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
              .addComponent(jLabel2))
            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
            .addComponent(namemsg, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
              .addComponent(departcodelist, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
              .addComponent(departname, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
            .addComponent(departcodemsg, javax.swing.GroupLayout.PREFERRED_SIZE, 18, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
              .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                  .addComponent(jTextField6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                  .addComponent(jLabel6))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                  .addComponent(empdesignation, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                  .addComponent(jLabel10)))
              .addComponent(designationname, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)))
          .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
            .addComponent(jLabel4)
            .addGap(106, 106, 106)))
        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 30, Short.MAX_VALUE)
        .addComponent(designationmsg, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
          .addComponent(jButton2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
          .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
        .addGap(34, 34, 34))
    );

    javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
    getContentPane().setLayout(layout);
    layout.setHorizontalGroup(
      layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
      .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
    );
    layout.setVerticalGroup(
      layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
      .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
    );

    pack();
  }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
             
            try {
                String Name = empname.getText();
                String Location = jTextField6.getText();
                String DepartCode = departcodelist.getSelectedItem().toString();
                String Designation = empdesignation.getSelectedItem().toString();

                
                boolean namecheck, Locationcheck, DepartCodecheck, dsigncheck;
                namecheck = Locationcheck = DepartCodecheck = dsigncheck = false;
                
//                Class.forName("com.mysql.jdbc.Driver");
//                con=DriverManager.getConnection("jdbc:mysql://localhost:3307/employee","root","");
                pst=con.prepareStatement("insert into employee(EmployeeName,EmployeeDepartCode,EmployeeLocation,EmployeeDesignation)values(?,?,?,?)");
                pst.setString(1,Name);
                pst.setString(2, DepartCode);
                pst.setString(3,Location);
                pst.setString(4, Designation);
                                       
                if (Name.isBlank()){
                    namemsg.setText("Please enter the employee's name.");
                    namemsg.setForeground(Color.RED);
                } else if (Name.length() < 3){
                    namemsg.setText("Name must have at least 3 characters.");
                    namemsg.setForeground(Color.RED);
                } else if (Name.length() > 25){
                    namemsg.setText("Name cannot exceed 25 characters.");
                    namemsg.setForeground(Color.RED);
                } else if (!Character.isUpperCase(Name.charAt(0)) ){
                    namemsg.setText("First character must be in upper case.");
                    namemsg.setForeground(Color.RED);
                } else {
                    namecheck = true;
                    namemsg.setText("");
                }
                
                
                if (DepartCode.equals("Select")){
                    departcodemsg.setText("Please select a department code.");
                    departcodemsg.setForeground(Color.red);
                } else {
                    DepartCodecheck = true;
                    departcodemsg.setText("");
                }
                
                
                if (Location.isBlank()){
                    jLabel12.setText("Please enter a location.");
                    jLabel12.setForeground(Color.red);
                } else if (Location.length() < 3){
                    jLabel12.setText("Location name must have at least 3 characters.");
                    jLabel12.setForeground(Color.red);
                } else if (Location.length() > 5){
                    jLabel12.setText("Location name cannot exceed 5 characters.");
                    jLabel12.setForeground(Color.red);
                }
                else {
                    Locationcheck = true;
                    jLabel12.setText("");
                }
                
               
                if (Designation.equals("Select")){
                    designationmsg.setText("Please select a designation.");
                    designationmsg.setForeground(Color.red);
                } else {
                    dsigncheck = true;
                    designationmsg.setText("");
                }
                
            
            if (namecheck && DepartCodecheck && Locationcheck && dsigncheck){

                String query1 = "insert into employee (EmployeeName, "
                            + "EmployeeDepartCode, EmployeeLocation,"
                            + "EmployeeDesignation) value (?, ?, ?, ?)";

                   
                    try {
                        pst = con.prepareStatement(query1);
                        pst.setString(1,Name);
                        pst.setString(2, DepartCode);
                        pst.setString(3,Location);
                        pst.setString(4, Designation);
                        
                        pst.executeUpdate();
                        JOptionPane.showMessageDialog(rootPane, "Employee Successfully Added!");
                        //id++;

                        EmployeeMenu page = new EmployeeMenu();
                        page.setVisible(true);
                        setVisible(false);
                        } catch (SQLException ex) {
                            Logger.getLogger(AddEmployee.class.getName()).log(Level.SEVERE, null, ex);
                        }

                    } 
                    else {JOptionPane.showMessageDialog(rootPane, "Registration Unsuccessful.\n"
                            + "Check the field message for more info.");
                }
            }catch (SQLException ex) {
             Logger.getLogger(AddEmployee.class.getName()).log(Level.SEVERE, null, ex);
            }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        EmployeeMenu b=new EmployeeMenu();
        b.show();
        dispose();
    }//GEN-LAST:event_jButton2ActionPerformed

    private void departcodelistActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_departcodelistActionPerformed
        
        try {
            String query="SELECT DepartName FROM department WHERE DepartCode ='"
            + departcodelist.getSelectedItem().toString() + "'";
            PreparedStatement statement =con.prepareStatement(query);
            ResultSet rs = statement.executeQuery(query);
            if(rs.next()){
                departname.setText("Deparment: " + rs.getString("DepartName"));

            }else{
                departname.setText("");
            }

        }catch(SQLException e) {
            JOptionPane.showMessageDialog(this, e.getMessage());
        }
    }//GEN-LAST:event_departcodelistActionPerformed

    private void empdesignationActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_empdesignationActionPerformed
        
        switch (empdesignation.getSelectedItem().toString()) {
            case "O" -> designationname.setText("Position: HR Officer");
            case "C" -> designationname.setText("Position: HR Clear");
            case "E" -> designationname.setText("Position: Employee");
            default -> { designationname.setText("");
            }
        }
    }//GEN-LAST:event_empdesignationActionPerformed

    private void empnameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_empnameActionPerformed
//        // TODO add your handling code here:     
    }//GEN-LAST:event_empnameActionPerformed

    private void empnameKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_empnameKeyPressed

        char key = evt.getKeyChar(); 
        int check = evt.getKeyCode(); 
        
        
        if (Character.isDigit(key) || (key != '\'' && key != '.' && key != ' ' 
                && !Character.isLetter(key) && check != KeyEvent.VK_BACK_SPACE))
        { 
            empname.setEditable(false);
            namemsg.setText("Alphabets and \" . \" and \" ' \" only.");
            namemsg.setForeground(Color.RED);
        } else {
            empname.setEditable(true);
             namemsg.setText("");
        }
    }//GEN-LAST:event_empnameKeyPressed

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
            java.util.logging.Logger.getLogger(AddEmployee.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AddEmployee.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AddEmployee.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AddEmployee.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AddEmployee().setVisible(true);
            }
        });
    }

  // Variables declaration - do not modify//GEN-BEGIN:variables
  private javax.swing.JComboBox<String> departcodelist;
  private javax.swing.JLabel departcodemsg;
  private javax.swing.JLabel departname;
  private javax.swing.JLabel designationmsg;
  private javax.swing.JLabel designationname;
  private javax.swing.JComboBox<String> empdesignation;
  private javax.swing.JTextField empname;
  private javax.swing.JButton jButton1;
  private javax.swing.JButton jButton2;
  private javax.swing.JLabel jLabel1;
  private javax.swing.JLabel jLabel10;
  private javax.swing.JLabel jLabel12;
  private javax.swing.JLabel jLabel2;
  private javax.swing.JLabel jLabel4;
  private javax.swing.JLabel jLabel6;
  private javax.swing.JLabel jLabel7;
  private javax.swing.JPanel jPanel1;
  private javax.swing.JTextField jTextField6;
  private javax.swing.JLabel namemsg;
  // End of variables declaration//GEN-END:variables
}
