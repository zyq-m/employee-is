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
    addDepartment = new javax.swing.JLabel();
    updateDeparment = new javax.swing.JLabel();

    setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
    setTitle("Department Menu");
    setPreferredSize(new java.awt.Dimension(649, 391));

    jLabel1.setText("Deparment Menu");

    addDepartment.setText("Add Department");
    addDepartment.addMouseListener(new java.awt.event.MouseAdapter() {
      public void mouseClicked(java.awt.event.MouseEvent evt) {
        addDepartmentMouseClicked(evt);
      }
    });

    updateDeparment.setText("Update Department");
    updateDeparment.addMouseListener(new java.awt.event.MouseAdapter() {
      public void mouseClicked(java.awt.event.MouseEvent evt) {
        updateDeparmentMouseClicked(evt);
      }
    });

    javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
    getContentPane().setLayout(layout);
    layout.setHorizontalGroup(
      layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
      .addGroup(layout.createSequentialGroup()
        .addGap(68, 68, 68)
        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
          .addComponent(updateDeparment)
          .addComponent(addDepartment)
          .addComponent(jLabel1))
        .addContainerGap(341, Short.MAX_VALUE))
    );
    layout.setVerticalGroup(
      layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
      .addGroup(layout.createSequentialGroup()
        .addGap(86, 86, 86)
        .addComponent(jLabel1)
        .addGap(18, 18, 18)
        .addComponent(addDepartment)
        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
        .addComponent(updateDeparment)
        .addContainerGap(174, Short.MAX_VALUE))
    );

    pack();
  }// </editor-fold>//GEN-END:initComponents

  private void addDepartmentMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_addDepartmentMouseClicked
    AddDepartment.run();
    setVisible(false);
  }//GEN-LAST:event_addDepartmentMouseClicked

  private void updateDeparmentMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_updateDeparmentMouseClicked
    UpdateDepartment.run();
    setVisible(false);
  }//GEN-LAST:event_updateDeparmentMouseClicked

  /**
   * @param args the command line arguments
   */
//  public static void main(String args[]) {
//    /* Set the Nimbus look and feel */
//    //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
//    /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
//         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
//     */
//    try {
//      for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
//        if ("Nimbus".equals(info.getName())) {
//          javax.swing.UIManager.setLookAndFeel(info.getClassName());
//          break;
//        }
//      }
//    } catch (ClassNotFoundException ex) {
//      java.util.logging.Logger.getLogger(DepartmentMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//    } catch (InstantiationException ex) {
//      java.util.logging.Logger.getLogger(DepartmentMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//    } catch (IllegalAccessException ex) {
//      java.util.logging.Logger.getLogger(DepartmentMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//    } catch (javax.swing.UnsupportedLookAndFeelException ex) {
//      java.util.logging.Logger.getLogger(DepartmentMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//    }
//    //</editor-fold>
//
//    /* Create and display the form */
//  }
   
  public static void run() {
    java.awt.EventQueue.invokeLater(() -> {
      new DepartmentMenu().setVisible(true);
    });
  }

  // Variables declaration - do not modify//GEN-BEGIN:variables
  private javax.swing.JLabel addDepartment;
  private javax.swing.JLabel jLabel1;
  private javax.swing.JLabel updateDeparment;
  // End of variables declaration//GEN-END:variables
}