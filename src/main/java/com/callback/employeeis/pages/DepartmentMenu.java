/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.callback.employeeis.pages;

/**
 *
 * @author HAZIQ
 */
public class DepartmentMenu extends javax.swing.JFrame {
  private final AddDepartment addMenu = new AddDepartment();
  private final UpdateDepartment updateMenu = new UpdateDepartment();
  
  /**
   * Creates new form DepartmentMenu
   */
  public DepartmentMenu() {
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

    jLabel1 = new javax.swing.JLabel();
    updateDepartment = new javax.swing.JButton();
    addDepartment = new javax.swing.JButton();

    setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
    setTitle("Department Menu");
    setPreferredSize(new java.awt.Dimension(649, 391));

    jLabel1.setText("Deparment Menu");

    updateDepartment.setText("Update Department");
    updateDepartment.addActionListener(new java.awt.event.ActionListener() {
      public void actionPerformed(java.awt.event.ActionEvent evt) {
        updateDepartmentActionPerformed(evt);
      }
    });

    addDepartment.setText("Add Department");
    addDepartment.addActionListener(new java.awt.event.ActionListener() {
      public void actionPerformed(java.awt.event.ActionEvent evt) {
        addDepartmentActionPerformed(evt);
      }
    });

    javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
    getContentPane().setLayout(layout);
    layout.setHorizontalGroup(
      layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
      .addGroup(layout.createSequentialGroup()
        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
          .addGroup(layout.createSequentialGroup()
            .addGap(183, 183, 183)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
              .addComponent(updateDepartment, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
              .addComponent(addDepartment, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
          .addGroup(layout.createSequentialGroup()
            .addGap(202, 202, 202)
            .addComponent(jLabel1)))
        .addContainerGap(196, Short.MAX_VALUE))
    );
    layout.setVerticalGroup(
      layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
      .addGroup(layout.createSequentialGroup()
        .addContainerGap(78, Short.MAX_VALUE)
        .addComponent(jLabel1)
        .addGap(27, 27, 27)
        .addComponent(addDepartment)
        .addGap(18, 18, 18)
        .addComponent(updateDepartment)
        .addGap(149, 149, 149))
    );

    pack();
  }// </editor-fold>//GEN-END:initComponents

  private void updateDepartmentActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_updateDepartmentActionPerformed
    updateDepartment.show();
    dispose();
  }//GEN-LAST:event_updateDepartmentActionPerformed

  private void addDepartmentActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addDepartmentActionPerformed
    addMenu.show();
    dispose();
  }//GEN-LAST:event_addDepartmentActionPerformed

  // Variables declaration - do not modify//GEN-BEGIN:variables
  private javax.swing.JButton addDepartment;
  private javax.swing.JLabel jLabel1;
  private javax.swing.JButton updateDepartment;
  // End of variables declaration//GEN-END:variables
}
