/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.callback.employeeis.components;

import java.awt.Component;
import javax.swing.JOptionPane;

/**
 *
 * @author HAZIQ
 */
public class Popup {

  public Popup() {
  }
  
  public static void setPopupError(Component component, String message) {
    JOptionPane.showMessageDialog(component, message, "Error",
            JOptionPane.ERROR_MESSAGE);
  }
  
  public static void setPopupInfo(Component component, String message) {
    JOptionPane.showMessageDialog(component, message, "Info",
            JOptionPane.INFORMATION_MESSAGE);
  }
  
  public static void setPopupWarning(Component component, String message) {
    JOptionPane.showMessageDialog(component, message, "Warning",
            JOptionPane.WARNING_MESSAGE);
  }
}
